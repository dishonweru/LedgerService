import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.microsoft.schemas._2003._10.serialization.*;

import org.datacontract.schemas._2004._07.cmc_campuslink_client_businessentities.*;
import org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages.*;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.*;
import org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.ObjectFactory;

import com.campusmgmt.soa.foundation.messagedefinition.*;

public class KUPostLedger {
	static KULedgerService service = new KULedgerService();
	static PostLedger pledger = new PostLedger();
	static IKULedgerService IService = service.getBasicHttp();
	static KUPostLedgerRequest request = new KUPostLedgerRequest();
	static KUPostLedgerResponse response = new KUPostLedgerResponse();
	static KUPostLedgerInMsg InMsg = null;
	static KUPostLedgerOutMsg OutMsg = new KUPostLedgerOutMsg();
	static VerifyStudentInMsg VSInMsg = new VerifyStudentInMsg();
	static VerifyStudentOutMsg VSOutMsg = new VerifyStudentOutMsg();
	static ArrayOfKUPostLedgerInMsg InMessageArray = new ArrayOfKUPostLedgerInMsg();
	static ArrayOfKUPostLedgerOutMsg OutMessageArray = new ArrayOfKUPostLedgerOutMsg();
	static ArrayOfVerifyStudentInMsg VSInMessageArray = new ArrayOfVerifyStudentInMsg();
	static ArrayOfVerifyStudentOutMsg VSOutMessageArray = new ArrayOfVerifyStudentOutMsg();

	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	static ObjectFactory objfact = new ObjectFactory();
	static org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages.ObjectFactory msgStateObj = new org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages.ObjectFactory();

	public static ArrayOfKUPostLedgerInMsg preparePayMessage() {
		String context = "org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf";
		String sql = "SELECT reference_nr,account_id,amount,date_received,inst_account_id,msisdn,narration FROM bill_payment WHERE state = '98'";
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		format.setTimeZone(TimeZone.getTimeZone("GMT+3"));

		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				// create object factory to prepare data types for the message
				// fields	
				InMsg = new KUPostLedgerInMsg();

				JAXBElement<String> billref = objfact
						.createKUPostLedgerInMsgBillReferenceNumber(rs
								.getString("account_id"));
				InMsg.setBillReferenceNumber(billref);

				JAXBElement<String> txnref = objfact
						.createKUPostLedgerInMsgBankTransactionReference(rs
								.getString("reference_nr"));
				InMsg.setBankTransactionReference(txnref);

				JAXBElement<String> chq = objfact
						.createKUPostLedgerInMsgChequeNumber("");
				InMsg.setChequeNumber(chq);

				JAXBElement<String> accno = objfact
						.createKUPostLedgerInMsgAccountNumber(rs
								.getString("inst_account_id"));
				InMsg.setAccountNumber(accno);

				JAXBElement<String> phone = objfact
						.createKUPostLedgerInMsgPhoneNumber(rs
								.getString("msisdn"));
				InMsg.setPhoneNumber(phone);

				JAXBElement<String> channel = objfact
						.createKUPostLedgerInMsgChannel(rs
								.getString("narration"));
				InMsg.setChannel(channel);
				

				BigDecimal amount = new BigDecimal(rs.getString("amount"));
				InMsg.setAmount(amount);

				try {
					Date today = new Date();
					Date date = format.parse(rs.getString("date_received"));	
					System.out.println(date);
					GregorianCalendar gc = new GregorianCalendar();
					gc.setTime(date);
					XMLGregorianCalendar trnDate = DatatypeFactory
							.newInstance().newXMLGregorianCalendar(gc);
					//System.out.println(trnDate);
					trnDate.toXMLFormat();
					InMsg.setDatePaid(trnDate);
					InMsg.setValueDate(trnDate);
					InMsg.setCorrelationId(0);
					
					JAXBElement<String> msg_state = msgStateObj.createGenericInMsgMessageState("");
					
					JAXBElement<CustomAttributeMsg> custom_attribs = msgStateObj.createCustomAttributeMsg(null);
					JAXBElement<ArrayOfCustomAttributeMsg> custom_attribs_arr = msgStateObj.createArrayOfCustomAttributeMsg(null);
					JAXBElement<String> attrb_name  = msgStateObj.createCustomAttributeMsgName(null);
					JAXBElement<String> attrb_value  = msgStateObj.createCustomAttributeMsgValue(null);
					InMsg.setCustomAttributes(custom_attribs_arr);
					
					InMsg.setMessageState(msg_state);
					
					InMsg.setServiceMessageId(0);

					System.out.println(InMsg.getAmount());

				} catch (Exception dt) {
					dt.printStackTrace();
				}

				InMsg.setIsNationalID(Boolean.FALSE);
				
				//InMsg.setServiceMessageId(0);
				//InMsg.setCorrelationId(1);
				// Add created message to the array of messages and repeat
				// process
				// if more payments available in resultset
				InMessageArray.getKUPostLedgerInMsg().add(InMsg);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		// return the created array of messages to the calling funtion
		System.out.println(InMessageArray.getKUPostLedgerInMsg().subList(0, 2));
		return InMessageArray;

	}

	public static void processInPayments() {
		try {
			SecurityService securityservice = new SecurityService();
			RequestMessageSource msgsrc = null;
			// create object factory to prepare the array of messages for the
			// request object.

			JAXBElement<ArrayOfKUPostLedgerInMsg> mess = objfact
					.createArrayOfKUPostLedgerInMsg(preparePayMessage());
			request.setKUPostLedgerInMsg(mess);

			org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages.ObjectFactory tokenobj = new org.datacontract.schemas._2004._07.cmc_campuslink_wcf_messages.ObjectFactory();

			JAXBElement<String> token = tokenobj.createGenericRequestTokenId(SecurityService.response[0]);
			request.setTokenId(token);
			

			request.setServiceRequestId(0);
			request.setSource(RequestMessageSource.EXTERNAL_SERVICE);
			JAXBElement<KUPostLedgerRequest> req = objfact.createKUPostLedgerRequest(request);
			
			JAXBContext context = JAXBContext.newInstance(KUPostLedgerRequest.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(req, System.out);
			pledger.setRequest(req);
			response = IService.postLedger(request);
			
			
			JAXBElement<KUPostLedgerResponse>  xmlresp = objfact.createKUPostLedgerResponse(response);
			System.out.println(response.getKUPostLedgerOutMsg());
			JAXBContext ctx = JAXBContext.newInstance(KUPostLedgerResponse.class);
			Marshaller rsp = ctx.createMarshaller();
			rsp.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			rsp.marshal(xmlresp, System.out);
			// conn.close();
			// System.out.println("Connection Closed successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void processResponse() {
		try {
			org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.ObjectFactory rspObj = new org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf.ObjectFactory();
			//OutMessageArray = rspObj.createArrayOfKUPostLedgerOutMsg(response.getKUPostLedgerOutMsg().getValue());
			System.out.println("Marshalling Result");
			JAXBContext ctx = null;
			try{
				ctx = JAXBContext.newInstance("org.datacontract.schemas._2004._07.cmc_integration_kenyatta_wcf");
				Marshaller marshaller = ctx.createMarshaller();
				marshaller.marshal(response.getKUPostLedgerOutMsg(), System.out);
				
			}catch(Exception e){
				e.printStackTrace();
			}
			//System.out.println(response.getKUPostLedgerOutMsg().toString());
			System.out.println(response.getTokenId().getValue().toString());
		
			//test block
			/*while (response.getKUPostLedgerOutMsg().getValue()
					.getKUPostLedgerOutMsg().iterator().hasNext()) {
				OutMessageArray = response.getKUPostLedgerOutMsg().getValue();
				System.out.println(OutMessageArray.getKUPostLedgerOutMsg()
						.listIterator().next().getBillReferenceNumber()
						.getValue().toString());
			}*/
			
			//OutMessageArray = response.getKUPostLedgerOutMsg().getValue();
			System.out.println(response.getKUPostLedgerOutMsg().getValue());

			for (int i = 0; i <= (OutMessageArray.getKUPostLedgerOutMsg()
					.size()) - 1; i++) {
				OutMsg = OutMessageArray.getKUPostLedgerOutMsg().get(i);
				if (OutMsg.getStatus().toString() == "OK") {
					String sql = "UPDATE bill_payment SET state = 99, ledger_ref_nr = '"
							+ OutMsg.getLedgerReferenceNumber().toString()
							+ "' WHERE  reference_nr = '"
							+ OutMsg.getBankTransactionReference().toString()
							+ "'";
					pstmt = conn.prepareStatement(sql);
					pstmt.executeUpdate();
					System.out.println("Transaction"
							+ OutMsg.getLedgerReferenceNumber().toString()
							+ "Posted Successfully");
					conn.close();
				} else {
					System.out.println("The Following Error Ocurred:"
							+ OutMsg.getErrorDescription() + "Error Code:"
							+ OutMsg.getMessageErrorCode().toString()
							+ "For Transaction Ref:"
							+ OutMsg.getBankTransactionReference().toString());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void DBConn() {
		
		//sql server connection 
		/*try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager
					.getConnection("jdbc:sqlserver://localhost:1433;databaseName=emconnect;user=sa;password=fanhansa");

			System.out.println("Connection  Created  Successfully!!");

		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		//postgre sql connection
		
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager
					.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres","postgres");

			System.out.println("Connection  Created  Successfully!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConn();
		processInPayments();
		processResponse();
	}

}

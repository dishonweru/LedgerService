import com.campusmgmt.soa.foundation.*;
import com.campusmgmt.soa.foundation.messagedefinition.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SecurityService {
	static Authentication authentication = new Authentication();
	static AuthenticationSoap IAuthentication = authentication
			.getAuthenticationSoap();
	static TokenRequest tokenrequest = new TokenRequest();
	static TokenResponse tokenresponse = new TokenResponse();
	static RequestHeader requestheader = new RequestHeader();
	static ResponseHeader responseheader = new ResponseHeader();
	static ArrayOfAnyType array = null;
	static String[] login = null;
	static String[] response = new String[3];
	
	public SecurityService(){
		setCredentials();
		getToken(login[0], login[1]);
		System.out.println(response[0]);
	}

	public static void setCredentials() {
		int counter = 0;
		try {
			String filepath = new File("").getAbsolutePath();
			FileInputStream fis = new FileInputStream(filepath
					+"\\"+ "src"+"\\"+"login.txt");
			Scanner scanner = new Scanner(fis);
			//System.out.println(filepath);
			login = new String[4];

			while (scanner.hasNextLine()) {				
				login[counter] = scanner.nextLine();
				counter++;
			}
			//System.out.println(login[0]);
			//System.out.println(login[1]);
		} catch (FileNotFoundException fex) {
			fex.printStackTrace();
		}
	}

	public static String[] getToken(String userId, String password) {

		tokenrequest.setMessageState("");
		tokenrequest.setPassword(password);
		tokenrequest.setSignature("");
		tokenrequest.setStaffId(0);
		tokenrequest.setTokenNeverExpires(true);
		tokenrequest.setUserName(userId);
		try {
			tokenresponse = IAuthentication.getAuthorizationToken(tokenrequest);
			response[0] = tokenresponse.getTokenId();
			response[1] = tokenresponse.getTrxResult();
			response[2] = tokenresponse.getStatus().toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;

	}

	private static void getLogs() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setCredentials();
		try {
			response = getToken(login[0], login[1]);
			System.out.println(response[0]);
			System.out.println(response[1]);
			System.out.println(response[2]);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}

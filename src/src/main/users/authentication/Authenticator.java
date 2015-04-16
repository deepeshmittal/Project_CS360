package src.main.users.authentication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Authenticator {

	private static String users_file =  File.separator + "resources" + File.separator + "registered_users";
	
	private static Authenticator authenticator;
	
	private Authenticator() {
		
	}
	
	public static Authenticator getInstance() {
		if(authenticator==null) {
			authenticator = new Authenticator();
		}
		return authenticator;
	}
	
	public static boolean authenticate(String user, String pass) throws IOException {
		boolean auth = false;
		
		File file = new File(users_file);
	   BufferedReader bfr = new BufferedReader(new FileReader(file));
	   String line;
	   while((line=bfr.readLine())!=null) {
		   String[] lineArr = line.split("|");
		   String uname = lineArr[5];
		   String passwd = lineArr[6];
		   if(uname.equalsIgnoreCase(user) && pass.equals(passwd)) {
			   auth = true;
		   }
		   
	   }
		
		return auth;
	}
	
}

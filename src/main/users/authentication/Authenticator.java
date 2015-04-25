package main.users.authentication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import main.users.user.Patient;
import main.users.user.RegisteredUser;

public class Authenticator {

	private static String users_file ;
	
	private static Authenticator authenticator;
	
	private Authenticator() {
		
	}
	
	public static Authenticator getInstance(String path) {
		if(authenticator==null) {
			authenticator = new Authenticator();
			users_file = path;
		}
		return authenticator;
	}
	
	public RegisteredUser authenticate(String userName, String pass) throws IOException {
		
		File file = new File(users_file);
	   BufferedReader bfr = new BufferedReader(new FileReader(file));
	   String line;
	   RegisteredUser user=null;
	   while((line=bfr.readLine())!=null) {
		   String[] lineArr = line.split("\\|");
		   String uname = lineArr[5];
		   String passwd = lineArr[6];
		   if(uname.equalsIgnoreCase(userName) && pass.equals(passwd)) {
			   
			   user = new RegisteredUser();
			   user.setAddress(lineArr[3]);
			   user.setAge(Integer.parseInt(lineArr[7]));
			   user.setContactNumber(lineArr[4]);
			   user.setFirstName(lineArr[0]);
			   user.setLastName(lineArr[1]);
			   user.setGender(lineArr[2]);
			   user.setRegisteredMail(uname);
			   user.setUser_type(lineArr[8]);
			   
			   break;
		   }
		   
	   }
	   
	   bfr.close();
		
	return user;
	}
	
}

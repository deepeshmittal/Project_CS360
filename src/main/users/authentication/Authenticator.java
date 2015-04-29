package main.users.authentication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import main.users.user.Doctor;
import main.users.user.Patient;
import main.users.user.RegisteredUser;

public class Authenticator {

	private static String users_file;
	
	private static String fileName="registered_users";
	
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
		
	   File file = new File(users_file+fileName);
	   BufferedReader bfr = new BufferedReader(new FileReader(file));
	   String line;
	   RegisteredUser user = null;
	   while((line=bfr.readLine())!=null && !"".equals(line)) {
		   String[] lineArr = line.split("\\|");
		   String uname = lineArr[5];
		   String passwd = lineArr[6];
		   if(uname.equalsIgnoreCase(userName) && pass.equals(passwd)) {
			   
			   String usertype = lineArr[8];
			   
			   if(usertype.equalsIgnoreCase("P")){
									
				   String AssignDoc = PatientDAO.getInstance(users_file).getAssignedDoc(uname); 
				   
				   Patient patient = new Patient();
				   patient.setAddress(lineArr[3]);
				   patient.setAge(Integer.parseInt(lineArr[7]));
				   patient.setContactNumber(lineArr[4]);
				   patient.setFirstName(lineArr[0]);
				   patient.setLastName(lineArr[1]);
				   patient.setGender(lineArr[2]);
				   patient.setRegisteredMail(uname);
				   patient.setUser_type(lineArr[8]);
				   patient.setAssigned_doctor(AssignDoc);
				   user = patient;				   
			   }
			   
			   else {
				   Doctor doctor = new Doctor();
				 
				   doctor.setAddress(lineArr[3]);
				   doctor.setAge(Integer.parseInt(lineArr[7]));
				   doctor.setContactNumber(lineArr[4]);
				   doctor.setFirstName(lineArr[0]);
				   doctor.setLastName(lineArr[1]);
				   doctor.setGender(lineArr[2]);
				   doctor.setRegisteredMail(uname);
				   doctor.setUser_type(lineArr[8]);
				   
				   user = doctor;
			   }
			   
			   break;
		   }
		   
	   }
	   bfr.close();
	   return user;
	}
	
}

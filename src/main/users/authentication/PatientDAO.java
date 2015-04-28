package main.users.authentication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PatientDAO {

	private static String users_file ;
	private static String fileName="Patient";
	private static PatientDAO patientDAO;
	
	public static PatientDAO getInstance(String path) {
		if(patientDAO==null) {
			patientDAO = new PatientDAO();
			users_file = path;
		}
		return patientDAO;
	}
	
	public String getAssignedDoc(String patient_mail) throws IOException {
		   
		   File file = new File(users_file+fileName);
		   BufferedReader bfr = new BufferedReader(new FileReader(file));
		   String line;
		   String assignDoc = null;
		   
		   while((line=bfr.readLine())!=null) {
			   String[] lineArr = line.split("\\|");
			   String patientmail = lineArr[0];
			   
		   if(patient_mail.equalsIgnoreCase(patientmail)){
				   assignDoc = lineArr[1];
			   }
		}
		   bfr.close();
		   return assignDoc;
	}	
}

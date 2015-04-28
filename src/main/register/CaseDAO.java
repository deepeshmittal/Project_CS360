package main.register;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import main.users.user.MedicalCase;
import main.users.user.RegisteredUser;

public class CaseDAO {
	
	 static String path; 
	 
	 private static CaseDAO caseDao;
	 
	 
	 private CaseDAO(){}
	 
	 public static CaseDAO getInstance(String p) {
		 if(caseDao==null) {
			 path = p;
			 caseDao = new CaseDAO();
		 }
		 
		 return caseDao;
	 }
	 
	 public boolean registerCase(MedicalCase mCase) throws IOException {
		 
		 FileOutputStream f = new FileOutputStream(path,true);
		 
		 BufferedWriter bfr = new BufferedWriter(new OutputStreamWriter(f,"UTF-8"));
		 
		 bfr.newLine();
		 bfr.append(mCase.getCaseNumber()+"|"+mCase.getPatientEmail()+"|"+mCase.getDoctorEmail()+"|"+mCase.getDisease()+"|"+mCase.getSeverityLevel()+"|"+mCase.getDateCreated()+"|"+mCase.getDateResolution()+"|"+mCase.getCaseStatus()+"|"+mCase.getActualSeverity()+"|"+mCase.getComment()+"|"+mCase.getDocPrescription()+"|");
		 bfr.flush();
		 bfr.close();
		 
		 return true;
	 }
	 
	 public int calculateActualSeverity(String patientEmail, String disease) throws IOException{
		 int calseverity = 0;
		 double prevseverity[] = {0};
		 int i=0;
		 double mean = 0;
		 double variance = 0;
		 
		 File file = new File(path);
		 BufferedReader bfr = new BufferedReader(new FileReader(file));
		 String line;
			    
		 while((line=bfr.readLine())!=null && !"".equals(line)) {
		   String[] lineArr = line.split("\\|");
		   String patient_email = lineArr[1];
		   String calDisease = lineArr[3];
		   	
		   	if(patient_email.equalsIgnoreCase(patientEmail) && calDisease.equalsIgnoreCase(disease)) {
		   		
		   		prevseverity[i] = Integer.parseInt(lineArr[4]);
		   		i = i+1;		 
		   	}
		 }
		 
		 for(i = 0; i < prevseverity.length; i++){
		    mean += prevseverity[i];
		 }
		 
		 mean /= prevseverity.length ;
		 
		 for(i = 0; i < prevseverity.length; i++){
			 prevseverity[i] = Math.pow((prevseverity[i]-mean),2);
			}
		 
		 for(i = 0; i < prevseverity.length; i++){
			 	variance += prevseverity[i];
			 }
		 
		 calseverity = (int)Math.sqrt(variance);
		 
		 bfr.close();
		 return calseverity;
	 }
	 
	 public List<MedicalCase> fetchCasesFromDB(List<MedicalCase> caseList ,RegisteredUser user) throws IOException {
		 
		 String usermail = user.getRegisteredMail();
		 File file = new File(path);
		 BufferedReader bfr = new BufferedReader(new FileReader(file));
		 String line;
		 
		 if (user.getUser_type().equalsIgnoreCase("P"))	 {
			    
			   while((line=bfr.readLine())!=null && !"".equals(line)) {
				   String[] lineArr = line.split("\\|");
				   String patient_email = lineArr[1];
				   
				   if(patient_email.equalsIgnoreCase(usermail)) {
					   MedicalCase readcase = new MedicalCase();
					   
					   readcase.setCaseNumber(Integer.parseInt(lineArr[0]));
					   readcase.setPatientEmail(lineArr[1]);
					   readcase.setDoctorEmail(lineArr[2]);
					   readcase.setDisease(lineArr[3]);
					   readcase.setSeverityLevel(Integer.parseInt(lineArr[4]));
					   readcase.setDateCreated(lineArr[5]);
					   readcase.setDateResolution(lineArr[6]);
					   readcase.setCaseStatus(lineArr[7]);
					   readcase.setActualSeverity(Integer.parseInt(lineArr[8]));
					   readcase.setComment(lineArr[9]);
					   readcase.setDocPrescription(lineArr[10]);
					   
					   caseList.add(readcase);
				    }
		   	  }
		 }
		 else if (user.getUser_type().equalsIgnoreCase("D")){
			 
			 while((line=bfr.readLine())!=null && !"".equals(line)) {
				   String[] lineArr = line.split("\\|");
				   String doctor_email = lineArr[2];
				   
				   if(doctor_email.equalsIgnoreCase(usermail)) {
					   MedicalCase readcase = new MedicalCase();
					   
					   readcase.setCaseNumber(Integer.parseInt(lineArr[0]));
					   readcase.setPatientEmail(lineArr[1]);
					   readcase.setDoctorEmail(lineArr[2]);
					   readcase.setDisease(lineArr[3]);
					   readcase.setSeverityLevel(Integer.parseInt(lineArr[4]));
					   readcase.setDateCreated(lineArr[5]);
					   readcase.setDateResolution(lineArr[6]);
					   readcase.setCaseStatus(lineArr[7]);
					   readcase.setActualSeverity(Integer.parseInt(lineArr[8]));
					   readcase.setComment(lineArr[9]);
					   readcase.setDocPrescription(lineArr[10]);
					   
					   caseList.add(readcase);
				    }
		   	  }
		 }
		 
		 bfr.close();
		 return caseList;
	}

}



	 
package main.register;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import main.users.user.MedicalCase;

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
		 bfr.append(mCase.getCaseNumber()+"|"+mCase.getPatientEmail()+"|"+mCase.getDisease()+"|"+mCase.getActualSeverity()+"|"+mCase.getDateCreated()+"|"+mCase.getCaseStatus());
		 bfr.flush();
		 bfr.close();
		 
		 return true;
	 }

}

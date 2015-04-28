package main.newuser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import main.users.user.Patient;

public class NewuserDAO {

	 static String path1;
	 static String path2;
	 
	 private static NewuserDAO newuserDAO;
	 
	 
	 private NewuserDAO(){}
	 
	 public static NewuserDAO getInstance(String p1,String p2) {
		 if(newuserDAO==null) {
			 path1 = p1;
			 path2 = p2;
			 newuserDAO = new NewuserDAO();
		 }
		 
		 return newuserDAO;
	 }
	
	 public String fetchDocEmail(String docfname, String doclname) throws IOException{
		 String docEmail = null;
		 
		 File file = new File(path1);
		 BufferedReader bfr = new BufferedReader(new FileReader(file));
		 String line;
		 
		 while((line=bfr.readLine())!=null && !"".equals(line)) {
		   String[] lineArr = line.split("\\|");
		   String dbFname = lineArr[0];
		   String dbLname = lineArr[1];
		   
		   if( (dbFname.equalsIgnoreCase(docfname)) && (dbLname.equalsIgnoreCase(doclname)) ){
			   docEmail = lineArr[5];
			   break;
		   }
		 }
		 bfr.close();
		 return docEmail;
	 }
	 
	 public boolean enterData(Patient newuser) throws IOException
	 {
		 FileOutputStream f1 = new FileOutputStream(path1,true);
		 FileOutputStream f2 = new FileOutputStream(path2,true);

		 
		 BufferedWriter bfr1 = new BufferedWriter(new OutputStreamWriter(f1,"UTF-8"));
		 BufferedWriter bfr2 = new BufferedWriter(new OutputStreamWriter(f2,"UTF-8"));
		 
		 bfr1.newLine();
		 bfr1.append(newuser.getFirstName()+"|"+newuser.getLastName()+"|"+newuser.getGender()+"|"+newuser.getAddress()+"|"+newuser.getContactNumber()+"|"+newuser.getRegisteredMail()+"|"+newuser.getPassword()+"|"+newuser.getAge()+"|P|");
		 bfr1.flush();
		 bfr1.close();
		 
		 bfr2.newLine();
		 bfr2.append(newuser.getRegisteredMail()+"|"+newuser.getAssigned_doctor()+"|");
		 bfr2.flush();
		 bfr2.close();
		 
		 return true;
	 }
}

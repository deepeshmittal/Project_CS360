package main.junit.test;

import static org.junit.Assert.*;

import java.io.IOException;

import main.register.CaseDAO;

import org.junit.Test;

public class TestUpdatePrescription {

	@Test
	public void test() throws IOException {
		
		int caseNum = 415000000;
		String resolutionDate = "4/20/2015";
		String docPrescription = "You are fine";
		String path = "C:\\Users\\Deepesh\\Downloads\\sts-bundle\\pivotal-tc-server-developer-3.1.0.RELEASE\\base-instance\\wtpwebapps\\newproject_360\\WEB-INF\\classes\\resources\\";
		
		CaseDAO caseDao = CaseDAO.getInstance(path);
		
		if (caseDao.updatePrescription(caseNum, resolutionDate, docPrescription)){
			System.out.println("Provided case number updated succesfully");
		}
		else{
		
		fail("Case number not found !!");
		}
	}

}

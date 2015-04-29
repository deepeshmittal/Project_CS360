package main.junit.test;

import static org.junit.Assert.*;

import java.io.IOException;

import main.register.CaseDAO;
import main.users.user.MedicalCase;

import org.junit.Test;

public class TestRegisterCase {

	@Test
	public void test() throws IOException {
		String path = "C:\\Users\\Deepesh\\Downloads\\sts-bundle\\pivotal-tc-server-developer-3.1.0.RELEASE\\base-instance\\wtpwebapps\\newproject_360\\WEB-INF\\classes\\resources\\";
		CaseDAO caseDao = CaseDAO.getInstance(path);
		
		MedicalCase mCase = new MedicalCase();
		
		mCase.setCaseNumber(1);
		mCase.setDisease("nausea");
		mCase.setSeverityLevel(Integer.parseInt("7"));
		mCase.setComment("I am sick");
		mCase.setDateCreated("10/29/2015");
		mCase.setCaseStatus("Open");
		mCase.setPatientEmail("deepesh.mittal@gmail.com");
		mCase.setDoctorEmail("harry.largo@patient-care.com");
		mCase.setDateResolution("NA");
		mCase.setActualSeverity(7);
		mCase.setDocPrescription("your are ok");
		
		if(caseDao.registerCase(mCase))
		{
			System.out.println("Entry add successfully");
		}
		else
		{
			fail("Entry add failed");
		}
		
		
	}

}

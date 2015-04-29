package main.junit.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import main.register.CaseDAO;
import main.users.user.MedicalCase;
import main.users.user.RegisteredUser;

import org.junit.Test;

public class TestFetchCaseListFromDB {

	@Test
	public void test() throws IOException {
		
		RegisteredUser user = new RegisteredUser();
		user.setRegisteredMail("deepesh.mittal@gmail.com");
		user.setUser_type("P");
		
		String path = "C:\\Users\\Deepesh\\Downloads\\sts-bundle\\pivotal-tc-server-developer-3.1.0.RELEASE\\base-instance\\wtpwebapps\\newproject_360\\WEB-INF\\classes\\resources\\";

		List<MedicalCase> caseList = new ArrayList<MedicalCase>();

		
		CaseDAO caseDao = CaseDAO.getInstance(path);
		caseList = caseDao.fetchCasesFromDB(caseList, user);
		
		if (caseList == null)
		{
		fail("No entry for this user");
		}
		else
		{
			System.out.println("data fetched successfully");
		}
	}

}

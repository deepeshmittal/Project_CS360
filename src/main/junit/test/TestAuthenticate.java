package main.junit.test;

import static org.junit.Assert.*;

import java.io.IOException;

import main.users.authentication.Authenticator;
import main.users.user.RegisteredUser;

import org.junit.Test;

public class TestAuthenticate {

	@Test
	public void test() throws IOException {
		
		String username = "deepesh.mittal@gmail.com";
		String password = "12345";

		String path = "C:\\Users\\Deepesh\\Downloads\\sts-bundle\\pivotal-tc-server-developer-3.1.0.RELEASE\\base-instance\\wtpwebapps\\newproject_360\\WEB-INF\\classes\\resources\\";
		
		RegisteredUser user = Authenticator.getInstance(path).authenticate(username, password);
		
		if (user == null){
			fail("User doesn't exsist");
		}
		
		else if(user.getUser_type().equalsIgnoreCase("P")) {
			System.out.println("Test Passed. User is Patient");
					
		}
		
		else if (user.getUser_type().equalsIgnoreCase("D")){
			System.out.println("Test Passed. User is Doctor");
			
		}
		

		
		
	}

}

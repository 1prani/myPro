package dDT_practice;

import org.testng.annotations.Test;

public class CreateUserTest {
	
	@Test
	
	public void createUserTest()
	{
		System.out.println("execute scriptttt");
//		System.getProperty(null)
		
		 String url = System.getProperty("url");

		 String un = System.getProperty("user");
		 
		 String password = System.getProperty("pass");
		 
		 System.out.println("--------------->"+url);
		 System.out.println("--------------->"+un);
		 System.out.println("--------------->"+password);

		
	}

}

package TestNG.Practice;

//import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class SampleTest {
	
	
//	@Test
//	public void createOrganization() {
//		
//		
//		System.out.println("crating the organization");
//	
//	}
//	@Test
//	public void modifyingOrganizaton() {
//		System.out.println("----------modified---------");
//	}
		
		@BeforeMethod
		public void loginM() {
			System.out.println("loggggin");
			
		}
		
		@AfterMethod
		public void logout( ) {
			System.out.println("logggout");
	}
	
		@BeforeClass
		public void opentheBrowser() {
			System.out.println("open the browser");
		}
		@AfterClass
		public void closetheBrowser() {
			System.out.println("close the browser");
		}
		@BeforeSuite
		public void connectDatabase() {
			System.out.println("connect to database");
		}
		@AfterSuite
		public void closeDataBase() {
			System.out.println("close the database"); 
		}

}

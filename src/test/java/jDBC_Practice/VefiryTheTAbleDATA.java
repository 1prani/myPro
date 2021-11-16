package jDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class VefiryTheTAbleDATA {

	@Test
	public void verifyTheTableDATA() throws Throwable {
		Connection con = null;

		try {
			String expectedData = "ram";
			Driver dref = new Driver();

			DriverManager.registerDriver(dref);

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");

			Statement stat = con.createStatement();

			ResultSet res = stat.executeQuery("select firstname from students_info where firstname ='ram';");

			boolean flag = false;
			while (res.next()) {
				String actualData = res.getString(1);

//		Assert.assertEquals(actualData, expectedData);

				if (expectedData.equals(actualData)) {
					System.out.println(actualData + "  is presrent in table");
					flag = true;
					break;
//				
				}
			}

			Assert.assertEquals(flag, true);
//		Assert.assertEquals(actualData, expectedData);

		} catch (Exception e) {
			// TODO: handle exception
		}
		 finally {
			
			System.out.println("*************connection closed******");

			con.close();
		}
		

	}
}


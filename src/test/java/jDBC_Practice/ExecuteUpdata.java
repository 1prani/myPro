package jDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdata {

	@Test
	public void verifyTheTableDATA() throws Throwable {
		Connection con = null;

		try {
			String expectedData = "ram";
			Driver dref = new Driver();

			DriverManager.registerDriver(dref);

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");

			Statement stat = con.createStatement();

//				ResultSet res = stat.executeQuery("select firstname from students_info where firstname ='ram';");
			int res = stat.executeUpdate(
					"insert into students_info (regno, firstname, middlename, lastname) values('4', 'pranesh','kumar', 'M');");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			System.out.println("*************connection closed******");

			con.close();
		}

	}
}

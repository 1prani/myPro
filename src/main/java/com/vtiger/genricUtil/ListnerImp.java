package com.vtiger.genricUtil;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//import org.testng.annotations.Listeners;


public class ListnerImp implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String methname = result.getMethod().getMethodName();
		String date = new Date().toString().replace(" ", "_").replace(":", "-");
		
		
		EventFiringWebDriver e = new EventFiringWebDriver(BaseClass.sdriver);
		
		
		File srcImg = e.getScreenshotAs(OutputType.FILE);
		
		File destImg = new File("./screenshotttsfolder/"+methname+date+".PNG");
		
		try {
			FileUtils.copyFile(srcImg, destImg);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}

package com.crm.Sdet.genericLib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;




public class Listener implements ITestListener {
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) 
	{
		String testname = result.getMethod().getMethodName();
		System.out.println(testname+"Exicute and i mam listning");
		
		EventFiringWebDriver edriver= new EventFiringWebDriver(BaseClass.sDriver);
		
      File source = edriver.getScreenshotAs(OutputType.FILE);
	   
	 try {
		File destFile = new File("./photo/vtiger.png");
		 FileUtils.copyFile(source, destFile);
	 }
		catch(Throwable e)
		{
		
			e.printStackTrace();
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

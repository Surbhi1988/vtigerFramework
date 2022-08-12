package com.crm.Sdet.organization;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Sdet.genericLib.BaseClass;
import com.crm.Sdet.genericLib.ExcelUtility;
import com.crm.Sdet.genericLib.JavaUtility;
import com.crm.Sdet.genericLib.propertyUtility;
import com.crm.Sdet.objectRepsitory.HomePage1;
import com.crm.Sdet.objectRepsitory.LogInPage1;
import com.crm.Sdet.objectRepsitory.OrganizationPage;
import com.crm.Sdet.objectRepsitory.ProductPage1;
import com.crm.Sdet.objectRepsitory.Validation;
@Listeners(com.crm.Sdet.genericLib.Listener.class)
public class CreateOrganization extends BaseClass {
	
	
	@Test(groups= {"smokeTest"})
	public void createOrganization() throws Throwable

	{
       // WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//propertyUtility plib= new propertyUtility();
		JavaUtility jlib=new JavaUtility();
		 ExcelUtility elib=new  ExcelUtility();
		 
		//String Browser = plib.getPropertyKeyValue("browser");
		//System.out.println(Browser);
		
		//String Url = plib.getPropertyKeyValue("url");
		//String Username = plib.getPropertyKeyValue("un");
		//String password = plib.getPropertyKeyValue("pwd");
		
		//driver.get(Url);
		LogInPage1 loginpage= new LogInPage1(driver);
		//loginpage.login(Username, password);
		loginpage.getLoginbutton();
	
	   HomePage1 homepage=new HomePage1(driver);
	   homepage.organizationclick();
	   
	   OrganizationPage organpage=new OrganizationPage(driver);
	   organpage.createorgclick();
	 //  Assert.assertEquals(false, true);
	   
	   int ranNum = jlib.getRandomNum();
		String orgname = elib.getdataFromExcel("Organization",2,0)+ranNum;
        System.out.println(orgname);
	   //driver.findElement(By.name("accountname")).sendKeys(orgname);
        organpage.organizationtf(orgname);
        organpage.savebutton();
	  // driver.findElement(By.name("button")).click();
	  // String actdata = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
	    // if(actdata.contains(orgname))
	    // {
	   	// System.out.println("pass");
	    // }
	    //else
	    // {
	    //	 System.out.println("fail");
	    // }
        Validation valid=new Validation(driver);
        String orgvalidation = valid.orgvalid();
        Assert.assertEquals(orgvalidation.contains(orgname), true);
	    	 
	    	WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	     
	     
	    	Actions a=new Actions(driver);
	    	a.moveToElement(element).perform();
	    	driver.findElement(By.linkText("Sign Out")).click();
	     }
}



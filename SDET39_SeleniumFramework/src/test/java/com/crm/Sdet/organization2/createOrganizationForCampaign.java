package com.crm.Sdet.organization2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
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
import org.testng.annotations.Test;

import com.crm.Sdet.genericLib.BaseClass;
import com.crm.Sdet.genericLib.ExcelUtility;
import com.crm.Sdet.genericLib.JavaUtility;
import com.crm.Sdet.genericLib.WebDriverUtility;
import com.crm.Sdet.genericLib.propertyUtility;
import com.crm.Sdet.objectRepsitory.CampaignPage1;
import com.crm.Sdet.objectRepsitory.HomePage1;
import com.crm.Sdet.objectRepsitory.LogInPage1;
import com.crm.Sdet.objectRepsitory.OrganizationPage;
import com.crm.Sdet.objectRepsitory.Validation;
import com.crm.Sdet.objectRepsitory.productAndActionPage;

public class createOrganizationForCampaign extends BaseClass {
	
 @Test (groups= {"smokeTest"})
 
 public void createCampaignTest() throws Throwable{
       
		
		//WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		//propertyUtility plib= new propertyUtility();
		JavaUtility jlib=new JavaUtility();
		 ExcelUtility elib=new  ExcelUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		 
		//String Browser = plib.getPropertyKeyValue("browser");
		//System.out.println(Browser);
		
		//String Url = plib.getPropertyKeyValue("url");
		//String Username = plib.getPropertyKeyValue("un");
		//String password = plib.getPropertyKeyValue("pwd");
		
		//driver.get(Url);
		
		//driver.findElement(By.name("user_name")).sendKeys(Username);
		//driver.findElement(By.name("user_password")).sendKeys(password);
		//driver.findElement(By.id("submitButton")).click();
		LogInPage1 loginpage= new LogInPage1(driver);
		//loginpage.login(Username, password);
		loginpage.getLoginbutton();
	

		//driver.findElement(By.linkText("Products")).click();
		//driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		HomePage1 homepage=new HomePage1(driver);
		   homepage.productlink();
		   CampaignPage1 campaignpage=new CampaignPage1(driver);   
	       campaignpage.createproductbtn();
	       
	      int ranNum = jlib.getRandomNum();
	
		String productName = elib.getdataFromExcel("product", 1, 1)+ranNum;
       System.out.println(productName);
      // driver.findElement(By.name("productname")).sendKeys(productName);
       
       campaignpage.productNametf(productName);
       //driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
       campaignpage.productSavebtn();
		//WebElement element = driver.findElement(By.linkText("More"));
      // wlib.mouseOverOnElement(driver,morelink);
		//Actions a=new Actions(driver);
		//a.moveToElement(element).perform();
       HomePage1 homepage1=new HomePage1(driver);
       homepage1.morelink(driver);
		//driver.findElement(By.name("Campaigns")).click();
       campaignpage.CampaignButton();
		//driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
       campaignpage.CreateCampaignbutton();
		
		int ranNum1 = jlib.getRandomNum();
		
		//FileInputStream fis2=new FileInputStream("./src/test/resources/book1.xlsx");
       // Workbook wb1 = WorkbookFactory.create(fis2);
       // Sheet sh1 = wb1.getSheet("campaign");
       // Row row1 = sh1.getRow(1); 
       // Cell cell1= row1.getCell(0);
      // String campaignName = cell1.getStringCellValue()+ranNum;
		
		String campaignName = elib.getdataFromExcel("campaign", 1, 2)+ranNum1;
       System.out.println(campaignName);
       //driver.findElement(By.name("campaignname")).sendKeys(campaignName);
      campaignpage.campaignNameTextfield(campaignName);
       driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
       //campaignpage.CreateCampaignbutton();
       Thread.sleep(3000);
       //window switching
       wlib.switchToWindow(driver, "Products&action");
      
      // driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys(productName);
       productAndActionPage proandactpage=new productAndActionPage(driver);
       proandactpage.Searchtextfield(productName);
       
   // driver.findElement(By.name("search")).click();
       proandactpage.Searchbutton();
       
		//driver.findElement(By.xpath("//a[text()='"+productName+"']")).click();
     //proandactpage.searchproductname(driver, productName);
     proandactpage.productname();
    
    
	//switching
		wlib.switchToWindow(driver,"Campaigns&action");
	
		 
		CampaignPage1 camppage=new CampaignPage1(driver);
		 camppage.campaignSavebtn();;
		
	 // driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	    
	   // String actData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
     // if(actData.contains(campaignName)) {
    	 // System.out.println("pass");
     // }
    //  else {
    	 // System.out.println("fail");
    	 // }
		 Validation  valid=new Validation (driver);
		  String campValid = valid.campaignValid();
		  Assert.assertEquals(campValid.contains(campaignName), true);
      
     
      WebElement element1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
      
     // wlib.mouseOverOnElement(driver, element1);
     // Actions a1=new Actions(driver);
      //a1.moveToElement(element1).perform();
      
      
      HomePage1 homepage11=new HomePage1(driver);
      homepage11.MouseHover(driver);
      //driver.findElement(By.linkText("Sign Out")).click();
      proandactpage.signoutbtn();
      driver.close();
		
	}

}

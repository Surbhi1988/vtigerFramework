package com.crm.Sdet.organization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Sdet.genericLib.BaseClass;
import com.crm.Sdet.genericLib.ExcelUtility;
import com.crm.Sdet.genericLib.JavaUtility;
import com.crm.Sdet.genericLib.WebDriverUtility;
import com.crm.Sdet.genericLib.propertyUtility;
import com.crm.Sdet.objectRepsitory.HomePage1;
import com.crm.Sdet.objectRepsitory.LogInPage1;
import com.crm.Sdet.objectRepsitory.ProductPage1;
import com.crm.Sdet.objectRepsitory.Validation;
@Listeners(com.crm.Sdet.genericLib.Listener.class)
public class createOrganizationForproduct extends BaseClass {

	@Test (groups= {"regressionTest"})
	public void createProduct() throws Throwable{
		
		
		//FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		//Properties p=new Properties();
		//p.load(fis);
		
		//System.out.println(p.getProperty("browser"));
		//String url = p.getProperty("url");
		//String un = p.getProperty("un");
		//String pwd = p.getProperty("pwd");
		
		//WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//propertyUtility plib= new propertyUtility();
		//String Browser = plib.getPropertyKeyValue("browser");
		JavaUtility jlib=new JavaUtility();
		 ExcelUtility elib=new  ExcelUtility();
		 WebDriverUtility wlib=new WebDriverUtility();
			
			
			//String Browser1 = plib.getPropertyKeyValue("browser");
			//System.out.println(Browser1);
			
			//String Url = plib.getPropertyKeyValue("url");
			//String Username = plib.getPropertyKeyValue("un");
			//String password = plib.getPropertyKeyValue("pwd");
			
		//driver.get(Url);
		//LogInPage1 loginpage= new LogInPage1(driver);
		//loginpage.login(Username, password);
		
		 HomePage1 homepage=new  HomePage1(driver);
		 homepage.productlink();
		// Assert.assertEquals(true, false);
		 ProductPage1 productpage=new ProductPage1(driver);
		         productpage.createproductbtn();
		
		//driver.findElement(By.name("user_name")).sendKeys(Username);
		//driver.findElement(By.name("user_password")).sendKeys(password);
		//driver.findElement(By.id("submitButton")).click();
		//driver.findElement(By.linkText("Products")).click();
		//driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		int ranNum = jlib.getRandomNum();
		
	
		String productName = elib.getdataFromExcel("product", 1, 0)+ranNum;
       System.out.println(productName);
       productpage.productNametf(productName);
       //driver.findElement(By.xpath("//input[@name='productname']")).sendKeys(productName);
       productpage.productSavebtn();
       //driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
       
    ////  String actData = driver.findElement(By.cssSelector("span.lvtHeaderText")).getText();
   //   if(actData.contains(productName))
     // {
    	//  System.out.println("pass");
    //}
      //else
       //{
	//System.out.println("fail");
//}
       Validation valid=new Validation(driver);
      String productValid = valid.productValid();
      Assert.assertEquals(productValid.contains(productName), true);
       
       
       //driver.findElement(By.xpath("//input[@name='Delete']")).click();
        productpage.productDeletebtn();
       driver.switchTo().alert().accept();
     WebElement element = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
   
     wlib.mouseOverOnElement(driver, element);
      // Actions a=new Actions(driver);
      // a.moveToElement(element).perform();
      // driver.findElement(By.linkText("Sign Out")).click();
     productpage.productSignOutbtn();
       driver.close();
		
	}		
		
	}



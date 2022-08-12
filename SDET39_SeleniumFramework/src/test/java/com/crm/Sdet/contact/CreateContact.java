package com.crm.Sdet.contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.Sdet.genericLib.ExcelUtility;
import com.crm.Sdet.genericLib.JavaUtility;
import com.crm.Sdet.genericLib.WebDriverUtility;
import com.crm.Sdet.genericLib.propertyUtility;

public class CreateContact {

	public static void main(String[] args) throws Throwable {
		
		propertyUtility plib= new propertyUtility();
		JavaUtility jlib=new JavaUtility();
		 ExcelUtility elib=new  ExcelUtility();
		 WebDriverUtility wlib=new WebDriverUtility();
		 
		 
		  WebDriver driver=new ChromeDriver();
		  String Browser = plib.getPropertyKeyValue("browser");
			System.out.println(Browser);
		 String Url = plib.getPropertyKeyValue("url");
		 String UserName = plib.getPropertyKeyValue("un");
		String password = plib.getPropertyKeyValue("pwd");
		driver.get(Url);
		driver.findElement(By.name("user_name")).sendKeys(UserName);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement( By.xpath("//img[@alt='Create Contact...']")).click();
		WebElement dd = driver.findElement(By.name("salutationtype"));
		 wlib.dropDown(dd,1);
		// driver.findElement(By.name("firstname")).click();
		 
		 int ranNum = jlib.getRandomNum();
	 String contName = elib.getdataFromExcel("contact", 1, 0)+ ranNum;
	
	 System.out.println(contName);
	 driver.findElement(By.name("firstname")).sendKeys(contName);
	 
	 int ranNum1 = jlib.getRandomNum();
	  String contName1 = elib.getdataFromExcel("contact", 1, 1)+ ranNum1;
	System.out.println(contName1);
	driver.findElement(By.name("lastname")).sendKeys(contName1);
	//driver.findElement(By.name("button")).click();
	driver.findElement(By.xpath("//img[@alt='Select']")).click();
	
	wlib.switchToWindow(driver, "Accounts&action");
	driver.findElement(By.name("search")).click();
	driver.findElement(By.xpath("//a[text()='jspider917']")).click();
	
	wlib.switchToWindow(driver, "Contacts&action");
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
    
	String actdata = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
	 if(actdata.contains(contName))
     {
   	System.out.println("pass");
     }
    else
     {
    	System.out.println("fail");
    }
	   WebElement element1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	      
	      wlib.mouseOverOnElement(driver, element1);
	     // Actions a1=new Actions(driver);
	      //a1.moveToElement(element1).perform();
	      
	      driver.findElement(By.linkText("Sign Out")).click();
	      driver.close();
	
	}

}

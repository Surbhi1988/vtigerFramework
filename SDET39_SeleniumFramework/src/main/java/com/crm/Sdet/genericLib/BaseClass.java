package com.crm.Sdet.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.crm.Sdet.objectRepsitory.LogInPage1;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseClass {
  public	WebDriver driver;
  public static WebDriver sDriver;
  
  propertyUtility plib=new propertyUtility();
	 //JavaUtility jlib=new JavaUtility();
	 //ExcelUtility elib=new  ExcelUtility();
	 //WebDriverUtility wlib=new WebDriverUtility();
	 
@BeforeSuite(groups= {"smokeTest","regressionTest"})

public void BS() {
	 System.out.println("DataBase Connection");
	}
@BeforeTest(groups= {"smokeTest","regressionTest"})

public void BT() {
    System.out.println("Execute Script in parallel Mode");
}

//@Parameters("BROWSER")
@BeforeClass(groups= {"smokeTest","regressionTest"})

public void BC() throws Throwable {
String Browser = plib.getPropertyKeyValue("browser");

if(Browser.equalsIgnoreCase("chrome")){
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	
}else
	if(Browser.equalsIgnoreCase("Firefox")){
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	}else
		if(Browser.equalsIgnoreCase("Edge"))
		{WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
			
		}else {
			driver=new ChromeDriver();
		}
		sDriver=driver;

}
@BeforeMethod(groups= {"smokeTest","regressionTest"})

public void BM() throws Throwable {
	System.out.println("Login to Application");
	String Url = plib.getPropertyKeyValue("url");
	String Username = plib.getPropertyKeyValue("un");
	String password = plib.getPropertyKeyValue("pwd");
	
	driver.get(Url);
	LogInPage1 loginpage= new LogInPage1(driver);
	loginpage.login(Username, password);
	

}
@AfterMethod(groups= {"smokeTest","regressionTest"})
public void AM() {
	System.out.println("logout from Application");
}
@AfterClass(groups= {"smokeTest","regressionTest"})
public void AC() {
	System.out.println("closing the Browser");
}
@AfterTest(groups= {"smokeTest","regressionTest"})
public void AT() {
	System.out.println("parallel Execution is done");
}
@AfterSuite(groups= {"smokeTest","regressionTest"})
public void AS() {
	System.out.println("closung DataBase Connection");
}
}

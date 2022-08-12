package practiceProgram;


import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.crm.Sdet.genericLib.ExcelUtility;
import com.crm.Sdet.genericLib.JavaUtility;
import com.crm.Sdet.genericLib.WebDriverUtility;
import com.crm.Sdet.genericLib.propertyUtility;

public class makeMyTrip {

	public static void main(String[] args) throws Throwable {
		//Date date=new Date();
		//date.toString().split(" ");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		propertyUtility plib= new propertyUtility();
		//JavaUtility jlib=new JavaUtility();
		 ExcelUtility elib=new  ExcelUtility();
		 WebDriverUtility wlib=new WebDriverUtility();
		String Browser = plib.getPropertyKeyValue("browser");
		System.out.println(Browser);
		 
		String Url = plib.getPropertyKeyValue("url1");
		driver.get(Url);
		 WebElement from = driver.findElement(By.id("fromCity"));
		 Thread.sleep(2000);
        from.sendKeys("Mumbai");
        String city = "Mumbai, India";
	    driver.findElement(By.xpath("//p[text()='"+city+"']")).click();
	    
	    WebElement to = driver.findElement(By.id("toCity"));
		 Thread.sleep(2000);
	      to.sendKeys("New York");
	      String city1 = "New York, United States";
			driver.findElement(By.xpath("//p[text()='"+city1+"']")).click();
			//navigate to diparture
			driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
			String requiredMonth = "September";
			String requiredYear = "2022";
			String requiredDate = "20";
			String currentMonthYear = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText();
			String currentMonth = currentMonthYear.split(" ")[0];
			String currentYear = currentMonthYear.split(" ")[1];
			while(!(currentMonth.equalsIgnoreCase(requiredMonth)&&( currentYear.equalsIgnoreCase( requiredYear))))
					{
				driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]")).getText();
				 currentMonth = currentMonthYear.split(" ")[0];
				 currentYear = currentMonthYear.split(" ")[1];
			}
			driver.findElement(By.xpath("(//p[.='"+requiredDate+"'])[2]")).click();
			
			}
	}

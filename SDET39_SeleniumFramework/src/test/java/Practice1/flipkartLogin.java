package Practice1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartLogin {

	
	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("C:\\Eclipse workbook\\SDETworkbook\\SDET39_SeleniumFramework\\src\\test\\resources\\data.properties");
		Properties p = new Properties();
		p.load(fis);
		String browser = p.getProperty("browser");
		System.out.println("browser");
		String url = p.getProperty("url");
		String username = p.getProperty("un");
		String password = p.getProperty("pwd");
		
		
		WebDriver driver=new ChromeDriver();
	
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement( By.name("login")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
	}

}

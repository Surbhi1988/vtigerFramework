package Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginActitime {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("./data.properties");
		Properties p=new Properties();
		p.load(fis);
	
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(p.getProperty("url"));
	    driver.findElement(By.id("username")).sendKeys(p.getProperty("un"));
	    Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys( p.getProperty("pwd"));
		Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        Thread.sleep(3000);
        
	}

}

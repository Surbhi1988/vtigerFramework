package Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin {

	public static void main(String[] args) throws IOException {
	  FileInputStream fis=new FileInputStream("./data.properties");
	  Properties p=new Properties();
	  p.load(fis);
	   WebDriver driver=new ChromeDriver();
	   
	driver.get(p.getProperty("url"));
	   driver.findElement(By.id("email")).sendKeys(p.getProperty("un"));
	   driver.findElement(By.id("pass")).sendKeys(p.getProperty("pwd"));
	   driver.findElement(By.name("login")).click();

	    

	}

}

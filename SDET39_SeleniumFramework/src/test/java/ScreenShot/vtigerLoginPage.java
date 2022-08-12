package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class vtigerLoginPage {
	

	@Test
	public void CaptureScreenShot() throws IOException {
	   WebDriver driver=new ChromeDriver();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Ram = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./photo/vtiger.png");
		FileUtils.copyFile(Ram, dest);
		System.out.println("screenshot taken");
		driver.quit();
	}

}

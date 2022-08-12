package com.crm.Sdet.genericLib;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void moveByOffest() {
		
	}

	/*wait for page to load before identifying any syncronized element in DOM
	 * *author surbhi
	 */
	
	public void waitforPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	/*After every action it will for next action to perform
	 * author surbhi
	 */
	
	public void scriptTimeOut(WebDriver driver) {
		driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
		}
	/*used to wait for element to be clickable in GUI.and check for specific element for every 500milliseconds
	 *@ param driver
	 * @param element
	 * @author  surbhi
	 */
	public void waitForLineToLoad(WebDriver driver,WebElement Element) {
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(Element));
	}
	 /*use to wait for element to be clickable in GUI and check for specific element for every 500 millisecond
	  * @param driver
	  * @param element
	  * @ polling time
	  * @author surbhi 
	 */
	public void  waitForElementWithCustomTimeOut(WebDriver driver,WebElement Element,int pollingTime)
	{
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(20));
		//wait.until(ExpectedCondition.elementToBeClickable(Element));
	}
	/*used to switch to any Window based on Window title
	 * @param driver
	 * @param PartialWindowTime
	 * @author surbhi
	 */
	public void switchToWindow(WebDriver driver,String PartialWindowTitle) {
	     Set<String> allwindows = driver.getWindowHandles();
	      Iterator<String> it =allwindows.iterator();
	      while(it.hasNext())
	      {
	    	  String wid = it.next();
	    	  driver.switchTo().window(wid);
	    	  if(driver.getTitle().contains("Products&action")) {
	    		  break;
	    	  } 
	      }}
	    	 
	      
	      
	 /*used to switch to AlertWindow and Aceept (click on ok button)
	  * @param driver
	  * @author surbhi
	   */
		public void switchToAlertAndAccept(WebDriver driver) {
			driver.switchTo().alert().accept();
			
		}
		/*used to switch to AlertWindow and dismiss(click on Cancel button)
		 * @param driver
		 * @author surbhi
		 */public void switchToAlertAndDismis(WebDriver driver) {
			 driver.switchTo().alert().dismiss();
		 }
		 /*used to switch to frame  window based on index
		  * @param driver
		  * @param index
		  * @author surbhi
		   */
		 public void switchToFrame(WebDriver driver,int index) {
			 driver.switchTo().frame(index);
		 }
		 /*used to switch frame window based on id or name attribute
		  * @param drivert
		  * @param id_name_attribute
		  * @author surbhi
		  */
		 public void  switchToFrame(WebDriver driver,String id_name_Attribute) {
			 driver.switchTo().frame(id_name_Attribute);
		 }
		 /*used to select the value from the dropdown based on index
		  * @param element
		  * @param index
		  * @author surbhi
		   */
		 public void dropDown(WebElement element,int index) {
			 Select sel=new Select (element);
			 sel.selectByIndex(index);
			 }
		  /*used to select the value from the dropdown based on Text
		  * @param element
		  * @param Text
		  * @author surbhi
		   */
		    public void dropDown(WebElement element,String text) {
			 Select sel=new Select (element);
			 sel.deselectByVisibleText(text);
			 
	
			 }
		 
		 /*used to place mouse curser on specific element
		  * @param driver
		  * @param element
		  * @author surbhi
		   */
		   public void mouseOverOnElement(WebDriver driver,WebElement element) {
			   Actions act= new Actions(driver);
			   act.moveToElement(element).perform();
		   }
		   
		   /*used to place right click on specific element
			  * @param driver
			  * @param element
			  * @author surbhi
			   */
			   public void rightClickOnElement(WebDriver driver,WebElement element)
			   {
				   Actions act= new Actions(driver);
				   act.contextClick();
			   }

			   /*used to place DoubleClick specific element 
				  * @param driver
				  * @param element
				  * @author surbhi
				   */
				   public void doubleClickOnElement(WebDriver driver,WebElement element)
				   {
					   Actions act= new Actions(driver);
					   act.doubleClick();
				   }
				   /*
				    * 
				    */
				  // public void switchToAlertwindowAndAccept(WebDriver driver,StringexpectedMsg) {
					 //  Alert alt=driver.switchTo().alert();
					 //  if(alt.getText().trim().equalsIgnoreCase(expectedMsg.trim())){
						//   System.out.println("Alert message is verified");
					  // }
					//   else
					  // {
						   
						   
					   }
				   
				    


package com.crm.Sdet.objectRepsitory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productAndActionPage {
	
		

		//initialization
		public productAndActionPage (WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
   //decleration
	  @FindBy( id="search_txt")
	  private WebElement searchTf;
	  
     @FindBy(xpath="//input[@name='search']")
	  private WebElement Searchbtn;
     
 	
	   @FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement Savebutton;
	   
		
		@FindBy(linkText="Sign Out")
		private WebElement signOutbtn; 
		
		@FindBy(id="1")
		private WebElement productName;
		


	
	 public WebElement getProductName() {
			return productName;
		}
	public WebElement getSavebutton() {
		return Savebutton;
	}
	public WebElement getSignOutbtn() {
		return signOutbtn;
	}
	public WebElement getSearchTf() {
		return searchTf;
	}
	public WebElement getSearchbtn() {
		return Searchbtn;
	}
/* business library
 * @ param productname ,driver
 * @author surbhi
 */
	public void productname() {
		productName.click();
	}
	  public void Searchtextfield(String productName) {
    	  searchTf.sendKeys(productName);
    	   }
	 public void Searchbutton() {
		  Searchbtn.click();
	  }
	  public void searchproductname(WebDriver driver,String productName) {
			driver.findElement(By.xpath("//a[text()='"+productName+"']")).click();
	  }
	  public void savebutton() {
		  Savebutton.click();
		  }
	  public void signoutbtn() {
		  signOutbtn.click();
	  }
      

}

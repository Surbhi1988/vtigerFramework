package com.crm.Sdet.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage1{
	
	 //initialization
		public ProductPage1(WebDriver driver) {
			PageFactory.initElements(driver,this);
			}
		//Decleration
		@FindBy(xpath="//input[@name='productname']")
		private WebElement productnametextfield;
		
		@FindBy(xpath="//img[@alt='Create Product...']")
		private WebElement plusbtn;
			
	   @FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement Savebutton;
		
		@FindBy(xpath="//input[@name='Delete']")
		private WebElement deleteBtn;
		
		@FindBy(linkText="Sign Out")
		private WebElement signOutbtn;  
		

	    public WebElement getProductnametextfield() {
			return productnametextfield;
		}
		public WebElement getPlusbtn() {
			return plusbtn;
		}
		public WebElement getSavebutton() {
			return Savebutton;
		}
	    public WebElement getDeleteBtn() {
			return deleteBtn;
		}
		public WebElement getSignOutbtn() {
			return signOutbtn;
		}
		//Business logic
		/* used to find element
		 * @param locator
		 * @author surbhi
		 */
		 public void createproductbtn() {
			plusbtn.click();
		}
		public void productNametf(String productName) {
			 productnametextfield.sendKeys(productName);
		}
		public void productSavebtn() {
			Savebutton.click();
		}
		public void productDeletebtn() {
			deleteBtn.click();
		}
		public void productSignOutbtn() {
			signOutbtn.click();
		 }
		

}
			
		
				 
 
		 
		 
		 
		 
		 
		 
		 
		 
		



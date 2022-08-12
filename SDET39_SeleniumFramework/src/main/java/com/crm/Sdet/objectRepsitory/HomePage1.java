package com.crm.Sdet.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Sdet.genericLib.WebDriverUtility;

public class HomePage1 {
	

	//initialization
	public HomePage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		
		//Decleration

		@FindBy(linkText="Organizations")
		private WebElement organizationButton;
		

		
	    @FindBy(linkText="Products") 
			private WebElement productbutton;
	    
	   @FindBy(linkText="More")
	   private WebElement morebtn;
	    
	   @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
			   private WebElement Mousehover;

	        
			public WebElement getMousehover() {
		return Mousehover;
	}

			public WebElement getMorebtn() {
		return morebtn;
	}

			public WebElement getProductbutton() {
			return productbutton;
		}

		    public WebElement getOrganizationButton() {
			return organizationButton;
		}

	/*
	 * used for homePageapp
	 * @param elements
	 * @author surbhi
	*/
		 public void organizationclick() {
			 organizationButton.click();
		 }
		 public void productlink() {
				 productbutton.click();
		 }
		 public void morelink(WebDriver driver) {
			 WebDriverUtility wlib=new WebDriverUtility();
			 wlib.mouseOverOnElement(driver, morebtn);
					
				}
		 public void MouseHover(WebDriver driver) {
			 WebDriverUtility wlib=new WebDriverUtility();
			 wlib.mouseOverOnElement(driver, Mousehover);
		}

}	 
				 
			 
			 
			 

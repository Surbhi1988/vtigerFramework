package com.crm.Sdet.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	 //initialization
	public OrganizationPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	//decleration

	@FindBy(xpath="//img[@alt=\"Create Organization...\"]")
	private WebElement orgplusButton;
	
	@FindBy(name="accountname")
	private WebElement organizationName;
	
	
	@FindBy(name="button")
	private WebElement saveButton;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administraterbtn;


	public WebElement getAdministraterbtn() {
		return administraterbtn;
	}


	public WebElement getPlusButton() {
		return orgplusButton;
	}


	public WebElement getOrganizationName() {
		return organizationName;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}
	
//business logic
	/*
	 * used for organization
	 * @param locators
	 * @author surbhi
	 */
	public void organizationtf(String orgname) {
		organizationName.sendKeys(orgname);
	}
		public void createorgclick()
		{
		 orgplusButton.click();
		}
		 public void savebutton() {
		  saveButton.click();
		 }
		  public void adminbtn() {
			  administraterbtn.isDisplayed();
			  
		  }
	 }
	 
	
	 
	

package com.crm.Sdet.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validation {
	//initialization
	public Validation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
//decleration
	@FindBy(css="span.dvHeaderText")
	private WebElement organizationvalidation;
	
	public WebElement getOrganizationvalidation() {
		return organizationvalidation;
	}
	@FindBy(css="span.lvtHeaderText")
	private WebElement productValidation;
	
	public WebElement getProductValidation() {
		return productValidation;
	}
	@FindBy (xpath="//span[@class='dvHeaderText']")
	private WebElement campaignValidation;

//Business logics
public WebElement getCampaignValidation() {
		return campaignValidation;
	}
public String orgvalid() {
	return organizationvalidation.getText();
}
public String productValid() {
	return productValidation.getText();
	
}
public String campaignValid() {
	return campaignValidation.getText();
}

}
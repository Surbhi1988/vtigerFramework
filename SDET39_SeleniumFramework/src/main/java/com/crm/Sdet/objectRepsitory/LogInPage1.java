package com.crm.Sdet.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage1 {

	 //initialization
	public LogInPage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	//Decleration
	@FindBy(name="user_name")
	private WebElement UserNameTextField;
	
	@FindBy(name="user_password")
	private WebElement PasswordTf;
	
	@FindBy(id="submitButton")
	private WebElement Loginbutton;
	
	//getter methods
	public WebElement getUserNameTextField() {
		return UserNameTextField;
	}

	public WebElement getPassword() {
		return PasswordTf;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}
	
	//business logics
	/*
	 * used for login app
	 * @param userName
	 * @param password
	 * @author surbhi
	 */
	public void login(String UserName,String password) {
		 UserNameTextField.sendKeys(UserName);
		 PasswordTf.sendKeys(password);
		 Loginbutton.click();
		}
	 
	
	

}

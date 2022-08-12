package com.crm.Sdet.objectRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage1 {
	 //initialization
	public CampaignPage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		//Decleration
	@FindBy(xpath="//img[@alt='Create Product...']")
	private WebElement plusbtn;
	
	@FindBy(xpath="//input[@name='productname']")
	private WebElement productnametextfield;
	
	  @FindBy(xpath="//input[@title='Save [Alt+S]']")
			private WebElement Savebutton;
	  @FindBy(name="Campaigns")
	  private 	WebElement campaignbtn;
	  
	  @FindBy(xpath="//img[@alt='Create Campaign...']")
	  private WebElement createCapaignbtn;
	  
	  @FindBy(name="campaignname")
	  private WebElement campaignNametf;
	  
	  @FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	  private WebElement productPlusbtn;
	  
	  @FindBy(name="campaignname")
	   private WebElement campaigntf;
	  
	  @FindBy(name="button")
	  private WebElement campaignsave;
	  
	 
	   public WebElement getCampaignsave() {
		return campaignsave;
	}



	public WebElement getCampaigntf() {
		return campaigntf;
	
}



	  public WebElement getProductPlusbtn() {
		return productPlusbtn;
	}

	public WebElement getCampaignNametf() {
		return campaignNametf;
	}

	public WebElement getCampaignbtn() {
		return campaignbtn;
	}

	public WebElement getCreateCapaignbtn() {
		return createCapaignbtn;
	}

	public WebElement getPlusbtn() {
		return plusbtn;
	}

	public WebElement getProductnametextfield() {
		return productnametextfield;
	}

	public WebElement getSavebutton() {
		return Savebutton;
	}
	  
	/*BUSINESS LOGIC
	 * @ param productname
	 * @auther surbhi
	 */
	public void camapigntextfield() {
		campaigntf.click();
	}
	public void productNametf(String productName) {
		 productnametextfield.sendKeys(productName);
	}
	public void createproductbtn() {
		plusbtn.click();
	} 
		public void productSavebtn () {
			Savebutton.click();
		}
			public void CampaignButton() {
				campaignbtn.click();
			}
              public  void CreateCampaignbutton() {
            	  createCapaignbtn.click();
              }
              public void campaignNameTextfield(String campaignName) {
            	  campaignNametf.sendKeys(campaignName);
              }
              public void productPlusButton() {
            	  productPlusbtn.click();
              }
            public void campaignSavebtn() {
            	campaignsave.click();
            	
            	
              }

				
			}
             
              
	


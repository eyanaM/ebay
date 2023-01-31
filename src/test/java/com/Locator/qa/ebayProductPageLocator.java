package com.Locator.qa;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class ebayProductPageLocator extends BaseClass {
	
  public ebayProductPageLocator() {
	  PageFactory.initElements(driver, this );
	  
  }
  
  @FindBy(linkText = "Tell us what you think")
  public WebElement verifyByAgainPage;

}

package com.Locator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class eBayBabyPageLocator extends BaseClass{
	
	public eBayBabyPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[text()='Selected category']")
	public WebElement verifyToys;
	
	
	@FindBy(xpath = "//a[@title='My eBay']")
	public WebElement mouseOverOnMyeBay;
	
	@FindBy(xpath = "//a[text()=' Buy Again']")
	public WebElement clickBuyAgain;

}

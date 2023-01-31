package com.Locator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class eBayBooksPageLocator extends BaseClass {
	public eBayBooksPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[@class='b-pageheader__text']")
	public WebElement verifyBooksPage;

	@FindBy(id = "gh-cat")
	public WebElement ClickBabyByDropdown;
	
	
	@FindBy(id = "gh-ac")
	public WebElement enterToysinsearchfield;
	
	
	@FindBy(id = "gh-btn")
	public WebElement clicksearchbuttton;
	
}

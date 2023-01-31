package com.Locator.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.BaseClass;

public class eBayHomePageLocator extends BaseClass{
	
	public eBayHomePageLocator() {
		PageFactory.initElements(driver, this );
		 
		
		
	}
	@FindBy(id = "gh-cat")
	public WebElement catagorydropdown;
	
	@FindBy(id = "gh-btn")
	public WebElement searchbutton;
	
	
	
	


}

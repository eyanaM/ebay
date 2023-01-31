package com.Action.qa;




import org.openqa.selenium.support.ui.Select;

import com.Locator.qa.eBayHomePageLocator;
import com.Utility.qa.BaseClass;

public class eBayHomePageActions extends BaseClass{
	
	eBayHomePageLocator EBayHomePageLocator= new eBayHomePageLocator();
	
	public void clickBookundertheCatagoryDropdown() {
		Select dropdownbooks= new Select(EBayHomePageLocator.catagorydropdown);
		
		dropdownbooks.selectByVisibleText("Books");
		
		
		
	}
	public void clickinsearchbutton() {
		EBayHomePageLocator.searchbutton.click();
		
		
	}
	
	
}

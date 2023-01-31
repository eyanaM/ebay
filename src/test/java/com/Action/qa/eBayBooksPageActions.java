package com.Action.qa;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.Locator.qa.eBayBooksPageLocator;
import com.Utility.qa.BaseClass;
import com.Utility.qa.testData;

public class eBayBooksPageActions extends BaseClass{
	
	eBayBooksPageLocator EBayBooksPageLocator = new eBayBooksPageLocator();
	
	
 public void verifyBooksPageisdisplay() {
	 
	  boolean verifybooks= EBayBooksPageLocator.verifyBooksPage.isDisplayed();
	  
	  Assert.assertTrue(verifybooks);  
	  
 }
 
 public void clickBabyunderAllCatagory() {
	 
	 Select dropdownbaby= new Select(EBayBooksPageLocator.ClickBabyByDropdown);
	 dropdownbaby.selectByValue("2984");
	 
	 
 }
 public void enterToysinsearchfield() {
	 
	 EBayBooksPageLocator.enterToysinsearchfield.sendKeys(testData.ToystestSearch);
	 
	 
 }
 public void searchbutttonclick() {
	 EBayBooksPageLocator.clicksearchbuttton.click();
	 
 }
 
 
 
 
}

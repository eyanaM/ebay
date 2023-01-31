package com.Action.qa;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.Locator.qa.eBayBabyPageLocator;
import com.Utility.qa.BaseClass;

public class eBayBabyPageActions extends BaseClass  {
	
	eBayBabyPageLocator EBayBabyPageLocator = new eBayBabyPageLocator();
	
	
	public void verifyToysaredisplayed() {
		boolean verifyBabyToy = EBayBabyPageLocator.verifyToys.isDisplayed();
		Assert.assertTrue(verifyBabyToy);
		
	}
	
	public void mouseoveronMyeBayforBuyAgain() {
		Actions ac= new Actions(driver);
		ac.moveToElement(EBayBabyPageLocator.mouseOverOnMyeBay).build().perform();
		
		
		
	}
	public void clickBuyAgainunderMyeBay() {
		EBayBabyPageLocator.clickBuyAgain.click();
		
		
	}

}

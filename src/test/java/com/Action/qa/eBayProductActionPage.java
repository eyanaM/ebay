package com.Action.qa;

import org.testng.Assert;

import com.Locator.qa.ebayProductPageLocator;
import com.Utility.qa.BaseClass;

public class eBayProductActionPage extends BaseClass {
	ebayProductPageLocator EbayProductPageLocator = new ebayProductPageLocator();
	
	public void verifyBuyAgainpagedisplaysuccessfuly() {
		
		boolean verifyBayAgain = EbayProductPageLocator.verifyByAgainPage.isDisplayed();
		Assert.assertTrue(verifyBayAgain);
		
	}
	
	

}

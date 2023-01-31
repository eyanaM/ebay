package stepDeff;

import com.Action.qa.eBayBabyPageActions;
import com.Action.qa.eBayBooksPageActions;
import com.Action.qa.eBayHomePageActions;
import com.Action.qa.eBayProductActionPage;
import com.Utility.qa.BaseClass;
import com.Utility.qa.utilityClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ebayStepDeffClass extends BaseClass {
	eBayBooksPageActions EBayBooksPageActions= new eBayBooksPageActions();
	eBayHomePageActions EBayHomePageActions = new eBayHomePageActions();
	eBayBabyPageActions EBayBabyPageActions = new eBayBabyPageActions();
	eBayProductActionPage EBayProductActionPage = new eBayProductActionPage();
	
	
	@Given("^Launching Application <\"([^\"]*)\">$")
	public void launching_Application(String URL) throws Throwable {
	    
	
		LaunchinURL(URL);
		
	    
	}

	@Then("^ckick books$")
	public void ckick_books() throws Throwable {
		
		EBayHomePageActions.clickBookundertheCatagoryDropdown();
		
	   
	}

	@Then("^click in search button$")
	public void click_in_search_button() throws Throwable {
		
		EBayHomePageActions.clickinsearchbutton();
		
		utilityClass.takeMyScreenshot(driver, "Books Page");
	    
	}

	@Then("^Verify Books Page is display$")
	public void verify_Books_Page_is_display() throws Throwable {
		EBayBooksPageActions.verifyBooksPageisdisplay();
	    
	}

	@Then("^click Baby under All Catagory$")
	public void click_Baby_under_All_Catagory() throws Throwable {
		EBayBooksPageActions.clickBabyunderAllCatagory();
	    
	}

	@Then("^enter Toys in search field$")
	public void enter_Toys_in_search_field() throws Throwable {
		EBayBooksPageActions.enterToysinsearchfield();
		
	}

	@Then("^click search buttton$")
	public void click_search_buttton() throws Throwable {
		EBayBooksPageActions.searchbutttonclick();
	    
	}

	@Then("^Verify Toys are displayed$")
	public void verify_Toys_are_displayed() throws Throwable {
		EBayBabyPageActions.verifyToysaredisplayed();
		
		utilityClass.takeMyScreenshot(driver, "Baby Page");
	    
	}
	@Then("^mouseOver on MyeBay for Buy Again$")
	public void mouseover_on_MyeBay_for_Buy_Again() throws Throwable {
		
		EBayBabyPageActions.mouseoveronMyeBayforBuyAgain();
	}

	@Then("^click Buy Again under MyeBay$")
	public void click_Buy_Again_under_MyeBay() throws Throwable {
		EBayBabyPageActions.clickBuyAgainunderMyeBay();
		
		
	}

	@Then("^verify Buy Again page display successfuly$")
	public void verify_Buy_Again_page_display_successfuly() throws Throwable {
		
		EBayProductActionPage.verifyBuyAgainpagedisplaysuccessfuly();
		utilityClass.takeMyScreenshot(driver,"Product Page" );
	}





}

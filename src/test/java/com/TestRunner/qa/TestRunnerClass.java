package com.TestRunner.qa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.qa.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features = {"src/test/resources/TheEbayFeatures"},
plugin = {"json:target/cucumber.json"},
  glue = "stepDeff",tags = {"@test"})

public class TestRunnerClass extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void starrrtURL() {
		BaseClass test= new BaseClass();
		test.initBrowser();
		
		
		
	}
	@AfterTest
	public void closeddURL() {
		BaseClass test= new BaseClass();
		test.driver.close();
	
	}

}

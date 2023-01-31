package com.Utility.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;





public class BaseClass {
	public static WebDriver driver;
	public static Properties prop; 
	
	
	public BaseClass() {
		try {
			FileInputStream fls= new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\com\\confiq\\qa\\confiqFile.properties");
			prop = new Properties();
			prop.load(fls);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void initBrowser() {
		String BrowserSet=prop.getProperty("Browser");
		if (BrowserSet.equals("Chr")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(testData.ImplicitlyWait));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(testData.PageLoadTimeOut));
			
		
			
			
			
			
		}
		
		else if (BrowserSet.equals("FireFox")) {
			
		}
		
	}
	
	public static void LaunchinURL(String URL) {
		driver.get(prop.getProperty("URL"));
		
	}

}


package org;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}
	
	@BeforeMethod
	public void openApp() throws Exception
	{		
		
			driver =new FirefoxDriver();
			Thread.sleep(500);
			driver.get("https://sakshingp.github.io/assignment/login.html");
			String Title = driver.getTitle();
			Reporter.log(Title);
			
		}

	
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
		Reporter.log("Closing the Browser",true);
	}
}

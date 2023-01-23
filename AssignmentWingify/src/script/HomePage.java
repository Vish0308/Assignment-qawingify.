package script;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.EnterUsernameAndPassword;
import page.HomePageCrenditial;

public class HomePage extends BaseTest {

	@Test()
	public void ClickAmount() throws InterruptedException 
	
	{
		EnterUsernameAndPassword Login = new EnterUsernameAndPassword(driver); 
	Thread.sleep(500);
		
	Login.EnterUsername();
		
		Thread.sleep(500);
		Login.EnterPassword();
		Thread.sleep(500);
		
		//Click check box
	    Login.ClickCheckBox();
	
		//Click login
		Login.ClickLoginButton();
		
		HomePageCrenditial Home= new HomePageCrenditial(driver);
		 Home.ClickAmount();
		 
		 
		 
	}
	
}

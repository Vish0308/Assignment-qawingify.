package script;

import static org.testng.Assert.assertEquals;

import org.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;

import page.EnterUsernameAndPassword;

public class LoginPage extends BaseTest{
	@Test()
public void EnterVaildLogin() throws InterruptedException 
{
	EnterUsernameAndPassword Login = new EnterUsernameAndPassword(driver); 
	Thread.sleep(500);
	//click username
	Login.EnterUsername();
	
	Thread.sleep(500);
	//click password
	Login.EnterPassword();
	Thread.sleep(500);
	
	//Click login
	Login.ClickLoginButton();

	
	String title = driver.getTitle();
	Reporter.log(title);
	assertEquals(title, "Demo App", "Verify Page Title");
	
	
	}
	
		
}
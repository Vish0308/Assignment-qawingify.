package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnterUsernameAndPassword

{
	
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(id="password")
	private WebElement pwTB;
	
	@FindBy(id ="log-in")
	private WebElement LoginB;
	@FindBy(xpath = "/html/body/div/div/form/div[3]/div[1]/label/input")
	private WebElement CheckBox;
	
	
	
	
	public EnterUsernameAndPassword(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void EnterUsername()
	{
		unTB.sendKeys("Admin");
		Reporter.log("Pass",true);
		
	}
	
	public void EnterPassword()
	{
		pwTB.sendKeys("admin123");
		Reporter.log("Pass",true);
	}
	public void ClickCheckBox()
	{
		CheckBox.click();
		
		
		
	}
	
	
	public void ClickLoginButton()
	{
		LoginB.click();
		
		
	
	}
		

}

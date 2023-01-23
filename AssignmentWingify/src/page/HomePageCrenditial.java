package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageCrenditial {
	@FindBy(id ="amount")
	private WebElement AmountB;
	
	
	
	
	public HomePageCrenditial(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void ClickAmount()
	{
		AmountB.click();
		
	}

}

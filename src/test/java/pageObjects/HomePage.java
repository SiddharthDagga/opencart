package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//WebElements 

@FindBy(xpath="//a[normalize-space()='Register here']") 
WebElement lnkRegister;


	//action methods 
	public void clickRegister()
	{
		lnkRegister.click();
	}

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//WebElements 

	@FindBy(xpath="//input[@id='userEmail']") 
	WebElement txtEmailAddress;
	
	@FindBy(xpath = "//input[@id='userPassword']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='login']")
	WebElement btnLogin;
	

	//action methods 
	public void setEmail(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	
	public void setPass(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clearField()
	{
		txtEmailAddress.clear();
		txtPassword.clear();
	}

	
}

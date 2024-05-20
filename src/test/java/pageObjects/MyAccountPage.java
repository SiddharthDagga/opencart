package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	
	public MyAccountPage(WebDriver driver) 
	{
		super(driver);
	}
	
	//Webelemnts 
	@FindBy(xpath="//section/div/h4[contains(text(),'Filters')]")
	WebElement msgHeading;
	
	@FindBy(xpath = "(//button[contains(@class,'btn-custom')])[4]")
	WebElement lnkLogout;
	
	
	//action methods 
	public boolean isMyAccountExists() 
	{
		try {
				return (msgHeading.isDisplayed());
		} 
		catch(Exception e){
			return (false);
		}
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}
}

package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass{
	
	
		@Test(groups= {"sanity", "master"})
		public void verify_login()
		{
			try{
			//Login page
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPass(p.getProperty("password"));
			lp.clickLogin();
			
			//My Account Page
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetPage=macc.isMyAccountExists();
			
			Assert.assertEquals(targetPage, true);
			macc.clickLogout();
			}
			catch(Exception e)
			{
				Assert.fail();
			}
			
			
		}
	

}

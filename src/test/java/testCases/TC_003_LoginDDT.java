package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass
{
		@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
		public void verifyLoginDDT(String email, String password, String exp)
		{
			//Login page
			try {
				
			LoginPage lp=new LoginPage(driver);
			lp.setEmail(email);
			lp.setPass(password);
			lp.clickLogin();
			
			//My Account Page
			MyAccountPage macc=new MyAccountPage(driver);
			boolean targetPage=macc.isMyAccountExists();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(true);
				}else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(false);
				}else
				{
					Assert.assertTrue(true);
				}
			}
			lp.clearField();
		} catch(Exception e)
			{
				Assert.assertTrue(false);
			}
			
		}


}

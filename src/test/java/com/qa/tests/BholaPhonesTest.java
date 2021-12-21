package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.qa.enums.ConfigProperties;
import com.qa.pages.DashboardPage;
import com.qa.pages.HomePage;
import com.qa.pages.SignInPage;
import com.qa.utils.PropertyUtils;


public class BholaPhonesTest extends BaseTest{	

	@Parameters({"browser1"})
	@Test(description = "Vaidate user is able to successfully sign in with the given credentials")
	public  void signInPositive(String browser) throws Exception {
		System.out.println("browser is "+browser);
		HomePage.clickOnSignIn();
		
		SignInPage.enterEmail();
		SignInPage.enterPassword();
		SignInPage.clickOnLogin();
		
		//Validate correct username is displayed in the application
		Assert.assertEquals(DashboardPage.getUserNameText(), PropertyUtils.get(ConfigProperties.USERNAME));
		
		DashboardPage.clickOnUserName();
		DashboardPage.clickOnLogout();
}	
	
	@Parameters({"browser2"})
	@Test(description = "Vaidate user is able to successfully sign in with the given credentials - Failure scenario")
	// This is designed to always fail
	public  void signInNegative(String browser) throws Exception {
		System.out.println("browser is "+browser);
		HomePage.clickOnSignIn();
		
		SignInPage.enterEmail();
		SignInPage.enterPassword();
		SignInPage.clickOnLogin();
	
		Assert.assertTrue(false);
	}
}

package com.qa.pages;

import org.openqa.selenium.By;
import com.qa.enums.ConfigProperties;
import com.qa.enums.WaitStrategy;
import com.qa.utils.PropertyUtils;

public class SignInPage extends BasePage {


	private final static By textBoxEmail = By.name("email");
	private final static By textBoxPassword = By.name("password");
	private final static By btnLogin = By.xpath("//button[@type='submit']");

	// This method enters email(fetched from config.properties) into the Email textbox in application
	public static void enterEmail() {
		sendKeys(textBoxEmail,PropertyUtils.get(ConfigProperties.EMAIL),WaitStrategy.VISIBLE);
	}

	// This method enters password(fetched from config.properties) into the Password textbox in application
	public static void enterPassword() {
		sendKeys(textBoxPassword, PropertyUtils.get(ConfigProperties.PASSWORD) ,WaitStrategy.VISIBLE);
	}

	
	// This method clicks on Login button in application
	public static void clickOnLogin() {
		click(btnLogin,WaitStrategy.CLICKABLE);
	}

}

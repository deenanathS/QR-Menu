package com.qa.pages;

import org.openqa.selenium.By;
import com.qa.enums.WaitStrategy;

public class HomePage extends BasePage {

	private final static By linkSignIn = By.xpath("//a[contains(@href,'login')]");

	// This method clicks on Sign In button
	public static void clickOnSignIn() {
	click(linkSignIn,WaitStrategy.CLICKABLE);
	}
}

package com.qa.pages;

import org.openqa.selenium.By;
import com.qa.enums.WaitStrategy;
import com.qa.factories.ExplicitWaitFactory;

public class DashboardPage extends BasePage {


	private final static By linkUserName = By.xpath("//li[@class='dropdown']/a");

	// This method fetches text of user name link from application, trims it and then return the same.
	public static String getUserNameText() {
		ExplicitWaitFactory.performWaitStrategy(WaitStrategy.VISIBLE, linkUserName);
		return getElementText(linkUserName).trim() ;
	}
	
}

package com.qa.pages;

import org.openqa.selenium.By;
import com.qa.enums.WaitStrategy;

public class DashboardPage extends BasePage {


	private final static By linkUserName = By.xpath("//li[@class='dropdown']/a");
	private final static By linkLogout = By.xpath("//a[contains(@href,'logout')]");

	// This method fetches text of user name link from application, trims it and then return the same.
	public static String getUserNameText() {
		return getElementText(linkUserName, WaitStrategy.VISIBLE).trim() ;
	}
	
	// This method clicks on user name link
	public static void clickOnUserName() {
		 click(linkUserName, WaitStrategy.CLICKABLE) ;
	}
	
	// This method clicks on user name link
		public static void clickOnLogout() {
			 click(linkLogout, WaitStrategy.CLICKABLE) ;
		}
	
}

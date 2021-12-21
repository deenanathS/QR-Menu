package com.qa.pages;

import org.openqa.selenium.By;
import com.qa.driver.DriverManager;
import com.qa.enums.WaitStrategy;
import com.qa.factories.ExplicitWaitFactory;

// This class contains methods for common actions which can be used across all the pages. All the page classes extends this class.
public class BasePage {
	
	protected BasePage() {}
	
	protected static void click(By by, WaitStrategy waitStrategy) {
		ExplicitWaitFactory.performWaitStrategy(waitStrategy, by).click();
	}
	
	protected static void sendKeys(By by, String value, WaitStrategy waitStrategy) {
		ExplicitWaitFactory.performWaitStrategy(waitStrategy, by).sendKeys(value);
	}
	
	protected static String getPageTitle() {
		return DriverManager.getDriver().getTitle() ;
	}
	
	protected static String getElementText(By by, WaitStrategy waitStrategy) {
		return ExplicitWaitFactory.performWaitStrategy(waitStrategy, by).getText();
	}

}

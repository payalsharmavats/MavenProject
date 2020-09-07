package com.qa.ORGHRMPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

abstract public class BasePage {
	protected WebDriver driver;
	
   public BasePage(WebDriver driver) {
	this.driver=driver;
}
   public String pageTitle() {
	String pageTitle=driver.getTitle();
	return pageTitle;
}
   public WebElement getElement(By locator) {
	   WebElement elm= driver.findElement(locator);
	   return elm;
   }
   /*public String getElementText(By locator) {
	   return driver.findElement(locator).getText();
   }
   */
}

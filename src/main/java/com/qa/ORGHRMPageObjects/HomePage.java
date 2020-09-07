package com.qa.ORGHRMPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.ORGHRMPageObjects.Admin.AdminPage;
import com.qa.ORGHRMPageObjects.Admin.UserManagement.UserMgmtPage;

public class HomePage extends BasePage {
	// locate the elements
	private By welcomeLink = By.id("welcome");
	private By logOutLink = By.linkText("Logout");
	private By dashBoardText = By.xpath("//h1[text()='Dashboard']");
	private By adminLink = By.id("menu_admin_viewAdminModule");

//constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	// to get the elements

	public WebElement getWelcomeLink() {
		return getElement(welcomeLink);
	}

	public WebElement getLogOutLink() {
		return getElement(logOutLink);
	}

	public WebElement getDashBoardText() {
		return getElement(dashBoardText);
	}

public WebElement getAdminLink() {
		return getElement(adminLink);
	}

	//to perform the functionality
    //logout
	public LoginPage doLogOut() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getWelcomeLink().click();
		getLogOutLink().click();
		return new LoginPage(driver);

	}
    //get the heading of dashboard
	public String getDashBoradHeading() {
		return getDashBoardText().getText();
	}
	//click the admin tab
	public AdminPage clickAdminLink() {
		getAdminLink().click();
		return new AdminPage(driver);
		
	}

	
}

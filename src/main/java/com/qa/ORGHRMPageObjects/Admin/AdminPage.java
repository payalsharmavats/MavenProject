package com.qa.ORGHRMPageObjects.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.ORGHRMPageObjects.HomePage;
import com.qa.ORGHRMPageObjects.Admin.UserManagement.UserMgmtPage;

public class AdminPage extends HomePage {
	private By addUserBtn = By.id("btnAdd");
	By usernametxt = By.xpath("//a[contains(text(),'Payal')]/parent::td/preceding-sibling::td/input");
	By deleteBtn = By.id("btnDelete");

	By confirmDelete = By.id("dialogDeleteBtn");
	By searchUser=By.id("searchSystemUser_userName");
	By clickSearchBtn=By.id("searchBtn");

	public AdminPage(WebDriver driver) {
		super(driver);

	}

	public UserMgmtPage clickAddUserBtn() {
		getElement(addUserBtn).click();
		return new UserMgmtPage(driver);
	}

	public void clickDeleteBtn() {
		getElement(deleteBtn).click();
		getElement(confirmDelete).click();

	}

	public void selectUserDel() {
		getElement(usernametxt).click();

	}
	public AdminPage searchUser(String username) {
		getElement(searchUser).sendKeys(username);
		getElement(clickSearchBtn).click();
		return new AdminPage(driver);
		
	}
}

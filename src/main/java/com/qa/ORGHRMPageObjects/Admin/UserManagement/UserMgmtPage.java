package com.qa.ORGHRMPageObjects.Admin.UserManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.ORGHRMPageObjects.HomePage;
import com.qa.ORGHRMPageObjects.Admin.AdminPage;

public class UserMgmtPage extends AdminPage {
	// By userType=By.id("systemUser_userType");
	private By empNameTxtFld = By.id("systemUser_employeeName_empName");
	private By userNameTxtFld = By.id("systemUser_userName");
	
	By saveBtn = By.id("btnSave");
	 

	public UserMgmtPage(WebDriver driver) {
		super(driver);

	}
	

	public UserMgmtPage addUser(String empname,String username) {
		getElement(empNameTxtFld).sendKeys(empname);
		getElement(userNameTxtFld).sendKeys(username);
		
		getElement(saveBtn).click();
		return new UserMgmtPage(driver);
	}

	/*public void clickSaveBtn() {
		getElement(saveBtn).click();

	}*/
	
	

}

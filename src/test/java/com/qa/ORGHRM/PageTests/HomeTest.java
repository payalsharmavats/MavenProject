package com.qa.ORGHRM.PageTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ORGHRMPageObjects.HomePage;
import com.qa.ORGHRMPageObjects.Admin.AdminPage;
import com.qa.ORGHRMPageObjects.Admin.UserManagement.UserMgmtPage;

import utility.PropertiesFileReader;

public class HomeTest extends BaseTest {
	HomePage hp;
	AdminPage adminPage;
	UserMgmtPage userPage;

	@Test(enabled = false)
	public void verifyLogOut() {
		// step1:login
		hp = loginPage.doValidLogin("Admin", "admin123");
		// step2:logout
		loginPage = hp.doLogOut();

	}

	// add the user
	@Test (priority=1)
    public void verifyAddUser() throws InterruptedException  {
	 
	  String username = PropertiesFileReader.getConfigProp("username"); String
	  password = PropertiesFileReader.getConfigProp("password"); hp =
	  loginPage.doValidLogin(username, password); 
	  String expDashbrdText = "Dashboard"; String actDashbrdText = hp.getDashBoradHeading();
	  AssertJUnit.assertEquals(actDashbrdText, expDashbrdText);
	  adminPage= hp.clickAdminLink(); 
	 Thread.sleep(2000);
	  userPage=adminPage.clickAddUserBtn();
	  userPage.addUser("Thomas Fleming","Payal12");
	}

	// Delete user
	@Test (priority=2)
	public void verifyDeleteUser() throws InterruptedException {
		/*String username = PropertiesFileReader.getConfigProp("username");
		String password = PropertiesFileReader.getConfigProp("password");
		hp = loginPage.doValidLogin(username, password);
		String expDashbrdText = "Dashboard";
		String actDashbrdText = hp.getDashBoradHeading();
		AssertJUnit.assertEquals(actDashbrdText, expDashbrdText);*/
		 Thread.sleep(2000);
		adminPage = hp.clickAdminLink();
		adminPage.selectUserDel();
		adminPage.clickDeleteBtn();

	}

	@Test (priority=3)
	public void searchUser() {

		/*String username = PropertiesFileReader.getConfigProp("username");
		String password = PropertiesFileReader.getConfigProp("password");
		hp = loginPage.doValidLogin(username, password);
		String expDashbrdText = "Dashboard";
		String actDashbrdText = hp.getDashBoradHeading();
		AssertJUnit.assertEquals(actDashbrdText, expDashbrdText);*/
		//adminPage = hp.clickAdminLink();
		//adminPage.searchUser("anita");
	}
}

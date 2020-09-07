package com.qa.ORGHRM.PageTests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ORGHRMPageObjects.HomePage;
import com.qa.ORGHRMPageObjects.LoginPage;

import utility.PropertiesFileReader;

public class LoginTest extends BaseTest {
	HomePage hp;
      @Test(enabled=false)
      public void verifyValidLoginTest() {
    	  String username=PropertiesFileReader.getConfigProp("username");
    	  String password=PropertiesFileReader.getConfigProp("password");
    	  hp=loginPage.doValidLogin(username,password);
    	  String expDashbrdText="Dashboard";
    	  String actDashbrdText=hp.getDashBoradHeading();
    	  Assert.assertEquals(actDashbrdText, expDashbrdText);
      }
      @Test
      public void verifyInValidLoginTest() {
    	  String username=PropertiesFileReader.getConfigProp("username");
    	  String password=PropertiesFileReader.getConfigProp("password");
    	  hp=loginPage.doValidLogin(username,password);
    	  String expDashbrdText="Forgot your password?";
    	  String actDashbrdText=loginPage.getForgetPwdText();
    	  System.out.println("Actual"+actDashbrdText);
    	  Assert.assertEquals(actDashbrdText, expDashbrdText);
      }
	
}

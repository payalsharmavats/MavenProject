package com.qa.ORGHRM.PageTests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.ORGHRMPageObjects.BasePage;
import com.qa.ORGHRMPageObjects.HomePage;
import com.qa.ORGHRMPageObjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import static utility.PropertiesFileReader.*;

public class BaseTest {
	WebDriver driver;
	LoginPage loginPage;
	
@Test
public void browserSetup() {
	String browser=getConfigProp("browser");
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")){
				WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
			}
	String appUrl=getConfigProp("appUrl");
	driver.get(appUrl);
	driver.manage().window().maximize();
	loginPage=new LoginPage(driver);
}
}

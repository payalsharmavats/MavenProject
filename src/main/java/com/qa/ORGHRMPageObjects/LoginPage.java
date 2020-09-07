package com.qa.ORGHRMPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	private By unameTxtField = By.id("txtUsername");
	private By pwdTxtField = By.id("txtPassword");
	private By loginButton = By.xpath("//input[@id='btnLogin']");
private By forgotpwdLink=By.partialLinkText("Forgot your password?");
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getUnameTxtField() {
		return getElement(unameTxtField);

	}

	public WebElement getPwdTxtField() {
		return getElement(pwdTxtField);
	}

	public WebElement getLoginButton() {
		return getElement(loginButton);
	}
	

	public WebElement getForgotpwdLink() {
		return getElement(forgotpwdLink);
	}

	public HomePage doValidLogin(String username,String password) {
		getUnameTxtField().sendKeys(username);
		getPwdTxtField().sendKeys(password);
		getElement(loginButton).click();
		//return new HomePage(driver);
		return new HomePage(driver);
		
	}
	public String getForgetPwdText() {
		return getForgotpwdLink().getText();
	}
}

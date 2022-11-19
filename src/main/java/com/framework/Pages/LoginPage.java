package com.framework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="user-name")
	WebElement uName;
	
	@FindBy(id="password")
	WebElement uPass;
	
	@FindBy(id="login-button")
	WebElement btnLogin;
	

	public void setuName(String username) {
		uName.sendKeys(username);
	}

	

	public void setuPass(String password) {
		uPass.sendKeys(password);
	}
	
	public void btnClick()
	{
		btnLogin.click();
	}
	
}

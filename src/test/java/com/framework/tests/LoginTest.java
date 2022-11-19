package com.framework.tests;

import org.testng.annotations.Test;

import com.framework.Pages.BasePage;
import com.framework.Pages.LoginPage;

public class LoginTest extends BasePage
{
	
	@Test
	public void validateLogin()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setuName("standard_user");
		lp.setuPass("secret_sauce");
		lp.btnClick();
	}
}

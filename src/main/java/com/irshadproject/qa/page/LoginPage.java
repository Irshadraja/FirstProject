package com.irshadproject.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.irshadproject.qa.actiondriver.ActionDriver;
import com.irshadproject.qa.base.Base;

public class LoginPage  extends Base 
{
	ActionDriver actiondriver=new ActionDriver();
	@FindBy(id="user-name") WebElement userId;
	@FindBy(id="password") WebElement pass;
	@FindBy(id="login-button") WebElement loginBtn;
	
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public ProductPage ValidateLoginWithValidData(String userName,String password) 
	{
		actiondriver.type(userId, userName);
		actiondriver.type(pass, password);
		actiondriver.click(driver, loginBtn);
		return new ProductPage();
	}
	
	

}

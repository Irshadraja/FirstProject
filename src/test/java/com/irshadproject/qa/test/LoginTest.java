package com.irshadproject.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.irshadproject.qa.base.Base;
import com.irshadproject.qa.page.LoginPage;

public class LoginTest extends Base 
{
	LoginPage pagelogin;
	
 public LoginTest() 
 {
	 super();
 }
 
 @BeforeMethod
 public void StartBrowser() 
 {
	 setup();
	 pagelogin=new LoginPage();
 }
 
 @Test
 public void ValidateLoginWithValidDataTest() 
 {
	 pagelogin.ValidateLoginWithValidData(prob.getProperty("username"), prob.getProperty("password"));
	 
 }
}

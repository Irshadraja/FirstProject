package com.irshadproject.qa.test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.irshadproject.qa.base.Base;

import com.irshadproject.qa.page.LoginPage;
import com.irshadproject.qa.page.ProductPage;
import com.irshadproject.qa.page.YourCartPage;

public class YourCartTest extends Base 
{
	LoginPage pagelogin;
	ProductPage productpage;
	YourCartPage yourcart;
		
	
	public YourCartTest() 
	{
		super();
	}
	@BeforeMethod
	public void StartBrowser() 
	{
		setup();
		pagelogin=new LoginPage();
		pagelogin.ValidateLoginWithValidData(prob.getProperty("username"), prob.getProperty("password"));
		productpage=new ProductPage();
		productpage.ValidateAddToCart();
		yourcart=new YourCartPage();
	}
	@Test
	public void ValidateCheckOutTest() 
	{
		yourcart.ValidateCheckOut(driver);
	}
			
	

}

package com.irshadproject.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.irshadproject.qa.base.Base;
import com.irshadproject.qa.page.CheckOutYourInfoPage;
import com.irshadproject.qa.page.LoginPage;
import com.irshadproject.qa.page.ProductPage;
import com.irshadproject.qa.page.YourCartPage;

public class CheckOutYourInfoTest extends Base 
{
	LoginPage pagelogin;
	ProductPage productpage;
	YourCartPage yourcart;
	
	CheckOutYourInfoPage checkcartyourinfopage;
	
	public CheckOutYourInfoTest() 
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
		yourcart.ValidateCheckOut(driver);
		checkcartyourinfopage=new CheckOutYourInfoPage();
	}
		@Test
		public void ValidateCheckOutYourInfoTest() 
		{
			checkcartyourinfopage.ValidateCheckOutYourInfo(prob.getProperty("firstname"), prob.getProperty("lastname"), prob.getProperty("zipcode"));
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}



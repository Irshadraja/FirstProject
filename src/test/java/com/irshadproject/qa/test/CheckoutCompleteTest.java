package com.irshadproject.qa.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.irshadproject.qa.base.Base;
import com.irshadproject.qa.page.CheckOutYourInfoPage;
import com.irshadproject.qa.page.CheckoutCompletePage;
import com.irshadproject.qa.page.CheckoutOverviewPage;
import com.irshadproject.qa.page.LoginPage;
import com.irshadproject.qa.page.ProductPage;
import com.irshadproject.qa.page.YourCartPage;

public class CheckoutCompleteTest extends Base 
{
	LoginPage loginpage;
	YourCartPage yourcartpage;
	ProductPage productpage;
	CheckOutYourInfoPage checkoutyourinfopage;
	CheckoutOverviewPage checkoutoverviewpage;
	
	CheckoutCompletePage checkoutcompletepage; 
	
	
	public CheckoutCompleteTest() 
	{
		super();
	}
	@BeforeMethod
	public void startbrowser() 
	{
		setup();
		loginpage=new LoginPage() ;
		loginpage.ValidateLoginWithValidData(prob.getProperty("username"), prob.getProperty("password"));
		productpage=new ProductPage();
		productpage.ValidateAddToCart();		
		yourcartpage=new YourCartPage();
		yourcartpage.ValidateCheckOut(driver);
		
		checkoutyourinfopage=new CheckOutYourInfoPage();
		checkoutyourinfopage.ValidateCheckOutYourInfo(prob.getProperty("firstname"), prob.getProperty("lastname"), prob.getProperty("zipcode"));
		checkoutoverviewpage=new CheckoutOverviewPage() ;
		checkoutoverviewpage.ValidateCheckoutOverviewPage();
		 checkoutcompletepage=new CheckoutCompletePage();
	}
		
		@Test
		public void ValidateCheckoutCompletetest() 
		{
			checkoutcompletepage.ValidateCheckoutCompletePage();
			
		}
		
		
		
		
		
		
		
		
		
	}
	
	



package com.irshadproject.qa.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.irshadproject.qa.base.Base;
import com.irshadproject.qa.page.LoginPage;
import com.irshadproject.qa.page.ProductPage;

public class ProductTest extends Base
{
	LoginPage pagelogin;
	ProductPage productpage;
	
	public ProductTest() 
	{
		super();
	}
	@BeforeMethod
	public void StartBrowser()
	{
		setup();
		pagelogin=new  LoginPage();
		pagelogin.ValidateLoginWithValidData(prob.getProperty("username"), prob.getProperty("password"));
		productpage=new ProductPage();
	}
		@Test
	public void ValidateAddToCart() 
	{
		
		productpage.ValidateAddToCart();
		
	}
		

}

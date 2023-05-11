package com.irshadproject.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.irshadproject.qa.actiondriver.ActionDriver;
import com.irshadproject.qa.base.Base;

public class CheckoutCompletePage extends Base 
{
	ActionDriver actiondriver=new ActionDriver();
	@FindBy(id="back-to-products")WebElement backHome;
	
	public CheckoutCompletePage() 
	{
		PageFactory.initElements(driver, this);
	}
	public void ValidateCheckoutCompletePage() 
	{
		actiondriver.click(driver, backHome);
	}
	
	

}

package com.irshadproject.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.irshadproject.qa.actiondriver.ActionDriver;
import com.irshadproject.qa.base.Base;

public class CheckoutOverviewPage extends Base 
{
	ActionDriver actiondriver=new ActionDriver();
	@FindBy(id="finish")WebElement finish;
	
	public CheckoutOverviewPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public CheckoutCompletePage ValidateCheckoutOverviewPage() 
	{
		actiondriver.click(driver, finish);
		return new CheckoutCompletePage();
	}
	

}

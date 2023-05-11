package com.irshadproject.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.irshadproject.qa.actiondriver.ActionDriver;
import com.irshadproject.qa.base.Base;

public class YourCartPage extends Base 
{
	ActionDriver actiondriver=new ActionDriver();
	@FindBy(id="checkout")WebElement checkOut;
	
	public YourCartPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public CheckOutYourInfoPage ValidateCheckOut(WebDriver driver) 
	{
		actiondriver.click(driver, checkOut);
		return new CheckOutYourInfoPage();
	}
	
	
	

}

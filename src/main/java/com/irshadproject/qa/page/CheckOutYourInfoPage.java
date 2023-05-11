package com.irshadproject.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.irshadproject.qa.actiondriver.ActionDriver;
import com.irshadproject.qa.base.Base;

public class CheckOutYourInfoPage extends Base
{
	ActionDriver actiondriver=new ActionDriver();
	@FindBy(id="first-name")WebElement firstName;
	@FindBy(id="last-name")WebElement lasttName;
	@FindBy(id="postal-code")WebElement zipcode;
	@FindBy(id="continue")WebElement secondcontiouebtn;
	
	public CheckOutYourInfoPage() 
	{
		PageFactory.initElements(driver, this);	
	}
	public CheckoutOverviewPage ValidateCheckOutYourInfo(String firstname,String lastname,String zipCode) 
	{
		actiondriver.type(firstName, firstname);
		actiondriver.type(lasttName, lastname);
		actiondriver.type(zipcode, zipCode);
		actiondriver.click(driver, secondcontiouebtn);
		return new CheckoutOverviewPage();
		
		
	}

}

package com.irshadproject.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.irshadproject.qa.actiondriver.ActionDriver;
import com.irshadproject.qa.base.Base;

public class ProductPage extends Base
{
	ActionDriver actiondriver=new ActionDriver();
	@FindBy(id="add-to-cart-sauce-labs-backpack")WebElement addToCart;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")WebElement addToCartBtn;
	
	
	public ProductPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public YourCartPage ValidateAddToCart() 
	{
		actiondriver.click(driver, addToCart);
		actiondriver.click(driver, addToCartBtn);
		return new YourCartPage();
	}
	
}

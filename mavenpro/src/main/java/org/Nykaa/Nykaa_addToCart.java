package org.Nykaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaa_addToCart {
	static WebDriver driver;
	@FindBy(xpath="//span[text()='Add to Bag'][1]")
	private static WebElement addtocart;
	
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static WebElement getAddtocart() {
		return addtocart;
	} 
	
	public Nykaa_addToCart(WebDriver driver4) {
		Nykaa_addToCart.driver=driver4;
		 PageFactory.initElements(driver,this);
	}
}

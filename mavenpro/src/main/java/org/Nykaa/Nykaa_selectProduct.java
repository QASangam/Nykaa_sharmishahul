package org.Nykaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaa_selectProduct {
	static WebDriver driver;
	
public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getSelectproduct() {
		return selectproduct;
	}

  @FindBy(xpath="//div[@class='css-43m2vm']/img[@alt='Lakme Absolute Glow Primer']")
  private static WebElement selectproduct;

 public  Nykaa_selectProduct(WebDriver driver2) {
	 Nykaa_selectProduct.driver=driver2;
	 PageFactory.initElements(driver,this);
 }
}


package org.Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaa_login {
	static WebDriver driver;
	@FindBy(xpath="//button[@class='css-v61n2j e8tshxd0']")
	private static WebElement login;
	@FindBy(xpath="//input[@type='email']")
	private static WebElement clickphtag;
	@FindBy(name="emailMobile")
	private static WebElement enternum;
	@FindBy(id="submitVerification")
	private static WebElement click;

	
	public static WebDriver getDriver() {
		return driver;
	}
	public static WebElement getLogin() {
		return login;
	}
	public static WebElement getClickphtag() {
		return clickphtag;
	}
	public static WebElement getEnternum() {
		return enternum;
	}
	public static WebElement getClick() {
		return click;
	}
	public  Nykaa_login(WebDriver driver5) {
		 Nykaa_login.driver=driver5;
		 PageFactory.initElements(driver,this);
	 }
}

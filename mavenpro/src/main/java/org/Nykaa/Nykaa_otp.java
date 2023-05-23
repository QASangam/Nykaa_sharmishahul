package org.Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaa_otp {
	static WebDriver driver;
	@FindBy(xpath="//input[@type='number']")
	private static WebElement enterotp;
	@FindBy(xpath="//button[@type='submit']")
	private static WebElement submit;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static WebElement getEnterotp() {
		return enterotp;
	}
	public static WebElement getSubmit() {
		return submit;
	}
	public Nykaa_otp(WebDriver driver6) {
		Nykaa_otp.driver=driver6;
		PageFactory.initElements(driver, this);
	}
}

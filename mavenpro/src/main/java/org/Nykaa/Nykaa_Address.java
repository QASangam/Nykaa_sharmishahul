package org.Nykaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaa_Address {
	static WebDriver driver;
	@FindBy(xpath="//div[@class='css-1pan5g8 e1gecm6x0']")
	private static WebElement add;
	@FindBy(xpath="//span[@class='slider round css-0 e1rxn2v03']")
	private static WebElement defaultaddress;
	@FindBy(xpath="//input[@placeholder='Pincode']")
	private static WebElement pincodeclear;
	@FindBy(xpath="//input[@placeholder='Pincode']")
	private static WebElement pincode;
	@FindBy(xpath="//input[@placeholder='House/ Flat/ Office No.']")
	private static WebElement doornoclear;
	@FindBy(xpath="//input[@placeholder='House/ Flat/ Office No.']")
	private static WebElement doorno;
	@FindBy(xpath="//textarea[@placeholder='Road Name/ Area /Colony']")
	private static WebElement area;
	@FindBy(xpath="//input[@placeholder='Name']")
	private static WebElement name;
	@FindBy(xpath="//input[@placeholder='Phone']")
	private static WebElement phone;
	@FindBy(xpath="//button[@class='css-mq2cy2 e8tshxd0']")
	private static WebElement proceed;
	public static WebDriver getDriver() {
		return driver;
	}
	public static WebElement getAdd() {
		return add;
	}
	public static WebElement getDefaultaddress() {
		return defaultaddress;
	}
	public static WebElement getPincodeclear() {
		return pincodeclear;
	}
	public static WebElement getPincode() {
		return pincode;
	}
	public static WebElement getDoornoclear() {
		return doornoclear;
	}
	public static WebElement getDoorno() {
		return doorno;
	}
	public static WebElement getArea() {
		return area;
	}
	public static WebElement getName() {
		return name;
	}
	public static WebElement getPhone() {
		return phone;
	}
	public static WebElement getProceed() {
		return proceed;
	}
	public Nykaa_Address(WebDriver driver7) {
		Nykaa_Address.driver=driver7;
		PageFactory.initElements(driver, this);
	}
}

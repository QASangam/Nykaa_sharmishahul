package org.Nykaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Nykaa_cartpage {
	static WebDriver driver;
	@FindBy(xpath="//span[@class='cart-count']")
	private static WebElement cart;
	@FindBy(xpath="//iframe[@class='css-acpm4k']")
	private static WebElement bagframe;
	@FindBy(xpath="//span[text()='Proceed']")
	private static WebElement proceed;
	
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static WebElement getCart() {
		return cart;
	}
	public static WebElement getBagframe() {
		return bagframe;
	}
	public static WebElement getProceed() {
		return proceed;
	}
	 
	public  Nykaa_cartpage(WebDriver driver4) {
		Nykaa_cartpage.driver=driver4;
		 PageFactory.initElements(driver,this);
	 }

}










//public void gotocartpage() {
//	driver.findElement(By.xpath("//span[@class='cart-count']")).click();
//}
//@Test(priority=8)
//public void proceed() throws InterruptedException {
//	WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
//	driver.switchTo().frame(frame1);
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//span[text()='Proceed']")).click();
//}
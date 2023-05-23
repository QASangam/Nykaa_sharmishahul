package org.Nykaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaa_Checkpincode {
	
	static WebDriver driver;
   @FindBy(xpath="//input[@type='tel']")
   private static WebElement checkpincode;
   @FindBy(xpath="//button[@class='css-1ivth7r']")
   private static WebElement buttonclick;
   
   
    public static WebDriver getDriver() {
	return driver;
}
public static WebElement getCheckpincode() {
	return checkpincode;
}
public static WebElement getButtonclick() {
	return buttonclick;
}
public  Nykaa_Checkpincode(WebDriver driver3) {
	Nykaa_Checkpincode.driver=driver3;
	 PageFactory.initElements(driver,this);
}
   
}










//public void checkpincode() {
//	String windowHandlebefore1= driver.getWindowHandle();
//	for(String winHandle : driver.getWindowHandles()) {
//		driver.switchTo().window(winHandle);
//	}
//	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("603209");
//	driver.findElement(By.xpath("//button[@class='css-1ivth7r']")).click();
//}
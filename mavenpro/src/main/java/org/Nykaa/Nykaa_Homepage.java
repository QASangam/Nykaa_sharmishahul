package org.Nykaa;

import java.util.concurrent.TimeUnit;

import org.adactin.Book_Hotel_pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Nykaa_Homepage {
	static WebDriver driver;
	
		
			public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getMakeup() {
		return makeup;
	}

	public static WebElement getFaceprimer() {
		return faceprimer;
	}

			@FindBy(linkText="Makeup")
			private static WebElement makeup;
			
			@FindBy(linkText="Face Primer")
			private static WebElement faceprimer;
	
			
			public Nykaa_Homepage(WebDriver driver1) {
				Nykaa_Homepage.driver=driver1;
				PageFactory.initElements(driver, this);
			}
}

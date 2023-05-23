package org.newproject.mavenpro;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;

import org.Nykaa.Nykaa_Address;
import org.Nykaa.Nykaa_Checkpincode;
import org.Nykaa.Nykaa_Homepage;
import org.Nykaa.Nykaa_addToCart;
import org.Nykaa.Nykaa_cartpage;
import org.Nykaa.Nykaa_login;
import org.Nykaa.Nykaa_otp;
import org.Nykaa.Nykaa_selectProduct;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.project.Sharmi.project.Baseclass_demo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Nykaa_ownproject extends Baseclass_demo {
	
	@Test
	public void browserlaunch() {
	browser("chrome");
	url("https://www.nykaa.com/?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa&gclid=Cj0KCQjwsIejBhDOARIsANYqkD3wvs6Fw7bVgrDOVYKAO_L2GtZPQRtDs_RcQFiOUhuDLucIB3fwxe0aAqe_EALw_wcB");
	}
	
	@Test(priority=1)
	public void Homepage() {
  Nykaa_Homepage n=new Nykaa_Homepage(driver);
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	n.getMakeup();
	Actions ac =new Actions(driver);
	 ac.moveToElement(n.getMakeup()).build().perform();
	n.getFaceprimer().click();
	}
	@Test(priority=2)
	public void selectproduct() {
		Nykaa_selectProduct s = new Nykaa_selectProduct(driver);
		String windowHandlebefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()) {
		driver.switchTo().window(winHandle);
		}
		s.getSelectproduct().click();
	}
	@Test(priority=3)
	@Parameters("a")
	public void pincode(String a) {
		Nykaa_Checkpincode c=new Nykaa_Checkpincode(driver);
		String windowHandlebefore1= driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		c.getCheckpincode().sendKeys(a);
		c.getButtonclick().click();
	}
	@Test(priority=4)
	public void addToCart() {
		Nykaa_addToCart a =new Nykaa_addToCart(driver);
		a.getAddtocart().click();
	}
	@Test(priority=5)
	public void cartpage() throws InterruptedException {
		Nykaa_cartpage  ca= new Nykaa_cartpage(driver);
		ca.getCart().click();
		//ca.getBagframe();
		driver.switchTo().frame(ca.getBagframe());
		Thread.sleep(2000);
		ca.getProceed().click();
	}
	@Test(priority=6)
	@Parameters("phonenum")
	public void login(String phonenum) {
		Nykaa_login l = new Nykaa_login(driver);
		l.getLogin().click();
		l.getClickphtag().click();
		l.getEnternum().sendKeys(phonenum);
		l.getClick().click();
	}
	@Test(priority=7)
	public void otp() {
		Nykaa_otp o=new Nykaa_otp (driver);
		System.out.println("enter otp:");
		Scanner sc = new Scanner(System.in);
		String p = sc.nextLine();
	o.getEnterotp().sendKeys(p);
	o.getSubmit().click();
	}
	@Test(priority=8)
	@Parameters({"pincode","doorno","street","name","Phoneno"})
	public void address(String pincode,String doorno,String street,String name,String Phoneno) throws InterruptedException {
		Nykaa_Address address =new Nykaa_Address(driver);
		address.getAdd().click();
		Thread.sleep(2000);
		//address.getDefaultaddress().click();
		//address.getPincodeclear().clear();
		address.getPincode().sendKeys(pincode);
		Thread.sleep(3000);
		//address.getDoornoclear().clear();
		address.getDoorno().sendKeys(doorno);
		address.getArea().sendKeys(street);
		address.getName().sendKeys(name);
		address.getPhone().sendKeys(Phoneno);
		address.getProceed().click();
	}
	@Test(priority=9)
	public void screenshot() throws IOException {
		TakesScreenshot s =(TakesScreenshot)driver;
	    File F1=s.getScreenshotAs(OutputType.FILE);
	    File f= new File("F:\\F DRIVE ECLIPSE WORKSPACE\\screenshot\\nyka.png");
	    FileHandler.copy(F1, f);
	}
	@Test(priority=10)
	public void backToHome() {
	String parent=driver.getWindowHandle();
			Set<String>s=driver.getWindowHandles();
	Iterator<String> I1= s.iterator();
	String first = I1.next();
	String sec = I1.next();
	driver.switchTo().window(first);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@Test(priority=4)
//	public void selectproduct() {
//	 String windowHandlebefore = driver.getWindowHandle();
//	for(String winHandle : driver.getWindowHandles()) {
//		driver.switchTo().window(winHandle);
//	}
//	driver.findElement(By.xpath("//div[@class='css-43m2vm']/img[@alt='Lakme Absolute Glow Primer']")).click();
//	}
//	@Test(priority=5)
//	public void checkpincode() {
//		String windowHandlebefore1= driver.getWindowHandle();
//		for(String winHandle : driver.getWindowHandles()) {
//			driver.switchTo().window(winHandle);
//		}
//		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("603209");
//		driver.findElement(By.xpath("//button[@class='css-1ivth7r']")).click();
//	}
//	@Test(priority=6)
//	public void addtocart() {
//	driver.findElement(By.xpath("//span[text()='Add to Bag'][1]")).click();
//	
//}
//	@Test(priority=7)
//	public void gotocartpage() {
//		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
//	}
//	@Test(priority=8)
//	public void proceed() throws InterruptedException {
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
//		driver.switchTo().frame(frame1);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
//	}
//	
//	@Test(priority=9)
//	public void login() {
//		driver.findElement(By.xpath("//button[@class='css-v61n2j e8tshxd0']")).click();
//	}
//	@Test(priority=10)
//	public void entermobnum() {
//		driver.findElement(By.xpath("//input[@type='email']")).click();
//		driver.findElement(By.name("emailMobile")).sendKeys("9841641691");
//		driver.findElement(By.id("submitVerification")).click();
//	}
//	@Test(priority=11)
//	public void otp() {
//	System.out.println("enter otp:");
//	Scanner sc = new Scanner(System.in);
//	String p = sc.nextLine();
//
//	WebElement otp = driver.findElement(By.xpath("//input[@type='number']"));
//	otp.sendKeys(p);
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//}
//	@Test(priority=12)
//	public void add_address() {
//		driver.findElement(By.xpath("//div[@class='css-1pan5g8 e1gecm6x0']")).click();
//	}
//	@Test(priority=13)
//	public void addresspincode() throws InterruptedException {
//		driver.findElement(By.xpath("//span[@class='slider round css-0 e1rxn2v03']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Pincode']")).clear();
//		driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("603209");
//	}
//		@Test(priority=14)
//		public void doorno() {
//			WebDriverWait w =new WebDriverWait (driver,80);
//			 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='input-element  ']")));
//			 driver.findElement(By.xpath("//input[@class='input-element  ']")).clear();
//			driver.findElement(By.xpath("//input[@class='input-element  ']")).sendKeys("6/15");
//		}
//		@Test(priority=15)
//		public void area() {
//			driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']")).sendKeys("cheran street");
//		}
//		@Test(priority=16)
//		public void phonenum() {
//			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sharmishahul");
//		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9841641691");
//		driver.findElement(By.xpath("//button[@class='css-mq2cy2 e8tshxd0']")).click();
//	}
//	@Test(priority=17)
//	public void screenshot() throws IOException {
//		TakesScreenshot s =(TakesScreenshot)driver;
//	    File F1=s.getScreenshotAs(OutputType.FILE);
//	    File f= new File("F:\\F DRIVE ECLIPSE WORKSPACE\\screenshot\\nyka.png");
//	    FileHandler.copy(F1, f);
//	}
//	@Test(priority=18)
//	public void main_page() {
//		String parent=driver.getWindowHandle();
//
//		Set<String>s=driver.getWindowHandles();
//Iterator<String> I1= s.iterator();
//String first = I1.next();
//String sec = I1.next();
//
//		driver.switchTo().window(first);
//}
//}
//
//
//
//
//
//
//
//
//
//




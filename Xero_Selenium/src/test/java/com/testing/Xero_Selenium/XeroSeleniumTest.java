package com.testing.Xero_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XeroSeleniumTest{

	public static void main(String[] args) throws InterruptedException{
		
		//NavigateToXero1();
		//IncorrectPassword2();
		//IncorrectEmail_1C();
		ForgotPassword_1D();
	}
	
	
	/*public static void NavigateToXero_1A() throws InterruptedException{
		
		System.out.println("Navigate to Xero");
		
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("jyothipraveena194@gmail.com");
		
		System.out.println("email Entered");
		
		WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("Xero1234");
		System.out.println("password Entered");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton.click();
		System.out.println("login successful");
		Thread.sleep(2000);
		 driver.quit();
	}*/
	//-----------------------------------------------------------------------------------------	
	
		/* public static void IncorrectPassword_1B() throws InterruptedException{
				
				System.out.println("Incorrectpassword");
				
				System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
				WebDriver driver;
				driver = new ChromeDriver();
				driver.get("https://login.xero.com/");
				
				WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
				userName.sendKeys("jyothipraveena194@gmail.com");
				
				System.out.println("email Entered");
				
				WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
				passWord.sendKeys("abcd123");
				System.out.println("Incorrect password Entered");
				
				WebElement loginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
				loginButton.click();
				System.out.println("error message displayed");
				Thread.sleep(2000);
				 driver.quit();
	
	}*/
	//---------------------------------------------------------------------------------------------------
	/*public static void IncorrectEmail_1C() throws InterruptedException{
		
		System.out.println("IncorrectEmail");
		
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys("user@gmail.com");
		
		System.out.println("In correct email Entered");
		
		WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("Xero1234");
		System.out.println("password Entered");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton.click();
		System.out.println("error message displayed");
		Thread.sleep(2000);
		 driver.quit();
	}*/
	//-----------------------------------------------------------------------------------------------
public static void ForgotPassword_1D() throws InterruptedException{
		
		System.out.println("ForgotPassword_1D");
		
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		
		WebElement forgotPassword = driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
		forgotPassword.click();
		System.out.println("Clicked forgot password");
		
		WebElement forgotPasswordPage = driver.findElement(By.xpath("//input[@id='UserName']"));
		forgotPasswordPage.sendKeys("jyothipraveena194@gmail.com");
		System.out.println("email given to forgot password");
		
		WebElement sendLink = driver.findElement(By.xpath("//span[@class='text']"));
		sendLink.click();
		System.out.println("link to reset password is sent");
		Thread.sleep(2000);
		 driver.quit();
		
}
	
}

package com.testing.Xero_Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XeroSeleniumTest{

	public static void main(String[] args) throws InterruptedException{
		
		//NavigateToXero_1A();
		//IncorrectPassword_1B();
		//IncorrectEmail_1C();
		//ForgotPassword_1D();
		//SignupToXDC_2A();
		SignupToXDC_2B();
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
/*public static void ForgotPassword_1D() throws InterruptedException{
		
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
		
}*/
//-------------------------------------------------------------------------------------------------	
/*public static void SignupToXDC_2A() throws InterruptedException{
		
		System.out.println("SignupToXDC_2A");
		
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
	
		WebElement FreeTrail = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		FreeTrail.click();
		System.out.println("Clicked freeTrail");
		Thread.sleep(2000);
		System.out.println("A 30 day freeTrail page is dispalyed");
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='FirstName']"));
		FirstName.sendKeys("jyothi1234");
		System.out.println("Entered first name");
		
		
		WebElement LastName = driver.findElement(By.xpath("//input[@name='LastName']"));
		LastName.sendKeys("xyz");
		System.out.println("Entered second name");
		
		WebElement emailAddress = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		emailAddress.sendKeys("jyothipraveena194@gmail.com");
		System.out.println("Entered email");
		
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
		phoneNumber.sendKeys("7832983083");
		System.out.println("Entered phone number");
		
		WebElement Country = driver.findElement(By.xpath("//select[@name='LocationCode']"));
		
		Select CountryDropdown =new Select(Country);
		CountryDropdown.selectByVisibleText("India");
		System.out.println("selected country ");
		
		
		WebElement Terms = driver.findElement(By.xpath("//input[@name='TermsAccepted']"));
		Terms.click();
		System.out.println("checked terms checkbox");
		
		
		WebElement GetStartedButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		GetStartedButton.click();
		System.out.println("Clicked GetStarted");
		
}*/
		
//----------------------------------------------------------------------------------------------------	

public static void SignupToXDC_2B() throws InterruptedException{
		
		System.out.println("SignupToXDC_2B");
		
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
	
		WebElement FreeTrail = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		FreeTrail.click();
		System.out.println("Clicked freeTrail");
		Thread.sleep(2000);
		System.out.println("A 30 day freeTrail page is dispalyed");
		
		WebElement GetStarted = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		GetStarted.click();
		System.out.println("Error message displayed");
		Thread.sleep(2000);
		driver.quit();
		
}
}



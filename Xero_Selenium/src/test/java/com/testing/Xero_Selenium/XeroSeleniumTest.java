package com.testing.Xero_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XeroSeleniumTest{

	public static void main(String[] args) throws InterruptedException{
		
		NavigateToXero1();
	}
	
	
	public static void NavigateToXero1() throws InterruptedException{
		
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
		
	}
	
}

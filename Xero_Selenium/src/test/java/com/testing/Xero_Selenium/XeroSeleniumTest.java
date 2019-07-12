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
		//SignupToXDC_2B();
		//SignupToXDC_2C();
		//SignupToXDC_2D();
		//SignupToXDC_2E();
		//TestAllTabs_3A();
		//LogoutFunctionality_4A();
		UpLoadProfileImage_6A();
		
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
		Thread.sleep(9000);
		
		WebElement Terms = driver.findElement(By.xpath("//input[@name='TermsAccepted']"));
		Terms.click();
		System.out.println("checked terms checkbox");
		Thread.sleep(10000);
		
		
		WebElement GetStartedButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		GetStartedButton.click();
		System.out.println("Clicked GetStarted");
		
}*/
		
//----------------------------------------------------------------------------------------------------	

/*public static void SignupToXDC_2B() throws InterruptedException{
		
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
		
		//code with clicking get started without filling fields
		
		//WebElement GetStarted = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		//GetStarted.click();
		//System.out.println("Error message displayed");
		//Thread.sleep(2000);
		//driver.quit();*/
		
		// code with Enter Email in wrong format
		
		/*WebElement FirstName = driver.findElement(By.xpath("//input[@name='FirstName']"));
		FirstName.sendKeys("jyothi1234");
		System.out.println("Entered first name");
		
		
		WebElement LastName = driver.findElement(By.xpath("//input[@name='LastName']"));
		LastName.sendKeys("xyz");
		System.out.println("Entered second name");
		
		WebElement emailAddress = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		emailAddress.sendKeys("abcdefgh");
		System.out.println("Entered email in wrong format");
		
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
		phoneNumber.sendKeys("7832983083");
		System.out.println("Entered phone number");
		
		WebElement Country = driver.findElement(By.xpath("//select[@name='LocationCode']"));
		
		Select CountryDropdown =new Select(Country);
		CountryDropdown.selectByVisibleText("India");
		System.out.println("selected country");
		
		
		WebElement Terms = driver.findElement(By.xpath("//input[@name='TermsAccepted']"));
		Terms.click();
		System.out.println("checked terms checkbox");
		Thread.sleep(9000);
		
		WebElement GetStartedButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		GetStartedButton.click();
		System.out.println("Clicked GetStarted");*/
		
		//code with clicking get started without selecting the term and policy check box
		
		/*WebElement FirstName = driver.findElement(By.xpath("//input[@name='FirstName']"));
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
		Thread.sleep(9000);
		
		
		WebElement GetStartedButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		GetStartedButton.click();
		System.out.println("Clicked GetStarted");		
}*/
//--------------------------------------------------------------------------------------------

	/*public static void SignupToXDC_2C() throws InterruptedException{
		
		System.out.println("SignupToXDC_2C");
		
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
	
		WebElement FreeTrail = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		FreeTrail.click();
		System.out.println("Clicked freeTrail");
		Thread.sleep(2000);
		System.out.println("A 30 day freeTrail page is dispalyed");
		
		
		WebElement TermsofUseLink = driver.findElement(By.xpath("//a[contains(text(),'terms of use')]"));
		TermsofUseLink.click();
		System.out.println("Clicked TermsofUse Link");
		System.out.println("TermsofUse Page opened");
		
		
		Thread.sleep(3000);
	
		WebElement PrivacyNoticeLink = driver.findElement(By.xpath("//a[contains(text(),'privacy notice')]"));
		PrivacyNoticeLink.click();
		System.out.println("Clicked PrivacyNotice Link");
		System.out.println("PrivacyNotice Page opened");
		
		Thread.sleep(2000);
		driver.quit();
		
}*/
	//--------------------------------------------------------------------------------------------	
/*public static void SignupToXDC_2D() throws InterruptedException{
		
		System.out.println("SignupToXDC_2D");
		
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
	
		WebElement FreeTrail = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		FreeTrail.click();
		System.out.println("Clicked freeTrail");
		Thread.sleep(2000);
		System.out.println("A 30 day freeTrail page is dispalyed");
		
		Thread.sleep(3000);
		WebElement OfferDetailsLink = driver.findElement(By.xpath("//a[contains(text(),'offer details')]"));
		OfferDetailsLink.click();
		System.out.println("Clicked OfferDetails Link");
		System.out.println("OfferDetails Page opened");
	
		Thread.sleep(3000);
		driver.quit();
}*/
//--------------------------------------------------------------------------------------------		
/*public static void SignupToXDC_2E() throws InterruptedException{
		
		System.out.println("SignupToXDC_2E");
		
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.xero.com/us/");
	
		WebElement FreeTrail = driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		FreeTrail.click();
		System.out.println("Clicked freeTrail");
		Thread.sleep(2000);
		System.out.println("A 30 day freeTrail page is dispalyed");
		
		Thread.sleep(3000);
		WebElement AccounttantBookkeeperLink = driver.findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"));
		AccounttantBookkeeperLink.click();
		System.out.println("Clicked AccounttantBookkeeper Link");
		System.out.println("AccounttantBookkeeper Page opened");
	
		Thread.sleep(3000);
		driver.quit();
}*/
//--------------------------------------------------------------------------------------------		
/*public static void TestAllTabs_3A() throws InterruptedException{
		
		System.out.println("TestAllTabs");
		
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
		System.out.println("you are currently using trail account is displayed");
		Thread.sleep(2000);
		
		WebElement DashBoard = driver.findElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"));
		DashBoard.click();
		System.out.println("In dashboard page");
		
		
		WebElement Accounts = driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
		Accounts.click();
	
		System.out.println("Accounts dropdown");
		
		Thread.sleep(2000);
		WebElement Report = driver.findElement(By.xpath("//div[@class='xrh-dropdown--body']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Reports')]"));
		Report.click();
		System.out.println("Report dropdown page");
		Thread.sleep(2000);
		
		WebElement contacts = driver.findElement(By.xpath("//button[contains(text(),'Contacts')]"));
		contacts.click();
		System.out.println("Contacts dropdown page");
		Thread.sleep(2000);
		
		WebElement Allcontacts = driver.findElement(By.xpath("//a[contains(text(),'All contacts')]"));
		Allcontacts.click();
		System.out.println("All Contacts page");
		Thread.sleep(2000);
		
		WebElement abcdropdown = driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		abcdropdown.click();
		Thread.sleep(2000);
		
		WebElement settings = driver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
		settings.click();	
		System.out.println("settings page opened");
		Thread.sleep(2000);
		
		WebElement plus = driver.findElement(By.xpath("//li[1]//button[1]//div[1]"));
		plus.click();
		System.out.println("new dropdown page opened");
		Thread.sleep(3000);
		
		WebElement abcdropdown1 = driver.findElement(By.xpath("//span[contains(text(),'abc')]"));
		abcdropdown1.click();
		Thread.sleep(4000);
		
		WebElement filePage = driver.findElement(By.xpath("//a[contains(text(),'Files')]"));
		filePage.click();	
		System.out.println("files page opened");
		Thread.sleep(2000);
		
		WebElement notification = driver.findElement(By.xpath("//li[3]//button[1]//div[1]"));
		notification.click();	
		System.out.println("Notification page shown");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//li[@class='xrh-addon xrh-addon-alwaysvisible']//*[@class='xrh-icon xrh-icon-svg']"));
		search.click();	
		System.out.println("search field is shown");
		Thread.sleep(2000);
		
		WebElement help = driver.findElement(By.xpath("//li[4]//button[1]//div[1]"));
		help.click();	
		System.out.println("help field is shown with- What do you need help with?");
		Thread.sleep(2000);
		driver.quit();
}*/
	
//--------------------------------------------------------------------------------------------		
/*public static void LogoutFunctionality_4A() throws InterruptedException{
		
		System.out.println("TestAllTabs");
		
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
		
		WebElement UserMenuDropdown = driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-2']"));
		UserMenuDropdown.click();
		
		WebElement logOut = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
		logOut.click();
		System.out.println("logout successful");
		Thread.sleep(2000);
		driver.quit();
}*/
public static void UpLoadProfileImage_6A() throws InterruptedException{
		
		System.out.println("Upload Profile Image");
		
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
		
		WebElement UserName = driver.findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-2']"));
		UserName.click();
		Thread.sleep(2000);
		System.out.println("userName clicked");
		
		WebElement EditProfile = driver.findElement(By.xpath("//li[@class='xrh-addon xrh-addon-lastvisible']//li[1]//a[1]"));
		/*//a[contains(text(),'Edit profile')]*/
		EditProfile.click();
		Thread.sleep(2000);
		System.out.println("Profile option clicked");
		
		WebElement UploadImageButton = driver.findElement(By.xpath("//span[@id='button-1041-btnInnerEl']"));
		UploadImageButton.click();
		Thread.sleep(3000);
		System.out.println("UploadImage Button clicked");
		
		
		//WebElement Imageoption = driver.findElement(By.xpath("//div[@class='no-avatar']"));
		//Imageoption.sendKeys("C:\\Users\\adudi\\Desktop");
		WebElement browseButton = driver.findElement(By.xpath("//input[@id='filefield-1188-button-fileInputEl']"));
		browseButton.click();
		Thread.sleep(5000);
		System.out.println("Browse Button clicked");
		//browseButton.sendKeys("C:\\Users\\adudi\\Desktop");
		
		
		
	
		WebElement UploadButton = driver.findElement(By.xpath("//div[@id='button-1178']"));
		UploadButton.click();
		Thread.sleep(2000);
		
	
}
	
}



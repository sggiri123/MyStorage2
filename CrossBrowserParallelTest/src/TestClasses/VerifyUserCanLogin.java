package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClasses.Base1;
import PomClasses.HomePage;
import PomClasses.LoginPage;

public class VerifyUserCanLogin {
	LoginPage lp;
	HomePage hp;
  
	WebDriver driver;
	@BeforeClass
	@Parameters ("browser")
	public void beforeclass(String browser) {
		driver=Base1.getDriver(browser);
	}
	
	@BeforeMethod
	public void beforemethod() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
	}
	
	@Test
	public void VerifyLogin() {
		lp.enterEamilID();
		lp.enterPassword();
		lp.clickLogin();
		boolean isProfileNameVisible= hp.checkProfileNameVisible();
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method is called");
	}
		
	@AfterClass
	public void afterclass() {
		System.out.println("after class is called");
		Base1.unloadDriver();
	}
}

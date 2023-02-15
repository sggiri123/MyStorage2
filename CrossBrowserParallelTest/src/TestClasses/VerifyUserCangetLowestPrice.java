package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Base1;
import PomClasses.HomePage;
import PomClasses.LoginPage;

public class VerifyUserCangetLowestPrice {
	
	WebDriver driver;
	HomePage hp;
	
	@BeforeClass
	public void beforeclass(String browser) {
		driver= Base1.getDriver(browser);
	}
	
	@BeforeMethod
	public void beforemethod() {
		hp = new HomePage(driver);
	}

	@Test 
	public void getLowestPrice() throws InterruptedException {
		hp.searchProduct();	
		
		for (int i=1; i<=5; i++) {
			if (i != 1) {
				hp.switchPage(i);
				Thread.sleep(10);
			}
			System.out.println(hp.getLowestPrice());
		}
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method is called");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class is called");
	}
	
}

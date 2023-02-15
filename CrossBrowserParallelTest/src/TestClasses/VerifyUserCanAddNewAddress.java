package TestClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseClasses.Base1;
import PomClasses.ProfilePage;

public class VerifyUserCanAddNewAddress {
	
	WebDriver driver;
	ProfilePage pp;
	int oldCount;
	int newCount;
	
	@BeforeClass
	public void BeforeClass(String browser) {
		driver=Base1.getDriver(browser);
	}
	@BeforeMethod
	public void beforemethod() {
		pp = new ProfilePage(driver);
	}
	
	@Test (priority=1)
	public void VerifyUsercanGetOldCount() throws InterruptedException {
		
		pp.clickOnMyProfile();
		Thread.sleep(10);
		pp.clickOnManageAddresses();
		pp.clickOnAddNewAddress();
		
		oldCount=pp.getAddressCount();	
		
	}
	@DataProvider(name="testData")
	public String[][] getData(){
		String[][] uData = {{"Yogesh Giri","9890904011","411033","near Govt Hospital", "Deulgaon Mali, Tal Mehkar"},{"Narendra Giri","9875466975","411033","Gulmohar Colony", "Shivaji chowk, Bhokardan"}};
		return uData;
	}
	
	
	@Test (priority=2, dataProvider="testData")
	public void verifyUserCanAddNewAddress(String name, String MobNumber, String pincode, String locality, String detailAdd){
		
		List<String> addressDataList = new ArrayList<>(Arrays.asList(name, MobNumber, pincode, locality, detailAdd));	
		pp.addAddress(addressDataList); 
		pp.clickOnAddNewAddress();
		newCount = pp.getAddressCount();
		
		if (newCount>oldCount)
		{
			System.out.println("TestCase is passed and New Address is added");
		}
		else {
			System.out.println("TestCase is failed.");
		}
	}

}

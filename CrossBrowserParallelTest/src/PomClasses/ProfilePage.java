package PomClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.Util;

public class ProfilePage extends Util {
	WebDriver driver;
	
	@FindBy (xpath="//div[text()='Shridhar']")
	private WebElement profileName;
	
	@FindBy (xpath="(//li[@class='_2NOVgj'])[1]")
	private WebElement myProfile;
	
	@FindBy (xpath="//div[text()='Manage Addresses']")
	private WebElement manageAddresses;
	
	@FindBy (xpath="//div[@class='_1QhEVk']")
	private WebElement addNewAddress;
	
	@FindBy (xpath="//div[@class='_1CeZIA']")
	private List<WebElement> addressCount;
	
	@FindBy (xpath="//textArea[@tabindex='5']")
	private WebElement detailAdd;
	
	@FindBy (xpath="//button[@tabIndex='10']")
	private WebElement saveButton;
	
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;	
	}
	
	public void clickOnMyProfile() {	
		moveToElement(driver, profileName);
		myProfile.click();
	  }
	public void clickOnManageAddresses() throws InterruptedException {
		manageAddresses.click();
	}
	public void clickOnAddNewAddress() {
		addNewAddress.click();
	}
	
	public void addAddress (List<String> addressData) {
		for (int i=1; i<=4; i++) 
		{
			driver.findElement(By.xpath("//input[@tabIndex='"+i+"']")).sendKeys(addressData.get(i-1));
		}
		detailAdd.sendKeys(addressData.get(4));
		saveButton.click();
	}
	public int getAddressCount() {
		tillElementPresent(driver, addNewAddress);
		return addressCount.size();
		
	}

}

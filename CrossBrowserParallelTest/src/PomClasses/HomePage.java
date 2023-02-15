package PomClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClasses.Util;

public class HomePage extends Util{
    WebDriver driver;
    
	@FindBy (xpath ="//div[text()='Shridhar']")
	private WebElement profileName;
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement searchField;
	
	@FindBy (xpath = "//div[@class='_30jeq3 _1_WHN1']")
	private List<WebElement> productlist;
	
	@FindBy (xpath = "(//div[@class='_2kHMtA'])[1]")
	private WebElement firstproduct;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public boolean checkProfileNameVisible() {
		try {
			tillElementPresent(driver, driver.findElement(By.xpath("//div[text()='Shridhar']")));
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	public void searchProduct() {
		searchField.sendKeys("realme");
		searchField.sendKeys(Keys.ENTER);
		tillElementPresent(driver, firstproduct);
	}

	public int getLowestPrice() {
	List<Integer> productpricelist = new ArrayList<>();
		for (int i=0; i<24; i++)
		{
			productpricelist.add(Integer.parseInt(productlist.get(i).getText().replace("₹","").replace(",","")));
		}
		Collections.sort(productpricelist);
		return productpricelist.get(0);
	
	}
	public void switchPage(int i) {
		driver.findElement(By.xpath("//a[@class='ge-49M' and text()='"+i+"']")).click();
		tillElementPresent(driver, driver.findElement(By.xpath("//a[@class='ge-49M _2Kfbh8' and text()='"+i+"']")));
				
			}

}

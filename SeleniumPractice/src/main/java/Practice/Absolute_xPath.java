package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xPath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/form/div/input"));
		element.sendKeys("9665365300");
		WebElement element1 = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/form/div[3]/button"));
		element1.click();
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement element2 = driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div[3]/a"));
		element2.click();
		
		driver.navigate().to("https://www.facebook.com/");
		//xpath by axes
		
		WebElement element3 = driver.findElement(By.xpath("//button[@value='1']/ancestor::div[2]//input[@type='text']"));
		element3.clear();
		element3.sendKeys("9970755276");
		
		
		
	}

}

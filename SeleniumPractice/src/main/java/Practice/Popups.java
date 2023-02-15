package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Popups {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		WebElement click = driver.findElement(By.xpath("//button[@id='alertButton']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeAsyncScript("window.open()");
		
		click.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
	
		
		
		
		
		
	
	}

}

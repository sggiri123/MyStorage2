package UtilClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	public static void tillElementPresent(WebDriver driver, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
		wait.until(ExpectedConditions.visibilityOf(element));
	
	}
	
	public static void moveToElement (WebDriver driver, WebElement element) {
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	
	
	
	
	

}

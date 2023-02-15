package BaseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Durations;

public class Base1 {
	
  static WebDriver driver;
  
	public static WebDriver getDriver(String browser) {
		
		if (driver == null) {     
			if (browser.equals("chrome"))
		 {
			   System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
	           driver = new ChromeDriver();
		 }
	     else {
		      System.setProperty("webdriver.gecko.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/geckodriver");
		      driver = new FirefoxDriver();
			}
		       driver.get("https://www.flipkart.com/");
               driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
           return driver;
	}    
	public static void unloadDriver() {
		driver=null;
	}
}

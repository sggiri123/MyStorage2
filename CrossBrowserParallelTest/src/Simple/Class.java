package Simple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Class {

	public static void main(String[] args) throws InterruptedException {

	       System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
	       WebDriver driver= new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
           driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       WebElement email =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	       email.sendKeys("9665365300");
	       WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	       password.sendKeys("Shridhar4474#");
	       WebElement loginButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	       loginButton.click();
	       
	       Thread.sleep(10000);
	       
	       WebElement searchField= driver.findElement(By.xpath("//input[@type='text']"));
	       searchField.sendKeys("realme");
	       searchField.sendKeys(Keys.ENTER);
	       
	       Thread.sleep(10000);
	       WebElement product= driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[2]"));
	       System.out.println(product.getText());
	}
	

}

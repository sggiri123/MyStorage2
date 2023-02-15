package newPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
//		WebElement loginbtn= driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
//		loginbtn.sendKeys("9665365300");
//		
//		WebElement requestotp = driver.findElement(By.xpath("//button[text()='Request OTP']"));
//		requestotp.click();
//		
//		Thread.sleep(5);
//		
//		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
//		search.sendKeys("laptops");
//		search.sendKeys(Keys.ENTER);
//		
//		Thread.sleep(5);
//		
//		for (int i=1; i<3; i++) {
//			WebElement list = driver.findElement(By.xpath("(//div[@class='_1AtVbE col-12-12'])["+ i +"]"));
//			list.click();
//			Thread.sleep(5);
//		}
		
//		Set<String> addresslist= driver.getWindowHandles();
//		
//		List<String> addresses = new ArrayList<>(addresslist);
//		
//		driver.switchTo().window(addresses.get(2));
//		
//		WebElement addtocart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
//		
//		addtocart.click();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='pO9syL _1s9xSv']"));
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(0).getText());
		}
		
	}

}

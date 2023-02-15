package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letskodeit.com/");
		String fileName = "kite";
		
		WebElement element = driver.findElement(By.xpath("(//a[@class='menu-link'])[2]"));
		
		File source =element.getScreenshotAs(OutputType.FILE);
		File destination = new File ("/home/poshs/"+ fileName + ".png");
		FileHandler.copy(source, destination);

	}

}

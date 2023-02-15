package Practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Methods {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
//		
		driver.manage().window().maximize();
//		
//		WebElement bmw = driver.findElement(By.xpath("(//label[@for='bmw'])[1]"));
//		
//		WebElement benz = driver.findElement(By.xpath("(//label[@for='benz'])[1]"));
//		
//		WebElement bmwradio = driver.findElement(By.xpath("//input[@id='bmwradio']"));
//		
//		if (bmw.isDisplayed()) {
//			bmwradio.click();
//		}
//		
//		Thread.sleep(3);
//		
//		if (bmwradio.isSelected()) {
//			System.out.println("bmw is selecred");
//		}
//		
//		WebElement dropdown = driver.findElement(By.xpath("//select[@id='carselect']"));
//		
//		Select c = new Select(dropdown);
//		
//		List<WebElement> list= c.getOptions();
//		
//		for (int i=0; i<list.size(); i++) {
//			String s =list.get(i).getText();
//			System.out.println(s);
//			
//		}
//		
//		
//		System.out.println(list);
//		
//		c.selectByIndex(2);
//		c.selectByValue("honda");
//		
//		WebElement multiple = driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
//		
//		WebElement value1 = driver.findElement(By.xpath("//option[@value='apple']"));
//		
//		WebElement value2 = driver.findElement(By.xpath("//option[@value='orange']"));
//		
//		WebElement value3 = driver.findElement(By.xpath("//option[@value='peach']"));
//	   
//		Thread.sleep(5);
//		Actions act = new Actions(driver);
//	   
//	   act.keyDown(Keys.CONTROL).perform();
//	   value1.click();
//	   value2.click();
//	   value3.click();
//	   act.keyUp(Keys.CONTROL).perform();
		   
//	   driver.switchTo().newWindow(WindowType.WINDOW);
	   
//	   driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
//	   WebElement span =  driver.findElement(By.xpath("//span[text()='right click me']"));
//	   act.contextClick(span).perform();
//	   Thread.sleep(2);
//	   
//	   TakesScreenshot ts = (TakesScreenshot)driver;
//	   
//	   File source=  ts.getScreenshotAs(OutputType.FILE);
//	   
//	   File destination = new File("/home/poshs/Pictures" +".png");
//	   
//	   FileHandler.copy(source, destination);
//	   
//	   Thread.sleep(2);
//	   
//	   WebElement shri= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//	   act.doubleClick(shri).perform();
//	   
//	   Alert alert = driver.switchTo().alert();
//	   alert.accept();
	   
//	   driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
//	   
//	   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
//	   
//	   Thread.sleep(1);
//	   
//	   WebElement mast = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
//	   
//	   WebElement swast = driver.findElement(By.id("trash"));
	   
//	   act.clickAndHold(mast).perform();
//	   
//	   act.dragAndDrop(mast, swast).perform();
	   
//	   act.clickAndHold(mast).moveToElement(swast).release().build().perform();
	   
	   driver.navigate().to("https://www.youtube.com/");
	   
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   
	   WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
	   
	   js.executeScript("arguments[0].value='Shankar Mahadevan'", search);
	   
	   Thread.sleep(5);
	   
	   WebElement searchbtn = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
	   searchbtn.click();
	   
	   
	   Thread.sleep(5);
	   
	   WebElement shakar = driver.findElement(By.xpath("//yt-formatted-string[contains(@aria-label, 'Mitwa Full Video')]"));
	   
	   js.executeScript("arguments[0].scrollIntoView()true", shakar);
	   
	   js.executeScript("arguments[0].click()", shakar);
	   	
	}

}

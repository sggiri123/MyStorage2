package newPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_WebTable {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
	    List<WebElement> listrows=	driver.findElements(By.xpath("//tr[contains(@style, 'box-sizing: inherit;')]"));
		int noOfRows = listrows.size();
		
		List<WebElement> listcolumns = driver.findElements(By.xpath("//td[contains(@style, 'border:')]"));
		int noOfColumns = listcolumns.size();
		driver.quit();
		
		
		
//		for (int i=1; i<=6; i++) {
//			for (int j=1; j<=3; j++) {
//				String s = driver.findElement(By.xpath("(//td[contains(@style, 'border:')])["+(i*j)+"]")).getText();
//				System.out.print(s);
//			}
//			System.out.println();
//		}
//		
		
		
		

	}

}

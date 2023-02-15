package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize_setPosition {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/");
		
		Dimension p = new Dimension(300,500);
		
		driver.manage().window().setSize(p);
		
		Point p1 = new Point(700,900);
		
		driver.manage().window().setPosition(p1);
		
		int x = driver.manage().window().getPosition().getX();
		int y = driver.manage().window().getPosition().getY();
		
		Dimension d = driver.manage().window().getSize();
		
		System.out.println(x + "--"+ y +"  size"+ d);
		
		driver.quit();
	
	}

}

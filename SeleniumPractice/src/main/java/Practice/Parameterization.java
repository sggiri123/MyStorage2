package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		FileInputStream file = new FileInputStream("/home/poshs/Desktop/Book2.xlsx");
//		
//		Workbook wb = WorkbookFactory.create(file);
//		
//		Sheet sheet = wb.getSheet("Sheet1");
//		for (int i=0; i<sheet.getLastRowNum(); i++) {
//			String s = sheet.getRow(i).getCell(1).getStringCellValue();
//			System.out.println(s);
//			
//			int a = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
//			System.out.println(a);
//			
//		}
//		
//		FileOutputStream file1= new FileOutputStream("/home/poshs/Desktop/Book2.xlsx");
//		
//		Sheet sheet1 = wb.getSheet("Sheet2");
//		
//		for (int i=0; i<10; i++) {
//			Row row = sheet1.createRow(i);
//			Cell cell = row.createCell(0);
//            String s = sheet.getRow(i).getCell(1).getStringCellValue();
//			cell.setCellValue(s);
//			
//			
//		}
//		wb.write(file1);
//		file1.close();
//		

		System.setProperty("webdriver.chrome.driver", "/home/poshs/eclipse-workspace/Selenium/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		
		WebElement element = driver.findElement(By.xpath("//div[contains(text(), 'Sample Nested')]"));
		
		System.out.println(element.getText());
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
		
		WebElement element1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		
		System.out.println(element1.getText());
		
		driver.switchTo().parentFrame();
		
		System.out.println(element.getText());

		
		
		
	}

}

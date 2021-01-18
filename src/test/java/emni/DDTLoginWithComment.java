package emni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DDTLoginWithComment {
	
	WebDriver driver;
	Workbook wb;
	Sheet sht;
	
	@Test
	public void login() throws EncryptedDocumentException, IOException, InterruptedException {
		
		String driverpath="C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\geckodriver.exe";
		String TestUrl="https://www.opencart.com/index.php?route=account/login";
		System.setProperty("webdriver.gecko.driver", driverpath);
		driver = new FirefoxDriver();
		driver.get(TestUrl);
		// set test data path
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\PropertyFile\\DDTLgnCmnt.xlsx");
		// workbook
		Workbook wb = WorkbookFactory.create(fis);
		// excel sheet
		Sheet sht = wb.getSheet("Sheet1");
		// getting email and password
		
		// get email
		Row email_row= sht.getRow(1);
		Cell email_cell= email_row.getCell(0);
		String email=email_cell.getStringCellValue();
		// get password
		Row pass_row=sht.getRow(1);
		// password string or numeric
		//Cell string_pass_cell=pass_row.getCell(1);
		Cell numeric_pass_cell=sht.getRow(1).getCell(1);
		// if password is string value
		//String pass1=string_pass_cell.getStringCellValue();
		// if numeric is string value 
		DataFormatter format=new DataFormatter();
		String pass2=format.formatCellValue(numeric_pass_cell);
		// LoginTest
		WebElement eml=driver.findElement(By.id("input-email"));
		WebElement pas=driver.findElement(By.id("input-password"));
		WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]"));
		
		eml.sendKeys(email);
		pas.sendKeys(pass2);
		loginbtn.click();
		// Message to be written in excel "login pass or fail"--
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\PropertyFile\\DDTLgnCmnt.xlsx");
		String expectedTitle="Account PIN";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			String result="Pass";
			sht.getRow(1).createCell(3).setCellValue(result);
		}
		else {
			String result="Fail";
			sht.getRow(1).createCell(3).setCellValue(result);
		}
		
		wb.write(fos);
		Thread.sleep(3000);
		driver.close();
	}

}

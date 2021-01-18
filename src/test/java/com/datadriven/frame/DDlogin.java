package com.datadriven.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDlogin {

	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@DataProvider(name = "testlogin")
	public Object[][] data() {

		Object[][] data = new Object[3][2];

		data[0][0] = "abc";
		data[0][1] = "123";

		data[1][0] = "def";
		data[1][1] = "456";

		data[2][0] = "ghi";
		data[2][1] = "789";

		return data;
	}

	@Test(dataProvider = "testlogin")
	public void baseurl(String testEmail, String testPass) throws InterruptedException {

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys(testEmail);
		WebElement Pass = driver.findElement(By.name("password"));
		Pass.sendKeys(testPass);
		driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);
	}

	@AfterClass
	public void teardown() {

		driver.close();
		System.out.println("all okay");
	}

}

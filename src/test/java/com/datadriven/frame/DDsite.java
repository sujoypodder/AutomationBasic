package com.datadriven.frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDsite {

	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@DataProvider(name = "testsite")
	public Object[][] data() {

		Object[][] data = new Object[3][1];
		data[0][0] = "https://www.imdb.com/";
		data[1][0] = "https://www.youtube.com/";
		data[2][0] = "https://www.facebook.com/";
		return data;
	}

	@Test(dataProvider = "testsite")
	public void baseurl(String site) throws InterruptedException {

		driver.get(site);
		Thread.sleep(2000);
	}

	@AfterClass
	public void teardown() {

		driver.close();
		System.out.println("all okay");
	}

}

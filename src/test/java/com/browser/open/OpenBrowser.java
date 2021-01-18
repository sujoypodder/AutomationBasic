package com.browser.open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\geckodriver.exe";
		String baseurl = "https://www.youtube.com/";
		System.setProperty("webdriver.gecko.driver", driverpath);
		driver = new FirefoxDriver();
		driver.get(baseurl);
		Thread.sleep(2000);
		driver.close();
		System.out.println("fine");

	}

}

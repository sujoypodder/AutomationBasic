package com.browser.open;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSizeSet {

	public static void main(String[] args) {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\geckodriver.exe";
		String baseurl = "https://www.youtube.com/";
		System.setProperty("webdriver.gecko.driver", driverpath);
		driver = new FirefoxDriver();
		driver.get(baseurl);
		driver.manage().window().setSize(new Dimension(600, 400));
		driver.close();
		System.out.println("pass");

	}

}

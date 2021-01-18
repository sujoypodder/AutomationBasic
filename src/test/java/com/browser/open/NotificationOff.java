package com.browser.open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationOff {

	public static void main(String[] args) {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\geckodriver.exe";
		String baseurl = "http://www.cacert.org/";
		System.setProperty("webdriver.gecko.driver", driverpath);
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--disable-notification");
		driver = new FirefoxDriver(option);
		driver.get(baseurl);
		System.out.println("success");
		driver.close();

	}

}

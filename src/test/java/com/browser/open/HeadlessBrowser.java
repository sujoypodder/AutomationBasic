package com.browser.open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\geckodriver.exe";
		String baseurl = "http://www.cacert.org/";
		System.setProperty("webdriver.gecko.driver", driverpath);
		FirefoxOptions option = new FirefoxOptions();
		option.setHeadless(true);
		driver = new FirefoxDriver(option);
		driver.get(baseurl);
		String title = driver.getTitle();
		System.out.println(title);
//		System.out.println("success");
		driver.close();
	}

}

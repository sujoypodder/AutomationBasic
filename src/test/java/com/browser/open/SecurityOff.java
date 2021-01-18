package com.browser.open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SecurityOff {

	public static void main(String[] args) {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\geckodriver.exe";
		String baseurl = "http://www.cacert.org/";
		System.setProperty("webdriver.gecko.driver", driverpath);
		FirefoxOptions option = new FirefoxOptions();
		option.setAcceptInsecureCerts(false);
		driver = new FirefoxDriver();
		driver.get(baseurl);
		System.out.println("success");
		driver.close();

	}

}

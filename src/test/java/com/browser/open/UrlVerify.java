package com.browser.open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlVerify {

	public static void main(String[] args) {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\chromedriver.exe";
		String baseurl = "https://www.opencart.com/index.php?route=common/home";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		String Actuaurl = driver.getCurrentUrl();
		if (baseurl.equals(Actuaurl)) {
			System.out.println("verified");
		} else {
			System.out.println("not verified " + baseurl);
		}

		driver.close();

	}

}

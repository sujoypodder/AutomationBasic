package com.browser.open;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssProperties {

	public static void main(String[] args) {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\chromedriver.exe";
		String baseurl = "https://www.opencart.com/index.php?route=account/login";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		WebElement email = driver.findElement(By.id("input-email"));
		// size
		Dimension size = email.getSize();
		System.out.println(size);
		// color
		String Color = email.getCssValue("color");
		System.out.println(Color);
		// Background color
		String BGColor = email.getCssValue("background-color");
		System.out.println(BGColor);
		// Border radius
		String Bredius = email.getCssValue("border-radius");
		System.out.println(Bredius);
		driver.close();
		System.out.println("okay");

	}

}

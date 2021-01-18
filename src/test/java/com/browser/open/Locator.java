package com.browser.open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\chromedriver.exe";
		String baseurl = "https://www.opencart.com/index.php?route=account/login";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		// locator
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("podder.156gmail.com");
		Thread.sleep(1000);
		WebElement pass = driver.findElement(By.id("input-password"));
		pass.sendKeys("podder0123456");
		Thread.sleep(1000);

//		driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		Thread.sleep(1000);
		driver.close();
		System.out.println("pass");

	}

}

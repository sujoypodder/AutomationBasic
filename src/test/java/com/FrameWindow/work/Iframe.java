package com.FrameWindow.work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\\\Users\\\\88016\\\\eclipse-workspace\\\\PracticeForExam\\\\DriverBrowser\\\\chromedriver.exe";
		String Url = "https://the-internet.herokuapp.com/iframe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		driver.switchTo().frame("mce_0_ifr");
		WebElement iframe = driver.findElement(By.id("tinymce"));
		iframe.clear();
		iframe.sendKeys("Selenium autimation testing");
		Thread.sleep(2000);
		System.out.println("complete");
		driver.close();

	}

}

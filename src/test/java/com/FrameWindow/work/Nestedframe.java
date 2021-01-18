package com.FrameWindow.work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframe {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\\\Users\\\\88016\\\\eclipse-workspace\\\\PracticeForExam\\\\DriverBrowser\\\\chromedriver.exe";
		String Url = "https://the-internet.herokuapp.com/nested_frames";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		driver.switchTo().frame("frame-left");
		Thread.sleep(2000);
		driver.switchTo().frame("frame-middle");
		Thread.sleep(2000);
		driver.switchTo().frame("frame-right");
		Thread.sleep(2000);
		driver.switchTo().frame("frame-bottom");
		Thread.sleep(2000);
		System.out.println("complete");
		driver.close();

	}

}

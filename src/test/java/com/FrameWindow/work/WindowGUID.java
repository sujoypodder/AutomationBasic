package com.FrameWindow.work;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowGUID {

	public static void main(String[] args) {

		WebDriver driver;
		String driverpath = "C:\\\\Users\\\\88016\\\\eclipse-workspace\\\\PracticeForExam\\\\DriverBrowser\\\\chromedriver.exe";
		String Url = "http://the-internet.herokuapp.com/windows";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		String parentGUID = driver.getWindowHandle();
		System.out.println(parentGUID);

		WebElement clkbtn = driver.findElement(By.linkText("Click Here"));
		clkbtn.click();
		// get all session id of browser
		Set<String> allGUID = driver.getWindowHandles();
		System.out.println(allGUID);
		System.out.println("total size: " + allGUID.size());
		System.out.println("title before act: " + driver.getTitle());
		driver.quit();

	}

}

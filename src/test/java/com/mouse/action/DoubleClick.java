package com.mouse.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {

		WebDriver driver;
		String driverpath = "C:\\\\Users\\\\88016\\\\eclipse-workspace\\\\PracticeForExam\\\\DriverBrowser\\\\chromedriver.exe";
		String Url = "http://demo.guru99.com/test/simple_context_menu.html";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		System.out.println("success doble click");
		driver.switchTo().alert().accept();
		System.out.println("success alert");
		driver.close();

	}

}

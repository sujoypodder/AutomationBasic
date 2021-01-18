package com.mouse.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\\\Users\\\\88016\\\\eclipse-workspace\\\\PracticeForExam\\\\DriverBrowser\\\\chromedriver.exe";
		String Url = "http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		WebElement dragsrc = driver.findElement(By.id("box3"));
		WebElement dropdes = driver.findElement(By.id("box103"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dropdes, dropdes).perform();
		Thread.sleep(2000);
		System.out.println("okay");
		driver.close();

	}

}

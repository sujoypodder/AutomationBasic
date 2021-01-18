package com.mouse.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuToSubmenu {

	public static void main(String[] args) {

		WebDriver driver;
		String driverpath = "C:\\\\Users\\\\88016\\\\eclipse-workspace\\\\PracticeForExam\\\\DriverBrowser\\\\chromedriver.exe";
		String Url = "https://demo.opencart.com/";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		Actions act = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));
		act.moveToElement(menu).perform();
		WebElement submenu = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a"));
		submenu.click();
		System.out.println(driver.getTitle());
		System.out.println("okay build");
		driver.close();

	}

}

package com.mouse.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BasicAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\\\Users\\\\88016\\\\eclipse-workspace\\\\PracticeForExam\\\\DriverBrowser\\\\chromedriver.exe";
		String Url = "http://the-internet.herokuapp.com/javascript_alerts";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		button.click();
		Thread.sleep(3000);
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().accept();
		System.out.println("successfull");
		driver.close();

	}

}

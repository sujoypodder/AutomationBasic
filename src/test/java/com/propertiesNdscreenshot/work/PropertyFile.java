package com.propertiesNdscreenshot.work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\PropertyFile\\config");
		Properties pro = new Properties();
		pro.load(fis);
		System.setProperty("webdriver.chrome.driver", pro.getProperty("driverpath"));
		WebDriver driver = new ChromeDriver();
		driver.get(pro.getProperty("baseUrl"));
		WebElement email = driver.findElement(By.id(pro.getProperty("emailid")));
		email.sendKeys(pro.getProperty("emailtext"));
		driver.findElement(By.id(pro.getProperty("password"))).sendKeys(pro.getProperty("passwordtext"));
		Thread.sleep(2000);
		System.out.println("Complete");
		driver.close();
	}

}

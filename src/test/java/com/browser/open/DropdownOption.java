package com.browser.open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOption {

	public static void main(String[] args) {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\chromedriver.exe";
		String baseurl = "http://demo.automationtesting.in/Register.html";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);

		// Checking single or multiple dropdown----------------------------------------
		WebElement skills1 = driver.findElement(By.id("Skills"));
		Select skill1 = new Select(skills1);
		boolean singleormultiple = skill1.isMultiple();
		if (singleormultiple) {
			System.out.println("multiple");
		} else {
			System.out.println("single");
		}
//		skill1.selectByIndex(4);

		// Get all options and store in list
		java.util.List<WebElement> allElement = skill1.getOptions();
		System.out.println("values present are ");
		for (WebElement element : allElement) {
			System.out.println(element.getText());
		}
		skill1.selectByIndex(5);
		driver.close();

	}

}

package com.FrameWindow.work;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\\\Users\\\\88016\\\\eclipse-workspace\\\\PracticeForExam\\\\DriverBrowser\\\\chromedriver.exe";
		String Url = "http://the-internet.herokuapp.com/windows";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		String parentGUID = driver.getWindowHandle();

		WebElement clkbtn = driver.findElement(By.linkText("Click Here"));
		clkbtn.click();
		// get all session id of browser
		Set<String> allGUID = driver.getWindowHandles();
		// child
		for (String childGUID : allGUID) {
			if (!childGUID.equals(parentGUID)) {
				driver.switchTo().window(childGUID);
				driver.navigate().to("https://www.youtube.com/");
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				break;
			}
		}
		// parent
		for (String childGUID : allGUID) {
			if (!childGUID.equals(parentGUID)) {
				driver.switchTo().window(parentGUID);
				driver.get("https://www.google.co.in/");
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				break;
			}
		}
		// switch to child again
		for (String childGUID : allGUID) {
			if (!childGUID.equals(parentGUID)) {
				driver.switchTo().window(childGUID);
				driver.close();
			}
		}
		// driver.quit();

	}

}

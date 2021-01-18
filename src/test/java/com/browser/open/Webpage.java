package com.browser.open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class Webpage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\chromedriver.exe";
		String baseurl = "http://demo.automationtesting.in/Register.html";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
		WebElement uploadElement = driver.findElement(By.id("imagesrc"));
		uploadElement.sendKeys("C:\\Users\\88016\\Desktop\\IMG_20200804_165546_Bokeh.jpg");
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("Sujoy");
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("Podder");
		WebElement address = driver.findElement(By.tagName("textarea"));
		address.sendKeys("Dhanmondi");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("email123gmail.com");
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("1234567890");
		WebElement male = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		male.click();
		WebElement cricket = driver.findElement(By.id("checkbox1"));
		cricket.click();

		driver.findElement(By.id("msdd")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"))
				.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[8]/label")).click();

		WebElement skills = driver.findElement(By.id("Skills"));
		Select skill = new Select(skills);
		skill.selectByIndex(4);
		WebElement countries = driver.findElement(By.id("countries"));
		Select country = new Select(countries);
		country.selectByVisibleText("Canada");

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[9]")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[8]/label")).click();

		WebElement yeardropdown = driver.findElement(By.id("yearbox"));
		Select years = new Select(yeardropdown);
		years.selectByVisibleText("1995");
		WebElement monthdropdown = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select months = new Select(monthdropdown);
		months.selectByVisibleText("November");
		WebElement daydropdown = driver.findElement(By.id("daybox"));
		Select days = new Select(daydropdown);
		days.selectByVisibleText("19");

		WebElement passwordtextbox = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		passwordtextbox.sendKeys("password123");
		WebElement confirmpasswordtextbox = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		confirmpasswordtextbox.sendKeys("password123");

//		WebElement submitbutton = driver.findElement(By.id("submitbtn"));
//		submitbutton.click();

		WebElement refreshbutton = driver.findElement(By.id("Button1"));
		refreshbutton.click();
		driver.close();
		System.out.println("successfully automation test complete");

	}

}

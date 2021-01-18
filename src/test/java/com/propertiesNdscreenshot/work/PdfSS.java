package com.propertiesNdscreenshot.work;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfSS {

	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {

		WebDriver driver;
		String driverpath = "C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\DriverBrowser\\chromedriver.exe";
		String Url = "https://www.youtube.com/";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(Url);
		// implicitly wait for 5sec
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// take screenshot byte array type
		byte[] input = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		Document doc = new Document();
		String output = "C:\\Users\\88016\\eclipse-workspace\\PracticeForExam\\ScreenshotsNdpdf\\Mypdf.pdf";
		FileOutputStream fos = new FileOutputStream(output);
		// instantiate the pdf writer
		PdfWriter writer = PdfWriter.getInstance(doc, fos);
		// open the pdf for writing
		writer.open();
		doc.open();
		// process content into and image
		Image img = Image.getInstance(input);
		// set the size of the image
		img.scaleToFit(PageSize.A4.getWidth() / 2, PageSize.A4.getHeight() / 2);
		// add image to pdf
		doc.add(img);
		doc.add(new Paragraph(" "));
		// close the files and save to local drive
		doc.close();
		writer.close();
		System.out.println("success");
		driver.close();

	}

}

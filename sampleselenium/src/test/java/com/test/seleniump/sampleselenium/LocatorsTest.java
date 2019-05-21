package com.test.seleniump.sampleselenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatorsTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver dr = new ChromeDriver();
dr.get("https://www.w3schools.com/");
dr.manage().window().maximize();
dr.findElement(By.xpath("//*[text()='LEARN CSS']")).click();
System.out.println(dr.getTitle());
File src=dr.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("C:\\Users\\test\\"+dr.getTitle()+".png"));
Thread.sleep(5000);
dr.quit();
	}

}

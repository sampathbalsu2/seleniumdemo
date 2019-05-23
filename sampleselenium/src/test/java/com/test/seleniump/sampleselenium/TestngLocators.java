package com.test.seleniump.sampleselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngLocators {
  
	@Test
  public void f() throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
dr.get("https://www.w3schools.com/");
dr.manage().window().maximize();
Properties pr = new Properties();
pr.load(new FileInputStream("C:\\Users\\test\\eclipse-workspace\\sampleselenium\\or.properties"));
dr.findElement(By.xpath(pr.getProperty("learnhtml_xpath"))).click();
//dr.findElement(By.cssSelector(".w3-button.w3-dark-grey:first-child")).click();
System.out.println(dr.getTitle());
File src=dr.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("C:\\Users\\test\\"+dr.getTitle()+".png"));
Thread.sleep(5000);
System.out.println(dr.getTitle());
System.out.println(dr.getTitle());
System.out.println(dr.getCurrentUrl());
System.out.println("Test");
System.out.println("sample");
dr.quit();
}
}

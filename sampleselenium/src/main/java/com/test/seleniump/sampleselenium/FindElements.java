package com.test.seleniump.sampleselenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.google.com/");
		WebElement hindi = dr.findElement(By.tagName("a"));
		System.out.println(hindi);
	String hr = hindi.getAttribute("href");
	System.out.println(hr);
	
	
	
		
		
	}

}

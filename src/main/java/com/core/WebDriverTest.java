package com.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	WebDriver driver;
	
	public static void main(String args[]) throws InterruptedException
	{
	
		BaseClass bs = new BaseClass();
		WebDriver driver = bs.setup();

 WebElement searchInput = driver.findElement(By.id("search-input"));
 
 searchInput.sendKeys("Hi");
 
 WebElement searchButton = driver.findElement(By.id("search-button"));
 searchButton.click();
 
 
 
  Thread.sleep(3000);
  driver.close();
	}
	

	
	


}

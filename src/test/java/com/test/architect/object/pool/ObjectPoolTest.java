package com.test.architect.object.pool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import selenium.factory.WebDriverPool;

public class ObjectPoolTest {
	
	@Test
	public void testObjectPoolTest() {		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		// create a new managed instance
		WebDriver driver = WebDriverPool.DEFAULT.getDriver(options);
		// do something with the driver
		driver.get("http://seleniumhq.org/");
		System.out.println(driver.getTitle());

		// obtain the same instance from the pool of the managed instances
		driver = WebDriverPool.DEFAULT.getDriver(options);
		// do something with the driver
		driver.get("http://selenium2.ru/");
		System.out.println(driver.getTitle());

		// destroy the driver
		WebDriverPool.DEFAULT.dismissDriver(driver);
	}

}
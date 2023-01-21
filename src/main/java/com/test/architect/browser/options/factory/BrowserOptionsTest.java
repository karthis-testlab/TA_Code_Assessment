package com.test.architect.browser.options.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserOptionsTest {

	public static void main(String[] args) {
		WebDriver driver; 
		BrowserConfig browserConfig = OptionsFactory.getBrowserConfig(Options.FIREFOX);
		driver = new FirefoxDriver((FirefoxOptions)browserConfig.headless("--headless"));
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
	}

}

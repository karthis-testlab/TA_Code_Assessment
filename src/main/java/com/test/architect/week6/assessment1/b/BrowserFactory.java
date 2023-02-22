package com.test.architect.week6.assessment1.b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.test.architect.assessment.bridge.design.pattern.WebBrowserType;

public class BrowserFactory {
	
	public static WebDriver launch(String browser) {
		WebDriver driver;
		switch (WebBrowserType.valueOf(browser.toUpperCase())) {
		case CHROME:
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case EDGE:
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
		default:
			driver = null;
			break;
		}
		return driver;
	}

}
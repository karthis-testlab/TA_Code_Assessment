package com.test.architect.browser.factory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser implements Driver {

	private ChromeDriver driver;

	public ChromeBrowser() {		
		driver = new ChromeDriver();
	}
	
	public ChromeBrowser(ChromeOptions options) {		
		driver = new ChromeDriver(options);
	}

	public boolean maximize() {
		boolean bReturn;
		try {
			driver.manage().window().maximize();
			bReturn = true;
		} catch (Exception e) {
			bReturn = false;
		}
		return bReturn;
	}

	public boolean getUrl(String url) {
		boolean bReturn;
		try {
			driver.get(url);
			bReturn = true;
		} catch (Exception e) {
			bReturn = false;
		}
		return bReturn;
	}

}
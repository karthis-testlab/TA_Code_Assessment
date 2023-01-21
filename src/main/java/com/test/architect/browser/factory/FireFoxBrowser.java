package com.test.architect.browser.factory;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxBrowser implements Driver {
	
	private FirefoxDriver driver;
	
	public FireFoxBrowser() {
		driver = new FirefoxDriver();
	}
	
	public FireFoxBrowser(FirefoxOptions options) {
		driver = new FirefoxDriver(options);
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

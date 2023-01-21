package com.test.architect.browser.factory;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeBrowser implements Driver {
	
	private EdgeDriver driver;
	
	public EdgeBrowser() {
		driver = new EdgeDriver();
	}
	
	public EdgeBrowser(EdgeOptions options) {
		driver = new EdgeDriver(options);
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
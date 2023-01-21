package com.test.architect.browser.options.factory;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxBrowserOptions implements BrowserConfig {
	
	private FirefoxOptions firefox;
	
	public FirefoxBrowserOptions() {
		firefox = new FirefoxOptions();
	}	

	@Override
	public MutableCapabilities headless(String arg) {
		return firefox.addArguments(arg);
	}

	@Override
	public MutableCapabilities headless(boolean arg) {		
		return firefox.setHeadless(arg);
	}

	@Override
	public MutableCapabilities disableNotifications(String arg) {		
		return firefox.addArguments(arg);
	}

}
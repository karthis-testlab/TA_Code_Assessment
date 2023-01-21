package com.test.architect.browser.options.factory;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserOptions implements BrowserConfig {
	
	private ChromeOptions chrome;
	
	public ChromeBrowserOptions() {
		chrome = new ChromeOptions();
	}

	@Override
	public MutableCapabilities headless(String arg) {		
		return chrome.addArguments(arg);
	}

	@Override
	public MutableCapabilities headless(boolean arg) {		
		return chrome.setHeadless(arg);
	}

	@Override
	public MutableCapabilities disableNotifications(String arg) {
		return chrome.addArguments(arg);
	}

}

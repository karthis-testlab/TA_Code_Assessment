package com.test.architect.assessment.browser.options.factory;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserOptions implements BrowserConfig {
	
	private ChromeOptions chrome;
	
	public ChromeBrowserOptions() {
		chrome = new ChromeOptions();
	}

	public MutableCapabilities headless(String arg) {		
		return chrome.addArguments(arg);
	}

	public MutableCapabilities headless(boolean arg) {		
		return chrome.setHeadless(arg);
	}

	public MutableCapabilities disableNotifications(String arg) {
		return chrome.addArguments(arg);
	}
	
	public MutableCapabilities maximize() {		
		return chrome.addArguments("start-maximized");
	}
	
	public MutableCapabilities setDownloadDirectory(String folderPath) {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", folderPath);
		return chrome.setExperimentalOption("prefs", prefs);
	}

}

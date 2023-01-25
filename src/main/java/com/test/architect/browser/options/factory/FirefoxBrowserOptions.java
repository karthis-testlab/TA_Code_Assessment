package com.test.architect.browser.options.factory;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxBrowserOptions implements BrowserConfig {

	private FirefoxOptions firefox;

	public FirefoxBrowserOptions() {
		firefox = new FirefoxOptions();
	}

	public MutableCapabilities headless(String arg) {
		return firefox.addArguments(arg);
	}

	public MutableCapabilities headless(boolean arg) {
		return firefox.setHeadless(arg);
	}

	public MutableCapabilities disableNotifications(String arg) {
		return firefox.addArguments(arg);
	}

	public MutableCapabilities maximize() {
		return firefox.addArguments("start-maximized");
	}
	
	public MutableCapabilities setDownloadDirectory(String folderPath) {		
		return firefox.addPreference("download.default_directory", folderPath);
	}

}
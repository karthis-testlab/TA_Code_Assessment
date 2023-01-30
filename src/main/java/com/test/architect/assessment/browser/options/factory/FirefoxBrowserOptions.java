package com.test.architect.assessment.browser.options.factory;

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

	/*
	 * maximize() method is not applicable for the firefox driver options
	 * which means the string arguments "start-maximized" was not allowed in
	 * Firefox options. But it does it affect any follow.
	 * 
	 */
	public MutableCapabilities maximize() {
		return firefox.addArguments("");
	}
	
	public MutableCapabilities setDownloadDirectory(String folderPath) {		
		return firefox.addPreference("download.default_directory", folderPath);
	}
	
	/*
	 * In Firefox options we don't have setExprementalOption() method, so we don't able
	 * to add the already existing mobile device library in the Firefox options leve
	 * instead we'll create the customized mobile emulate options
	 */
	public MutableCapabilities setMobileEmulation(String deviceName) {
		return null;
	}

	public MutableCapabilities openPrivateWindow(String arg) {
		// TODO Auto-generated method stub
		return null;
	}

}
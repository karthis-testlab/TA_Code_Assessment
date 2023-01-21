package com.test.architect.browser.options.factory;

import org.openqa.selenium.MutableCapabilities;

public interface BrowserConfig {
	
	MutableCapabilities headless(String arg);

}
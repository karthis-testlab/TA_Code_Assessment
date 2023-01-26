package com.test.architect.browser.factory;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.test.architect.assessment.browser.options.factory.BrowserConfig;
import com.test.architect.assessment.browser.options.factory.Options;
import com.test.architect.assessment.browser.options.factory.OptionsFactory;

public class DriverFactory {

	public static Driver getDriver(BrowserType browserType) {
		
		BrowserConfig browserConfig;

		switch (browserType) {
		case CHROME:
			browserConfig = OptionsFactory.getBrowserConfig(Options.CHROME);
			return new ChromeBrowser((ChromeOptions) browserConfig.headless("--headless"));
		case FIREFOX:
			browserConfig = OptionsFactory.getBrowserConfig(Options.FIREFOX);
			return new FireFoxBrowser((FirefoxOptions) browserConfig.headless("--headless"));
		case EDGE:
			browserConfig = OptionsFactory.getBrowserConfig(Options.EDGE);
			return new EdgeBrowser((EdgeOptions) browserConfig.headless("--headless"));
		default:
			return null;
		}

	}

}
package com.test.architect.browser.options;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeOptionsExamples {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver(disableNotifications("disable-notifications"));
		driver.get("https://www.carwale.com/");
	}
	
	public static EdgeOptions maximize() {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		return options;
	}
	
	public static EdgeOptions headless(String arg) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments(arg);
		return options;
	}
	
	public static EdgeOptions headless(boolean headless) {
		EdgeOptions options = new EdgeOptions();
		options.setHeadless(headless);
		return options;
	}
	
	public static EdgeOptions disableNotifications(String arg) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments(arg);
		return options;
	}
	
	public static EdgeOptions setDownloadDirectory(String folderPath) {
		EdgeOptions options = new EdgeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", folderPath);
		options.setExperimentalOption("prefs", prefs);
		return options;
	}
	
	public static EdgeOptions setMobileEmulation(String deviceName) {
		EdgeOptions options = new EdgeOptions();
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", deviceName);
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		return options;
	}
	
	public static EdgeOptions setCustomMobileEmulation(int width, int height, double pixelRatio, String userAgent) {
		EdgeOptions options = new EdgeOptions();
		Map<String, Object> deviceMetrics = new HashMap<String, Object>();
		deviceMetrics.put("width", width);
		deviceMetrics.put("height", height);
		deviceMetrics.put("pixelRatio", pixelRatio);
		Map<String, Object> mobileEmulation = new HashMap<String, Object>();
		mobileEmulation.put("deviceMetrics", deviceMetrics);		
		mobileEmulation.put("userAgent", userAgent);
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		return options;
	}

}
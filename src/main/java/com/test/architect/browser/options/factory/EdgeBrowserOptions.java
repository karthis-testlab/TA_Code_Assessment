package com.test.architect.browser.options.factory;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeBrowserOptions implements BrowserConfig {
	
	private EdgeOptions edge;
	
	public EdgeBrowserOptions() {
		edge = new EdgeOptions();
	}

	public MutableCapabilities headless(String arg) {		
		return edge.addArguments(arg);
	}

	public MutableCapabilities headless(boolean arg) {		
		return edge.setHeadless(arg);
	}

	public MutableCapabilities disableNotifications(String arg) {
		return edge.addArguments(arg);
	}
	
	public MutableCapabilities maximize() {		
		return edge.addArguments("start-maximized");
	}
	
	public MutableCapabilities setDownloadDirectory(String folderPath) {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", folderPath);
		return edge.setExperimentalOption("prefs", prefs);
	}

}
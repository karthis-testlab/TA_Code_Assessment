package com.test.architect.browser.options.factory;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeBrowserOptions implements BrowserConfig {
	
	private EdgeOptions edge;
	
	public EdgeBrowserOptions() {
		edge = new EdgeOptions();
	}

	@Override
	public MutableCapabilities headless(String arg) {		
		return edge.addArguments(arg);
	}

	@Override
	public MutableCapabilities headless(boolean arg) {		
		return edge.setHeadless(arg);
	}

	@Override
	public MutableCapabilities disableNotifications(String arg) {
		return edge.addArguments(arg);
	}

}
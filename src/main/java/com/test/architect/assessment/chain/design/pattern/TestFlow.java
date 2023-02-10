package com.test.architect.assessment.chain.design.pattern;

import org.openqa.selenium.WebDriver;

public class TestFlow {
	
	private String testFlow;
	private WebDriver driver;
	
	public TestFlow(String testFlow, WebDriver driver) {
		this.testFlow = testFlow;
		this.driver = driver;
	}
	
	public String getTestFlow() {
		return testFlow;
	}
	
	public WebDriver getWebDriver() {
		return driver;
	}

}
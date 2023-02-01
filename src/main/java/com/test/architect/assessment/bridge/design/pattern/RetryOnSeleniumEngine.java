package com.test.architect.assessment.bridge.design.pattern;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.test.architect.utils.HandleProperties;

public class RetryOnSeleniumEngine implements IRetryAnalyzer {

	private int count = 0;
	private int maxCount = 1;

	public boolean retry(ITestResult result) {
		updateRunEngineAsSelenium();
		if (count < maxCount) {
			count++;
			return true;
		}
		return false;
	}

	public void updateRunEngineAsSelenium() {
		if (!HandleProperties.readConfigProperties("Engine").equalsIgnoreCase("SELENIUM")) {
			HandleProperties.updateConfigProperties("Engine", "SELENIUM");
		}
	}

}
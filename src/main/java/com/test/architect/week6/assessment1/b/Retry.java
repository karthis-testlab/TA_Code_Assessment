package com.test.architect.week6.assessment1.b;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.test.architect.utils.HandleProperties;

public class Retry implements IRetryAnalyzer {
	
	private int count = 0;
	private int max = 1;

	@Override
	public boolean retry(ITestResult result) {
		if(count < max) {
			updateBrowserDriverAsFirefox();
			count++;
			return true;
		}
		return false;
	}
	
	public void updateBrowserDriverAsFirefox() {
		if (!HandleProperties.readConfigProperties("Browser").equalsIgnoreCase("CHROME") || 
				!HandleProperties.readConfigProperties("Browser").equalsIgnoreCase("EDGE")) {
			
			HandleProperties.updateConfigProperties("Browser", "FIREFOX");
			
		}
	}

}
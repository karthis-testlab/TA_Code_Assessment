package com.test.architect.week6.assessment2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.test.architect.utils.HandleProperties;

public class Retry implements IRetryAnalyzer {	
	
	private final String min = "3";
	private final String avg = "6";
	private final String max = "12";
	private int count = 0;
	private int maxCount = 2;

	@Override
	public boolean retry(ITestResult result) {
		if(count < maxCount) {
			count++;
			if(HandleProperties.readConfigProperties("wait").equals("3")) {
				updateWait(min);
			} else {
				updateWait(avg);
			}
			return true;
		}
		updateWait(max);
		return false;
	}
	
	public void updateWait(String wait) {		
		switch (wait) {
		case "3":
			HandleProperties.updateConfigProperties("wait", "6");
			break;
		case "6":
			HandleProperties.updateConfigProperties("wait", "12");
			break;
		case "12":
			HandleProperties.updateConfigProperties("wait", "3");
			break;
		default:
			break;
		}
	}

}
package com.test.architect.assessment.interfaces;

public interface IReporter {
	
	public void startReport(String testcaseName);
	
	public void endReport();
	
	public void successLog(String desc);
	
	public void failureLog(String dec, String filePath);
	
	public void infoLog();

}
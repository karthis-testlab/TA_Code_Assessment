package com.test.architect.assessment.bridge.design.pattern;

public interface EngineRawMetrial {
	
	void launch(String broserName, String aut);
	void type(String locator, String text);
	void click(String locator);
	String getText(String locator);
	void close();

}
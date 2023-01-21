package com.test.architect.assessment.interfaces;

public interface IFixture {
	
	public void setUp(String arg);
	
	public Object[][] readData();
	
	public void tearDown();

}

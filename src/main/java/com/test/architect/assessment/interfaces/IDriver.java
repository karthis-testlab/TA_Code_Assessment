package com.test.architect.assessment.interfaces;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface IDriver {
	
	public RemoteWebDriver createDriver(String browserName);

}

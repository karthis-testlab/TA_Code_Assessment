package com.test.architect.assessment.interfaces;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface IBrowser {
	
	public boolean launchBrowser();
	
	public boolean launchBrowser(String browserName);
	
	public boolean goTo(String url);
	
	public WebElement selector(String domEle);
	
	public List<WebElement> selectors(String domEle);
	
	public boolean quitBrowser();
	
	public boolean closeBrowser();

}

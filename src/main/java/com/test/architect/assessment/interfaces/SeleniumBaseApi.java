package com.test.architect.assessment.interfaces;

import java.util.List;

import org.openqa.selenium.WebElement;

public class SeleniumBaseApi implements IBrowser, IWebObject {

	public boolean click() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean type() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getWebText() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean launchBrowser() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean launchBrowser(String browserName) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean goTo(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	public WebElement selector(String domEle) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WebElement> selectors(String domEle) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean quitBrowser() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean closeBrowser() {
		// TODO Auto-generated method stub
		return false;
	}

}

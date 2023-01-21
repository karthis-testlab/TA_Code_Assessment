package com.test.architect.assessment.interfaces;

import java.util.List;

import org.openqa.selenium.WebElement;

public class SeleniumBaseApi implements IBrowser, IWebObject {

	@Override
	public boolean click() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean type() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getWebText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean launchBrowser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean launchBrowser(String browserName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean goTo(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public WebElement selector(String domEle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> selectors(String domEle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean quitBrowser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean closeBrowser() {
		// TODO Auto-generated method stub
		return false;
	}

}

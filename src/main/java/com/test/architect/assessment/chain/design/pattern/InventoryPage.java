package com.test.architect.assessment.chain.design.pattern;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InventoryPage {

	private WebDriver driver;

	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}

	public InventoryPage validateInventoryUrl() {
		boolean actual = driver.getCurrentUrl().contains("/inventory.html");
		System.out.println("Validate url of the inventory page -> "+driver.getCurrentUrl());
		Assert.assertEquals(actual, true);		
		return this;
	}

}
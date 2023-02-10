package com.test.architect.assessment.chain.design.pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUserName(String uName) {
		driver.findElement(By.id("user-name")).sendKeys(uName);
		System.out.println("Enter the username: "+uName); 
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		System.out.println("Enter the password: "+pwd); 
		return this;
	}
	
	public LoginPage clickLoginBtn() {
		driver.findElement(By.id("login-button")).click();
		System.out.println("Clicking on the login button");
		return this;
	}
	
	public InventoryPage clickLoginBtnToRedriectInventory() {
		driver.findElement(By.id("login-button")).click();
		System.out.println("Clicking on the login button to re-driect to the inventory");
		return new InventoryPage(driver);
	}
	
	public LoginPage validateErrorMsg() {
		boolean actual = driver.findElement(By.xpath("//h3[@data-test='error']")).getText().contains("Epic sadface: Username and password do not match any user in this service");
		System.out.println("Validate error message -> "+driver.findElement(By.xpath("//h3[@data-test='error']")).getText());
		Assert.assertEquals(actual, true);		
		return this;
	}

}
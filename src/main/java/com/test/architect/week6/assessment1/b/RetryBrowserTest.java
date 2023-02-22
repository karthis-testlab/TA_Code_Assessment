package com.test.architect.week6.assessment1.b;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.test.architect.utils.HandleProperties;

public class RetryBrowserTest {
	
	private WebDriver driver;
	
	@Test(retryAnalyzer = Retry.class)
	public void test() {
		driver = BrowserFactory.launch(HandleProperties.readConfigProperties("Browser"));
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		boolean actual = driver.getCurrentUrl().contains("./inventory.html");
		Assert.assertTrue(actual);		
	}
	
	@AfterMethod
	public void tearDown() { driver.quit(); }
	
	@AfterSuite
	public void afterSuite() { HandleProperties.updateConfigProperties("Browser", "Chrome");}

}
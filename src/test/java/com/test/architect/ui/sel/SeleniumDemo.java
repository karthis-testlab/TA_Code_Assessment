package com.test.architect.ui.sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		RemoteWebDriver driver = getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		boolean actual = driver.getCurrentUrl().contains("inventory.html");
		Assert.assertEquals(actual, true);
		driver.close();

	}

	public static RemoteWebDriver getDriver(String browserName) {
		switch (browserName.toUpperCase()) {
		case "CHROME":
			return new ChromeDriver();
		case "SAFARI":
			return new SafariDriver();
		case "EDGE":
			return new EdgeDriver();
		case "FIREFOX":
			return new FirefoxDriver();
		default:
			System.err.println("getDriver Method supports only CHROME, SAFARI, EDGE, FIREFOX");
			return null;
		}
	}

}
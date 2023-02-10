package com.test.architect.assessment.chain.design.pattern;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestChainOfResponsiblityPattern {
	
	ITestFlow positive;
	ITestFlow negative;
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		positive = new PositiveFlow();
		negative = new NegativeFlow();
		positive.setTestFlow(negative);
	}
	
	@DataProvider
	public String[][] getTestFlow(){
		return new String[][] {
			{"Positive"},
			{"Negative"}
		};
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test(dataProvider = "getTestFlow")
	public void testChainofResponsibility(String testFlow) {
		TestFlow test = new TestFlow(testFlow, driver);
		positive.doTest(test);
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	

}
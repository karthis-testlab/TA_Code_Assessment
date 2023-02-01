package com.test.architect.assessment.bridge.design.pattern;

import org.testng.annotations.Test;

import com.test.architect.utils.HandleProperties;

public class BridgeDesignPatternRetryTest {	
	
	String aut = "http://leaftaps.com/opentaps";	
	
	@Test(retryAnalyzer = RetryOnSeleniumEngine.class)
	public void seleniumRetryBridgeTest() {
		
		EngineRawMetrial engine = EngineFactory.engineToRun(HandleProperties.readConfigProperties("Engine"));
		engine.launch(HandleProperties.readConfigProperties("Browser"), aut);
		
		engine.type("//input[@id='username']", "demosalesmanager");
		engine.type("//input[@id='password']", "crmsfa");
		engine.click("//input[@class='decorativeSubmit']");
		engine.click("//a[contains(text(),'CRM/SFA')]");
		engine.click("//a[text()='Leads']");
		engine.click("//a[text()='Create Lead']");
		engine.type("//input[@id='createLeadForm_companyName']", "Team A");
		engine.type("//input[@id='createLeadForm_firstName']", "A");
		engine.type("//input[@id='createLeadForm_lastName']", "Team");
		engine.type("//input[@id='createLeadForm_primaryEmail']", "team_a@testleaf.com");
		engine.click("//input[@name='submitButton']");
		System.out.println(engine.getText("//span[@id='viewLead_companyName_sp']"));
		
		engine.close();		
		
	}
	

}
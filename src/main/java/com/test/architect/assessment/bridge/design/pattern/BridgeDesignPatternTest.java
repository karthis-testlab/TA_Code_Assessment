package com.test.architect.assessment.bridge.design.pattern;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BridgeDesignPatternTest {	
	
	String aut = "http://leaftaps.com/opentaps";
	
	@DataProvider
	public String[][] engineData(){
		return new String[][] {
			{"selenium", "chrome"},
			{"playwright", "chrome"}
		};
	}
	
	@Test(dataProvider = "engineData")
	public void seleniumBridgeTest(String engineName, String browserName) {
		
		EngineRawMetrial engine = EngineFactory.engineToRun(engineName);
		engine.launch(browserName, aut);
		
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
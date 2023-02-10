package com.test.architect.assessment.chain.design.pattern;

public class PositiveFlow implements ITestFlow {
	
	private ITestFlow testFlow;

	@Override
	public void setTestFlow(ITestFlow testFlow) {
		this.testFlow = testFlow;		
	}

	@Override
	public void doTest(TestFlow test) {
		if(test.getTestFlow().equalsIgnoreCase("POSITIVE")) {
			System.out.println("Running on the positive testing flow");
			new LoginPage(test.getWebDriver())
			.enterUserName("standard_user")
			.enterPassword("secret_sauce")
			.clickLoginBtnToRedriectInventory()
			.validateInventoryUrl();
		} else {
			testFlow.doTest(test);
		}
	}

}
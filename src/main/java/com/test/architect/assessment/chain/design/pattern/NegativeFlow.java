package com.test.architect.assessment.chain.design.pattern;

public class NegativeFlow implements ITestFlow {
	
	@SuppressWarnings("unused")
	private ITestFlow testFlow;

	@Override
	public void setTestFlow(ITestFlow testFlow) {
		this.testFlow = testFlow;				
	}

	@Override
	public void doTest(TestFlow test) {
		if(test.getTestFlow().equalsIgnoreCase("NEGATIVE")) {
			System.out.println("Running on the negative testing flow");
			new LoginPage(test.getWebDriver())
			.enterUserName("standard_user")
			.enterPassword("secret_sauce1")
			.clickLoginBtn()
			.validateErrorMsg();
		}
	}

}
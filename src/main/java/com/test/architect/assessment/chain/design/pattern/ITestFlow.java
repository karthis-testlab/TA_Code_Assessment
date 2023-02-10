package com.test.architect.assessment.chain.design.pattern;

public interface ITestFlow {
	
	public void setTestFlow(ITestFlow testFlow);
	
	public void doTest(TestFlow test);

}
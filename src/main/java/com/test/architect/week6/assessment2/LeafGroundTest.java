package com.test.architect.week6.assessment2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.architect.utils.HandleProperties;

public class LeafGroundTest {
	
	@Test(retryAnalyzer = Retry.class)
	public void testLeafGround() {
		System.out.println(HandleProperties.readConfigProperties("wait"));
		Assert.assertTrue(false);
	}

}
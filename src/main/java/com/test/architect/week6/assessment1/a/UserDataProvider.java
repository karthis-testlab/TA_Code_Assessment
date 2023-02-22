package com.test.architect.week6.assessment1.a;

import org.testng.annotations.DataProvider;

public class UserDataProvider {
	
	@DataProvider(name = "main")
	public String[][] getUserCrendentials() {
		return new String[][] {
			{"standard_user1", "secret_sauce"},
			{"standard_user", "secret_sauce"}
		};
	}
	
	@DataProvider(name = "retry", indices = {1})
	public String[][] getRetryUserCrendentials() {
		return new String[][] {
			{"standard_user1", "secret_sauce"},
			{"standard_user", "secret_sauce"}
		};
	}

}
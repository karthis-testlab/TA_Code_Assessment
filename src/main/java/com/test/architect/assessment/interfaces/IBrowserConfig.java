package com.test.architect.assessment.interfaces;

import org.openqa.selenium.MutableCapabilities;

public interface IBrowserConfig {

	MutableCapabilities headless(String arg);

	MutableCapabilities headless(boolean arg);

	MutableCapabilities disableNotifications(String arg);

}
package com.test.architect.browser.options;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FireFoxOptionsExamples {

	public static void main(String[] args) {
		
		String userAgent = "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19";
		
		/* FirefoxDriver driver = new FirefoxDriver(headless("-headless"));
		 driver.get("https://www.saucedemo.com/"); */
		
		/* FirefoxDriver driver = new FirefoxDriver(webNotificationDisabled());
		driver.get("https://www.carwale.com/"); */
		
		/* FirefoxDriver driver = new FirefoxDriver(setDownloadDirectory("/Users/karthistestlab/Documents/Test Architect/eclipse-workspace/TA_Code_AssessMent/downloads"));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/download");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Screenshot.png")).click(); */
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("general.useragent.override", userAgent);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		Dimension dimension = new Dimension(360, 640);
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.manage().window().setSize(dimension);
		driver.get("https://www.saucedemo.com/");
		
	}
	
	public static FirefoxOptions openPrivateWindow() {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("-private-window");
		return options;
	}
	
	public static FirefoxOptions headless(boolean isHeadless) {
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(isHeadless);
		return options;
	}
	
	public static FirefoxOptions headless(String arg) {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments(arg);
		return options;
	}
	
	public static FirefoxOptions webNotificationDisabled() {
		FirefoxOptions options = new FirefoxOptions();
		//options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);
		return options;
	}
	
	public static FirefoxOptions setDownloadDirectory(String folderPath) {
		FirefoxOptions options = new FirefoxOptions();
		options.addPreference("download.default_directory", folderPath);
		return options;
	}

}
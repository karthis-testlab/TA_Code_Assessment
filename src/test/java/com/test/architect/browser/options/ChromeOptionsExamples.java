package com.test.architect.browser.options;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExamples {

	public static void main(String[] args) {
		
		 String userAgent = "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19";
		
		 ChromeDriver driver = new ChromeDriver(setCustomMobileEmulation(360, 640, 3.0, userAgent));
		 driver.get("https://www.saucedemo.com/");
		
		/* ChromeDriver driver = new ChromeDriver(setDownloadDirectory("/Users/karthistestlab/Documents/Test Architect/eclipse-workspace/TA_Code_AssessMent/downloads"));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/download");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("AssamHistoricBook.jpg")).click(); */
		
		/* ChromeDriver driver = new ChromeDriver(disableNotifications("disable-notifications"));
		//driver.get("https://www.carwale.com/"); */
		
	}
	
	public static ChromeOptions maximize() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		return options;
	}
	
	public static ChromeOptions headless(String arg) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments(arg);
		return options;
	}
	
	public static ChromeOptions headless(boolean headless) {
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(headless);
		return options;
	}
	
	public static ChromeOptions disableNotifications(String arg) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments(arg);
		return options;
	}
	
	public static ChromeOptions setDownloadDirectory(String folderPath) {
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", folderPath);
		options.setExperimentalOption("prefs", prefs);
		return options;
	}
	
	public static ChromeOptions setMobileEmulation(String deviceName) {
		ChromeOptions options = new ChromeOptions();
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", deviceName);
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		return options;
	}
	
	public static ChromeOptions setCustomMobileEmulation(int width, int height, double pixelRatio, String userAgent) {
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> deviceMetrics = new HashMap<String, Object>();
		deviceMetrics.put("width", width);
		deviceMetrics.put("height", height);
		deviceMetrics.put("pixelRatio", pixelRatio);
		Map<String, Object> mobileEmulation = new HashMap<String, Object>();
		mobileEmulation.put("deviceMetrics", deviceMetrics);		
		mobileEmulation.put("userAgent", userAgent);
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		return options;
	}
	

}
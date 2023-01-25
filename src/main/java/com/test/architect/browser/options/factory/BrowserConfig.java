package com.test.architect.browser.options.factory;

import org.openqa.selenium.MutableCapabilities;

/**
 * BroswerConfig is a interface to set the capability and customized and
 * configuration of the browser drivers session
 * 
 * Key methods are {@link BrowserConfig#headless(boolean)}, which is used to
 * run the test browser in the headless form and the {@link BrowserConfig#disableNotifications(String)}, 
 * which is used to disable the browser level notification 
 * 
 * @author Team A
 *
 */
public interface BrowserConfig {
	
	/**
	 * Launch the test browser in the headless mode. Which means we can't able to see the test
	 * run visually. It's run behind the screen.
	 * 
	 * @param arg The String argument should pass for converting headless mode. i.e; "--headless"
	 * @return Should return the MutableCapabilities object which parent class for all browser capabilities (options)
	 */
	MutableCapabilities headless(String arg);
	
	/**
	 * This is overloading method of headless with boolean arguments.
	 * Launch the test browser in the headless mode. Which means we can't able to see the test
	 * run visually. It's run behind the screen.
	 * 
	 * @param arg The boolean argument should pass for converting headless mode. i.e; "TRUE (or) FALSE"
	 * By default we can set this as FALSE.
	 * @return Should return the MutableCapabilities object which parent class for all browser capabilities (options)
	 */
	MutableCapabilities headless(boolean arg);
	
	/**
	 * This method is used to disable the browser level notification. If we set this option
	 * while we open any AUT application in the browser, which set this option we can't see any
	 * notification which relevant to the browser
	 * 
	 * @param arg The String argument should pass for disable the notification. i.e; "disable-notifications"
	 * @return Should return the MutableCapabilities object which parent class for all browser capabilities (options)
	 */
	MutableCapabilities disableNotifications(String arg);
	
	/**
	 * This method is used to maximize the browser at time of launching. It's alternative approach for
	 * driver.manage().window().maximize() method. The main difference between these two approach is if we
	 * use driver.manage().window().maximize() method after launching the test browser if we called this method
	 * the browser will maximize. But if set this as capability we don't need to call explicitly 
	 * driver.manage().window().maximize() method. 
	 * 
	 * @return Should return the MutableCapabilities object which parent class for all browser capabilities (options)
	 */
	MutableCapabilities maximize();
	
	/**
	 * If we want to change the default download directory path. We can use this method. Generally, we download any file
	 * from the web it'll stored (or) download in the system specified download directory path. Use this method we can
	 * change with location we're we need to download the file.
	 * 
	 * @param folderPath The String argument should pass to set download directory. Should mention the file absolute file path we're
	 * we need to download the file.	 * 
	 * @return Should return the MutableCapabilities object which parent class for all browser capabilities (options)
	 */
	MutableCapabilities setDownloadDirectory(String folderPath);

}
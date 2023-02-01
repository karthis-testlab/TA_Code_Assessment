package com.test.architect.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HandleProperties {

	public static String readConfigProperties(String key) {
		Properties properties = new Properties();
		String value = null;
		try {
			FileReader reader = new FileReader("./config.properties");
			properties.load(reader);
			value = properties.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	public static void updateConfigProperties(String key, String value) {
		Properties properties = new Properties();
		FileInputStream reader;
		FileOutputStream wirter;
		try {
			reader = new FileInputStream("./config.properties");
			properties.load(reader);
			reader.close();
			wirter = new FileOutputStream("./config.properties");
			properties.setProperty(key, value);
			properties.store(wirter, null);
			wirter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
package com.dietician.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	// This class is used to read the properties from config.properties files
	// This class returns properties prop object
	private Properties prop;

	public Properties init_prop() {
		try {

			prop = new Properties();
			// TODO: what should be the final value of config file location
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\msuni\\GITHub_Repos\\Dietician_Framework_0613\\src\\test\\resources\\config\\config.properties");
			
			
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
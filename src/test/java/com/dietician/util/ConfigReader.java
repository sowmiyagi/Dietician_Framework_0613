package com.dietician.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	//This class is used to read the properties from config.properties files
	//This class returns properties prop object
	private Properties prop;
	public Properties init_prop()
	{
	try {
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\ompra\\eclipse-workspace\\Dietician_Hackathon\\src\\test\\resources\\config\\config.properties");
		prop.load(ip);
	}catch(IOException e){
	 e.printStackTrace();
	}	
return prop;
}
}
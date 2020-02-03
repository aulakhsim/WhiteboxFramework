package com.whiteboxframework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	//create object of properties class
		Properties pro;
		
		//create constructor
		
		public ReadConfig() {
			File src = new File ("./Configuration/config.properties");
			
			try {
				FileInputStream fis =new FileInputStream(src);
				pro = new Properties();
				pro.load(fis);
				
			}catch (Exception e) {
				System.out.println("Exception is " + e.getMessage());
			}
		}
		
		//to read value from the properties file create method for each 
		
		public String getURL() {
			
			String url=pro.getProperty("baseURL");
			return url;
		}
		
		public String getUserName() {
			String username =pro.getProperty("username");
			return username;
		}
		
		public String getPassword() {
			String password= pro.getProperty("password");
			return password;
		}
		
		public String getChromePath() {
			String chromepath= pro.getProperty("chrompath");
			return chromepath;
		}

}

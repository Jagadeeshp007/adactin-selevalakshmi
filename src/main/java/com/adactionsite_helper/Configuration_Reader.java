package com.adactionsite_helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class Configuration_Reader {
	
	
	public static Properties p;

	public Configuration_Reader() throws Throwable {
    
	File f = new File(".\\src\\main\\java\\com\\adactionsite_helper\\Configuration.properties2");
    FileInputStream fis = new  FileInputStream(f);
    p = new Properties();
    p.load(fis);
	}
	
	public String getUsername() {
		 p = new Properties();
		String username = p.getProperty("username"); // Return Type
		return username;

	}
	
	public String getPassword() {
    
		p = new Properties();
		String password = p.getProperty("password");  // Return Type
		return password;
	}
}

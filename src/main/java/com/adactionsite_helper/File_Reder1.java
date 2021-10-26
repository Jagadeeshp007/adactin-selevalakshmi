package com.adactionsite_helper;

import java.io.FileReader;

import com.helper.Configuration_Reder;

public class File_Reder1 {

	 private File_Reder1() {
		 
	}
	
	public static File_Reder1 getInstanceFRM() {

     File_Reder1 frm = new File_Reder1();
     return frm;
	}
	
	
	
	
	public Configuration_Reder getInstanceCR() throws Throwable {

		Configuration_Reder reder = new Configuration_Reder();
		return reder;
	}
	
}

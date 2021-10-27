package com.adactionsite_helper;


public class File_Reder1 {

	 private File_Reder1() {
		 // to restrict to access another class
	}
	
	public static File_Reder1 getInstanceFRM() {

     File_Reder1 frm = new File_Reder1();
     return frm;
	}
	
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader reder = new Configuration_Reader();
		return reder;
	}
	
	
}

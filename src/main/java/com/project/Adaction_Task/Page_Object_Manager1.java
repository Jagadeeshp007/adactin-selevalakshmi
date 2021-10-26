package com.project.Adaction_Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Pom_Class1.Booking_Page;
import com.Pom_Class1.Confirmation_Page;
import com.Pom_Class1.Home_Page;
import com.Pom_Class1.Hotel_Page;
import com.Pom_Class1.Login_Page;

public class Page_Object_Manager1 {
	
 public static WebDriver driver;
 
 private Home_Page hp;
 
 private Login_Page LP;
 
 private Hotel_Page H;
 
 private Booking_Page BP;
 
 private Confirmation_Page CP;
 
 public Page_Object_Manager1(WebDriver driver2) {
 
	 this.driver=driver2;
	 PageFactory.initElements(driver2, this);
 
 }

public Home_Page getInstenceHP() {
	 hp = new Home_Page(driver);
	 return hp;
}
 
 public Login_Page getInstenceLP() {
 LP=new Login_Page(driver);
 return LP;
 
}
 public Hotel_Page getInstenceH() {
	 H = new Hotel_Page(driver);
	 return H;
}
 public Booking_Page getInstanceBP() {
	 BP = new Booking_Page(driver);
	 return BP;
}
 public Confirmation_Page getInstanceCP() {
    CP = new Confirmation_Page(driver);
    return CP;
}
 
 

}

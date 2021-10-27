package com.adactionsite_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Page {
	
     public  WebDriver driver;
	
	
	 @FindBy(id = "radiobutton_0")
	 private WebElement Rd1;
	 
	 @FindBy(id ="continue" )
	 private WebElement Continue;

	public Hotel_Page(WebDriver driver2) {
     this.driver=driver2;
     PageFactory.initElements(driver, this);
	}

	public WebElement getRd1() {
		return Rd1;
	}

	public WebElement getContinue() {
		return Continue;
	}
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

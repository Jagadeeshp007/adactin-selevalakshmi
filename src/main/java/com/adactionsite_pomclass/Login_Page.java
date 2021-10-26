package com.adactionsite_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login_Page {
	
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(name = "room_type")
	private WebElement Room;
	
	@FindBy(id="room_nos")
	private WebElement Roomnb;
	
	@FindBy(id="datepick_in")
	private WebElement indate;
	
	@FindBy (id="datepick_out")
	private WebElement outdate;
	
	@FindBy(id="adult_room")
	private WebElement Adroom;
	
	@FindBy(id="child_room")
	private WebElement chroom;
	
	@FindBy(id="Submit")
	private WebElement Submit;

	
	public Login_Page(WebDriver driver2) {
    this.driver=driver2;
    PageFactory.initElements(driver2, this);
	}
	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return Room;
	}

	public WebElement getRoomnb() {
		return Roomnb;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdroom() {
		return Adroom;
	}

	public WebElement getChroom() {
		return chroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	

}

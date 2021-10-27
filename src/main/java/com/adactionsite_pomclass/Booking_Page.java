package com.adactionsite_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {

	public WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement firstnm;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement CCV;

	@FindBy(id = "cc_type")
	private WebElement CCtype;

	@FindBy(id = "cc_exp_month")
	private WebElement month;

	@FindBy(id = "cc_exp_year")
	private WebElement year;

	@FindBy(id = "cc_cvv")
	private WebElement CCnum;

	@FindBy(id = "book_now")
	private WebElement book;

	public Booking_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getFirstnm() {
		return firstnm;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCCV() {
		return CCV;
	}

	public WebElement getCCtype() {
		return CCtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCCnum() {
		return CCnum;
	}

	public WebElement getBook() {
		return book;
	}

}

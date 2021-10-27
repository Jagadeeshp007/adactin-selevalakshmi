package com.adactionsite_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation_Page {

	public WebDriver driver;

	@FindBy(id = "my_itinerary")
	private WebElement Mylit;

	@FindBy(id = "logout")
	private WebElement Logout;

	public Confirmation_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMylit() {
		return Mylit;
	}

	public WebElement getLogout() {
		return Logout;
	}

}

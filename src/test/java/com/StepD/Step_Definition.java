package com.StepD;

import org.openqa.selenium.WebDriver;

import com.Runner.Test_Runner;
import com.adactionsite_baseclass.Base_Class1;
import com.project.Adaction_Task.Page_Object_Manager1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class1 {

	public static WebDriver driver = Test_Runner.driver;
	public static Page_Object_Manager1 pom = new Page_Object_Manager1(driver);

	@Given("^user Lunch The Application$")
	public void user_Lunch_The_Application() throws Throwable {
		getUrl("https://adactinhotelapp.com/index.php");
	}

	@When("^user Enter The User Name In Username Field$")
	public void user_Enter_The_User_Name_In_Username_Field() throws Throwable {
		inputvalueElement(pom.getInstenceHP().getUsername(), "Selvalakshmi");
	}

	@When("^user Enetr The Password In Password Field$")
	public void user_Enetr_The_Password_In_Password_Field() throws Throwable {
		inputvalueElement(pom.getInstenceHP().getPassword(), "Selvi@3015");
	}

	@Then("^user Click On The Login Button And It Navigate To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page() throws Throwable {
		clickonElement(pom.getInstenceHP().getLoginbtn());
	}

	@When("^user Select The Hotel Location$")
	public void user_Select_The_Hotel_Location() throws Throwable {
		dropdown(pom.getInstenceLP().getLocation(), "by index", "2");
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		dropdown(pom.getInstenceLP().getHotel(), "by index", "4");

	}

	@When("^user Select The Rome Type$")
	public void user_Select_The_Rome_Type() throws Throwable {
		dropdown(pom.getInstenceLP().getRoom(), "by index", "2");
	}

	@When("^user Select The Number Of Room$")
	public void user_Select_The_Number_Of_Room() throws Throwable {
		dropdown(pom.getInstenceLP().getRoomnb(), "by index", "3");

	}

	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		inputvalueElement(pom.getInstenceLP().getIndate(), "30/10/2021");
	}

	@When("^user Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
		inputvalueElement(pom.getInstenceLP().getOutdate(), "01/11/2021");
	}

	@When("^user Select The Adults Room$")
	public void user_Select_The_Adults_Room() throws Throwable {
		dropdown(pom.getInstenceLP().getAdroom(), "by index", "3");
	}

	@When("^user Select The Children Room$")
	public void user_Select_The_Children_Room() throws Throwable {
		dropdown(pom.getInstenceLP().getChroom(), "by index", "2");
	}

	@Then("^user Click On The Search Button And It Navigate To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {
		clickonElement(pom.getInstenceLP().getSubmit());
		pageWait(30);

	}

	@When("^user Select The Conform Hotel$")
	public void user_Select_The_Conform_Hotel() throws Throwable {
		clickonElement(pom.getInstenceH().getRd1());
	}

	@Then("^user Click On The Continue Button And It Navigate To The Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigate_To_The_Book_A_Hotel_Page() throws Throwable {
		clickonElement(pom.getInstenceH().getContinue());
		pageWait(30);

	}

	@When("^user Enter The Firstname In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
		inputvalueElement(pom.getInstanceBP().getFirstnm(), "Selvalakshmi");
	}

	@When("^user Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
		inputvalueElement(pom.getInstanceBP().getLastname(), "M");
	}

	@When("^user Enter The Billing Address In The Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Address_Field() throws Throwable {
		inputvalueElement(pom.getInstanceBP().getAddress(), "XXXXXx");
	}

	@When("^user Enter The Credit Card No In The Credit Card Field$")
	public void user_Enter_The_Credit_Card_No_In_The_Credit_Card_Field() throws Throwable {
		inputvalueElement(pom.getInstanceBP().getCCnum(), "1234567891234567");
	}

	@When("^user Enter The Credit Card Type In The Credit Card Type Field$")
	public void user_Enter_The_Credit_Card_Type_In_The_Credit_Card_Type_Field() throws Throwable {
		dropdown(pom.getInstanceBP().getCCtype(), "by index", "3");
	}

	@When("^user Enter The Expriy Date In The Expriy Date Field$")
	public void user_Enter_The_Expriy_Date_In_The_Expriy_Date_Field() throws Throwable {
		dropdown(pom.getInstanceBP().getMonth(), "by index", "2");
	}

	@When("^user Enter The Expriy Year In The Expriy Year Field$")
	public void user_Enter_The_Expriy_Year_In_The_Expriy_Year_Field() throws Throwable {
		dropdown(pom.getInstanceBP().getYear(), "by index", "9");
	}

	@When("^user Enter The CCV Num In The CCV Num Field$")
	public void user_Enter_The_CCV_Num_In_The_CCV_Num_Field() throws Throwable {
		inputvalueElement(pom.getInstanceBP().getCCV(), "1234123456789098");
	}

	@Then("^user Click On The Book Now Button And It Navigate To The Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigate_To_The_Booking_Confirmation_Page() throws Throwable {
		clickonElement(pom.getInstanceBP().getBook());
	}

}

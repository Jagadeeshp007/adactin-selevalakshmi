package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactionsite_baseclass.Base_Class1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\com\\adaction\\feature\\Adaction.feature",

		glue = "com.StepD", 
		monochrome = true,

		dryRun = false,

		strict = true
//plugin = {"htm:Report/Cucumber_Report"}
)

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = Base_Class1.get_Driver("chrome");
	}

	@AfterClass
	public static void tear_Down() {
//		driver.close();
	}
}

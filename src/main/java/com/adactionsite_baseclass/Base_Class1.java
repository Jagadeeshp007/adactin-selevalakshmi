package com.adactionsite_baseclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Base_Class1 {
	
	public static WebDriver driver;  //----null

	public static WebDriver get_Driver(String type) {

		if (type.equalsIgnoreCase("chrome")) {	
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir"+"//Driver//geckodriver.exe"));
		driver = (WebDriver) new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	    }
   public static void getUrl(String url) {
       driver.get(url);
       }   
	
	public static void inputvalueElement(WebElement element,String value) {

		element.sendKeys(value);
	}

	public static void clickonElement(WebElement element) {
		element.click();

	}
	
	public static void dropdown(WebElement element, String type , String value) throws Throwable {
        Select S1 = new Select(element);
        int parseInt = Integer.parseInt(value);
        if (type.equalsIgnoreCase("by index")) {
			S1.selectByIndex(parseInt);
		}
        
        else if (type.equalsIgnoreCase("by value")) {
        	S1.selectByValue(value);
		}
        
        
	}
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



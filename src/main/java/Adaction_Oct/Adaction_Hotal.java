package Adaction_Oct;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import com.Adaction_Class.Base_Class1;
import com.Adaction_Class.Page_Object_Manager1;
import com.config.properties1.File_Reder1;


public class Adaction_Hotal extends Base_Class1 {
	
	public static WebDriver driver=Base_Class1.get_Driver("Chrome");
	
    public static Page_Object_Manager1 pom = new Page_Object_Manager1(driver);	
	
	public static void main(String[] args) throws Throwable {
		
		getUrl("http://adactinhotelapp.com/SearchHotel.php");
		
		String username = File_Reder1.getInstanceFRM().getInstanceCR().getusername();
		
		inputvalueElement(pom.getInstenceHP().getUsername(),"Selvalakshmi");
		
		String password = File_Reder1.getInstanceFRM().getInstanceCR().getpassword();
		
		inputvalueElement(pom.getInstenceHP().getPassword(), password);
		
		clickonElement(pom.getInstenceHP().getLoginbtn());
		
		dropdown(pom.getInstenceLP().getLocation(), "by index", "3");
        
		dropdown(pom.getInstenceLP().getHotel(), "by index","2");
		
		dropdown(pom.getInstenceLP().getRoom(), "by index","3");
		
		dropdown(pom.getInstenceLP().getRoomnb(), "by index","2");
		
		inputvalueElement(pom.getInstenceLP().getIndate(),"28/10/2021");
		
		inputvalueElement(pom.getInstenceLP().getOutdate(),"30/10/2021");
		
		dropdown(pom.getInstenceLP().getAdroom(), "by index","1");
		
		dropdown(pom.getInstenceLP().getChroom(), "by index", "2");
		
		clickonElement(pom.getInstenceLP().getSubmit());
		
		clickonElement(pom.getInstenceH().getRd1());
		
		clickonElement(pom.getInstenceH().getContinue());
		
		inputvalueElement(pom.getInstanceBP().getFirstnm(), "Selvalakshmi");
		
		inputvalueElement(pom.getInstanceBP().getLastname(), "M");
		
        inputvalueElement(pom.getInstanceBP().getAddress(), "XXXXXXX");
		
		inputvalueElement(pom.getInstanceBP().getCCV(),"1234567891234567");
		
        dropdown(pom.getInstanceBP().getCCtype(), "by index", "2");
		
		dropdown(pom.getInstanceBP().getMonth(), "by index", "9");
		
		dropdown(pom.getInstanceBP().getYear(), "by index", "9");
		
        inputvalueElement(pom.getInstanceBP().getCCnum(), "1234");
		
		clickonElement(pom.getInstanceBP().getBook());
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		clickonElement(pom.getInstanceCP().getMylit());
		
		clickonElement(pom.getInstanceCP().getLogout());
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	


package marchbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class pgouteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		pageobjects obj=new pageobjects(driver);
		
		driver.get("https://demo.opencart.com/");
		obj.clickonmyaccount();
		obj.clickonlogin();
		obj.clickonenteremail();
		obj.clickonenterpassword();
		obj.clickonloginbutton();

	}

}

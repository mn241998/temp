package marchbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pgouteglab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		pageobjectlab11 obj=new pageobjectlab11(driver);
		
		driver.get("https://demo.opencart.com/");
		obj.clickonmyaccount();
		obj.clickonregister();
		obj.clickonenterfirstname();
		obj.clickonenterlastname();
		obj.clickonenteremail();
		obj.clickonenterpassword();
		obj.clickoncontinuebutton();

	}

}

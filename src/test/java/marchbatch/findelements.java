package marchbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		List<WebElement> l1=driver.findElement(By.xpath("//a[@class= 'list-group-item']"));
		
		System.out.println("list count is:"+l1.size());
		//int i;
		
		for(WebElement i:l1)
		{
			System.out.println("the list is:"+i.getText());
			
		}
	}

}

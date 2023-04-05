package marchbatch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=25");
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=25_28");
		Select sortlist=new Select(driver.findElement(By.id("input-limit")));
		sortlist.selectByIndex(1);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		driver.findElement(By.id("specification-tab")).click();
		
		
		WebElement specTab= driver.findElement(By.id("specification-tab"));
		specTab.click();
	}

}

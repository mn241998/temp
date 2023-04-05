package marchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab3 {
@Test
	public void testcase() {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=20_27");
		
		Select sortlist=new Select(driver.findElement(By.id("input-sort")));
		
		sortlist.selectByIndex(1);
		driver.findElement(By.xpath("//button[@aria-label='Add to Cart']"));
	}
}

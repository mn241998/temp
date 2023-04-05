package jiosaavn.testcases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.jiosaavn.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

//		Testcase1-select language----------------
		driver.findElement(By.className("c-dropdown__header")).click();
		Thread.sleep(3000);
		
		WebElement liElements=driver.findElement(By.className("o-list-select"));
		List<WebElement> ListItems = liElements.findElements(By.tagName("li"));
		for(WebElement e : ListItems) {
		
			if(e.getText().equals("Bengali")) {
				
				liElements.click();
			}
			System.out.println("List Item Text:" + e.getText());
			System.out.println("List Item Html:" + e.getAttribute("innerHTML")+ "\n");
			
		}
		Thread.sleep(300);
				
		WebElement play= driver.findElement(By.className("c-btn"));
		play.click();
		
		
//		Testcase2- radio marathi son list-----------------
//		driver.findElement(By.linkText("Radio")).click();
//		Thread.sleep(300);
//		driver.findElement(By.id("marathi")).click();

//		Testcase3 - Verify page Title-----------------------
		
		driver.get("https://www.jiosaavn.com/");
		System.out.println("Page title is:" +driver.getTitle());
		driver.getTitle();
//		
//////		Testcase4 - Verify login-----------------------
		driver.findElement(By.linkText("Log In")).click();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("mn199824@yahoo.com");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("Jio@789#");
		Thread.sleep(5000);
		WebElement btnlogin= driver.findElement(By.className("c-btn"));
		btnlogin.click();
		Thread.sleep(4000);
		
//		Testcase4 - Verify music-----------------------
		
	}
}
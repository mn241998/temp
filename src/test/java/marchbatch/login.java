package marchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/");
//		driver.findElement(By.linkText("My Account")).click();
//		driver.findElement(By.linkText("Login")).click();
//		driver.findElement(By.id("input-email")).sendKeys("marchbatch@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("welcome");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.linkText("My Account")).click();
//		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.id("input-firstname")).sendKeys("Neha");
//		driver.findElement(By.id("input-lastname")).sendKeys("Deore");
//		driver.findElement(By.id("input-email")).sendKeys("Neha@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("welcome");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		System.out.println("The title of browser is:"+driver.getTitle());
//
		System.out.println("The title of the browser is:" +driver.getTitle());
		System.out.println("url is"+driver.getCurrentUrl());
		driver.navigate().to("https://www.google.com/");
		System.out.println("The title of the browser is:" +driver.getTitle());
		System.out.println("url is"+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("The title of the browser is:" +driver.getTitle());
		System.out.println("url is"+driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println("The title of the browser is:" +driver.getTitle());
		System.out.println("url is"+driver.getCurrentUrl());

		driver.quit();
	}

}

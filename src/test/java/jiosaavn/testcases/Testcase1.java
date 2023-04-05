package jiosaavn.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
//		Testcase1-Login-----------------------------------------
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Leave")).click();
		Thread.sleep(300);

		driver.findElement(By.linkText("Apply")).click();
		Thread.sleep(300);
		WebElement leaveType=driver.findElement(By.id("applyleave_txtLeaveType"));
		leaveType.click();
		leaveType.sendKeys("CAN - Vacation");
//		
		
		
		 
////		Testcase2-cancel leave-------------------------------------
//		driver.findElement(By.linkText("My Leave")).click();
//		Thread.sleep(3000);
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,250)");
//		Thread.sleep(5000);
//		
//		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
//				check.click();
////		WebElement chkLeave=driver.findElement(By.xpath("//input[@type='checkbox']"));
////		chkLeave.click();		
//		WebElement btnCancel=driver.findElement(By.id("btnCancel"));
//		btnCancel.click();
//		
//		WebElement txtReason=driver.findElement(By.id("CancelComment"));
//		txtReason.sendKeys("changed my mind");
//		
//		WebElement btnOk=driver.findElement(By.id("dialogConfirm"));
//		btnOk.click();
//		

//		testcase3-view leave balance
////		Thread.sleep(4000);
//		driver.findElement(By.linkText("Entitlements")).click();
//		driver.findElement(By.linkText("My Entitlements")).click();
//		
//		WebElement lnkMyLeave=driver.findElement(By.id("menu_leave_viewMyLeaveBalanceReport"));
//		lnkMyLeave.click();
//		
//		WebElement lblLeaveBalance=driver.findElement(By.id("dialogConfirm"));
//		btnOk.click();
		
//		testcase4-assign leave------------------------------------------------------------------
		
		driver.findElement(By.linkText("Assign Leave")).click();
		Thread.sleep(500);
//		WebElement empName=driver.findElement(By.className("oxd-autocomplete-wrapper"));
//		empName.sendKeys("rajii Singh chandel");
		Select sortlist=new Select(driver.findElement(By.name("Leave Type")));
		
		sortlist.selectByIndex(3);
		
		
		
		
	}

}

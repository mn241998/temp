package marchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjectlab11 {
WebDriver driver;
By myaccountlink=By.linkText("My Account");
By registerlink=By.linkText("Register");
By firstname=By.id("input-firstname");
By lastname=By.id("input-lastname");
By email=By.id("input-email");
By password=By.id("input-password");
By loginbutton=By.xpath("//button[@type-'submit']");

public pageobjectlab11(WebDriver driver) {
	this.driver=driver;
	
}
public void clickonmyaccount()
{
	driver.findElement(By.linkText("My Account")).click();
}
public void clickonregister()
{
	driver.findElement(By.linkText("Register")).click();
}
public void clickonenterfirstname()
{
	driver.findElement(By.id("input-firstname")).sendKeys("neha");
}
public void clickonenterlastname()
{
	driver.findElement(By.id("input-lastname")).sendKeys("deore");
}

public void clickonenteremail()
{
	driver.findElement(By.id("input-email")).sendKeys("neha@gmail.com");
}
public void clickonenterpassword()
{
	driver.findElement(By.id("input-password")).sendKeys("123456");
}
public void clickoncontinuebutton()
{
	driver.findElement(By.xpath("//button[@type-'submit']")).click();
}
}

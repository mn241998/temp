package marchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pagefactory1 {
WebDriver driver;
By myaccountlink=By.linkText("My Account");
By loginlink=By.linkText("login");
By email=By.id("input-email");
By password=By.id("input-password");
By loginbutton=By.xpath("//button[@type-'submit']");

public pagefactory1(WebDriver driver) {
	this.driver=driver;
	
}
public void clickonmyaccount()
{
	driver.findElement(By.linkText("My Account")).click();
}
public void clickonlogin()
{
	driver.findElement(By.linkText("Login")).click();
}
public void clickonenteremail(String username)
{
	driver.findElement(By.id("input-email")).sendKeys(username);
}
public void clickonenterpassword(String password)
{
	driver.findElement(By.id("input-password")).sendKeys(password);
}

public void clickonloginbutton()
{
	driver.findElement(By.xpath("//button[@type-'submit']")).click();
}
}

package jiosaavn.pageobjects;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
public class pagefactory_jiosaavn{





@FindBy(className="c-dropdown__header")
WebElement musiclanguage;

@FindBy(className="o-list-select")
WebElement dropdown;

@FindBy(className="c-btn")
WebElement okbutton;

public void musiclanguage()
{
	musiclanguage.click();
}
public void selectdropdown()
{
	dropdown.click();
}
public void okbutton()
{
	okbutton.click();
}
public void selectmusiclanguage(WebDriver driver)
{
	List<String> l1=new ArrayList<String>(driver.getWindowHandle());
	System.out.println(l1.size());
	driver.switchTo().window(l1.get(1));
	System.out.println("Windows:" +driver.getCurrentUrl());
	music.click();
}
}
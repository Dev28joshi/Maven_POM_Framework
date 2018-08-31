package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	static WebElement element;
	public static WebElement clickRegisterLink(WebDriver driver)
	{
		return element=driver.findElement(By.xpath(utility.Constant.xpathHomeRegisterLink));
	}
	public static WebElement clickLoginLink(WebDriver driver)
	{
		return element=driver.findElement(By.xpath(utility.Constant.xpathHomeLoginLink));
	}
}

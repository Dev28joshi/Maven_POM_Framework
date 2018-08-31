package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
	static WebElement element;
	public static WebElement txtUserName(WebDriver driver)
	{
		return element=driver.findElement(By.id(utility.Constant.IdLoginEmailTxt));
		
	}
	public static WebElement txtpwd(WebDriver driver)
	{
		return element=driver.findElement(By.id(utility.Constant.IdLoginpwdTxt));
		
	}
	public static WebElement txtpswdBtn(WebDriver driver)
	{
		return element=driver.findElement(By.xpath(utility.Constant.xpathLoginBtn));
		
	}
}

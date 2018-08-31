package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage 
{
	static WebElement element;
	public static WebElement rdo_btn(WebDriver driver)
	{
		return element=driver.findElement(By.id(utility.Constant.id_radio_btn));
		
	}
	public static WebElement txtfname(WebDriver driver)
	{
		return element=driver.findElement(By.id(utility.Constant.idLoginFNameTxt));
		
	}
	public static WebElement txtUserLName(WebDriver driver)
	{
		return element=driver.findElement(By.id(utility.Constant.idLoginLNameTxt));
		
	}
	public static WebElement txtUseremail(WebDriver driver)
	{
		return element=driver.findElement(By.id(utility.Constant.IdLoginEmailTxt));
		
	}
	public static WebElement txtpwd(WebDriver driver)
	{
		return element=driver.findElement(By.id(utility.Constant.IdLoginpwdTxt));
		
	}
	public static WebElement confirmPawd(WebDriver driver)
	{
		return element=driver.findElement(By.id(utility.Constant.idregistercpswdTxt));
	}
	public static WebElement bt_register(WebDriver driver)
	{
		return element=driver.findElement(By.id(utility.Constant.idregisterbtn));
	}
}

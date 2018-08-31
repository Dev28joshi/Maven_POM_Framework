package appModules;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.RegisterPage;

public class FunctionClass 
{
	WebElement WebElement;
	public static void EnterURL(WebDriver driver)
	{
		driver.get(utility.Constant.appurl);
	}
	public static void Login_page(WebDriver driver)
	{
		LoginPage.txtUserName(driver).sendKeys("FirstName");
		LoginPage.txtpwd(driver).sendKeys("pwd12345");
		LoginPage.txtpswdBtn(driver).click();
	}
	public static void Register_page(WebDriver driver)
	{
		RegisterPage.rdo_btn(driver).click();
		RegisterPage.txtfname(driver).sendKeys("User123");
		RegisterPage.txtUserLName(driver).sendKeys("test123");
		RegisterPage.txtUseremail(driver).sendKeys("test.user@gnil.com");
		RegisterPage.txtpwd(driver).sendKeys("pwd2345");
		RegisterPage.confirmPawd(driver).sendKeys("pwd2345");
		RegisterPage.bt_register(driver).click();
	}
	public static void Register_Link(WebDriver driver)
	{
		HomePage.clickRegisterLink(driver).click();
	}
	public static void Login_Link(WebDriver driver)
	{
		HomePage.clickLoginLink(driver).click();
	}
	public static String DateValue() {

		DateFormat df = new SimpleDateFormat("dd-MM-yy");
		Date dateobj = new Date(0);
		String datevale= df.format(dateobj);
		System.out.println(datevale);
		return datevale;
	}
}

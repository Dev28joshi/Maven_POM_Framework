package test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appModules.BrowserClass;
import utility.CallFunctionExcel;

public class ExecuterClassTest
{
	static WebDriver driver;
	@BeforeTest
	public static void getPrerequsite()
	{
		driver=  BrowserClass.getBrowser("Firefox");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@Test
	public static void executermethod()
	{
		utility.GetUserInput.getresultdata(driver);
	}
	@AfterTest
	public static void endActivity()
	{
		driver.quit();
	}
}

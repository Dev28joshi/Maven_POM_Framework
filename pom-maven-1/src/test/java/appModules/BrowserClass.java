package appModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserClass
{
	static WebDriver driver;
	public static WebDriver getBrowser(String browserName)
	{
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Zeus\\Desktop\\Selenium\\Browsser driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Zeus\\Desktop\\Selenium\\Browsser driver\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","");
			driver = new InternetExplorerDriver();
		}
		else
		{
			driver=null;
		}
		return driver;
	}
}

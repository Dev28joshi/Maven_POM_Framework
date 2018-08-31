package utility;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import appModules.FunctionClass;
public class CallFunctionExcel extends GetUserInput
{
	static List<String> cellNumberdata= new LinkedList<>();
	static List<String> cellresult= new ArrayList<>();
	//static WebDriver driver;
	public static ArrayList<String> getFunctionExcel(WebDriver driver)
	{
		try {		
			cellNumberdata=getTestCasesName();
			for(int i=0; i<cellNumberdata.size();i++)
			{
				String name=cellNumberdata.get(i);
				if(name.equalsIgnoreCase("EnterURL"))
				{
					appModules.FunctionClass.EnterURL(driver);
					cellresult.add("True");
				}
				else if(name.equalsIgnoreCase("Login_Link"))
				{
					appModules.FunctionClass.Login_Link(driver);
					cellresult.add("True");
				}
				else if(name.equalsIgnoreCase("Register_Link"))
				{
					appModules.FunctionClass.Register_Link(driver);
					cellresult.add("True");
				}
				else if(name.equalsIgnoreCase("Login_page"))
				{
					appModules.FunctionClass.Login_page(driver);
					cellresult.add("True");
				}
				else if(name.equalsIgnoreCase("registration_page"))
				{
					appModules.FunctionClass.Register_page(driver);
					cellresult.add("True");
				}
				else if(name.equalsIgnoreCase(""))
				{
					System.out.println(":P");
					cellresult.add("Fail");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			cellresult.add("Fail");
		}
		return (ArrayList<String>) cellresult;
	}
}
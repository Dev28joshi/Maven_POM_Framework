package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import appModules.FunctionClass;

public class GetUserInput 
{
	static List<Integer> cellNumber1= new LinkedList<>();
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static List<Integer> cellNumber= new LinkedList<>();
	static List<String> cellValue= new LinkedList<>();
	static String path="C:\\Users\\Zeus\\Desktop\\PomTest.xlsx";
	static InputStream ios;
	static int statusIndex=0;
	//static WebDriver driver;

	///***Feteching the cells number from sheet**///
	public static LinkedList<Integer> getCellNumber()
	{
		try
		{
			ios = new FileInputStream(path);
			wb = new XSSFWorkbook(ios);
			sheet= wb.getSheetAt(0);
			row = sheet.getRow(0);
			for(int i=0;i<row.getPhysicalNumberOfCells();i++)
			{
				cell=row.getCell(i);
				if(cell.toString().equalsIgnoreCase("Status"))
				{
					statusIndex=i;
					break;
				}
			}
			for(int index=1; index<sheet.getPhysicalNumberOfRows();index++)
			{
				cell=sheet.getRow(index).getCell(statusIndex);
				if(cell.toString().equalsIgnoreCase("Yes"))
				{
					cellNumber.add(index);
				}
			}
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (LinkedList<Integer>) cellNumber;

	}
	///***Feteching the Test Cases name from sheet**///
	public static LinkedList<String> getTestCasesName()
	{
		
		cellNumber1=getCellNumber();
		for(int i=0; i<cellNumber1.size();i++)
		{
			cell=sheet.getRow(cellNumber1.get(i)).getCell(1);
			//System.out.println(cell.toString());
			cellValue.add(cell.toString());
		}
		return (LinkedList<String>) cellValue;
	}
	public static void getresultdata(WebDriver driver)
	{
		ArrayList<String> getResult= new ArrayList<>();
		try 
		{
			getResult=CallFunctionExcel.getFunctionExcel(driver);
			
			
			for(int i=0; i<cellNumber1.size();i++)
			{
				cell=sheet.getRow(cellNumber1.get(i)).createCell(4);
				System.out.println(cell.toString());
				cell.setCellValue(getResult.get(i));
			}
			String dateValue= FunctionClass.DateValue();
			OutputStream os  = new FileOutputStream("C:\\Users\\Zeus\\Desktop\\PomTest"+dateValue+".xlsx");
			wb.write(os);
			os.flush();
			os.close();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		GetUserInput gui = new GetUserInput();
		List<String> cellNumber1= new LinkedList<>();
		cellNumber1=gui.getTestCasesName();
		for(String name:cellNumber1 )
		{
			System.out.println(name);
		}
	}
}

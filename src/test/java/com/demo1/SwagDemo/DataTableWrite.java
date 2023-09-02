package com.demo1.SwagDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.annotation.processing.SupportedSourceVersion;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DataTableWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\deedhole\\eclipse-workspace\\SwagDemo\\Excel Data\\empdata1.xls");
		
		FileOutputStream fos= new FileOutputStream(file);
		
		// set a workbook
		Workbook w=new HSSFWorkbook();
		
		// set a sheet
		Sheet sheet=w.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("Capgemini");
		sheet.getRow(0).createCell(2).setCellValue("Employees");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Capgemini");
		sheet.getRow(1).createCell(1).setCellValue("world");
		sheet.getRow(1).createCell(2).setCellValue("welcome");
		
		w.write(fos);
		w.close();
		
		
		
		
//		System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//	
//		//File file = new File("C:\\Users\\deedhole\\eclipse-workspace\\DemoSwagLabs\\ExcelData\\loin.xlsx");
//	FileInputStream fis= new FileInputStream("C:\\Users\\deedhole\\eclipse-workspace\\DemoSwagLabs\\ExcelData\\loin.xlsx");
//		Workbook w = new XSSFWorkbook(fis);
//		Sheet s= w.getSheetAt(0);
//		int rowcount =s.getLastRowNum();
//		int colcount = s.getRow(0).getLastCellNum();
//		System.out.println("rowount :"+rowcount+"colcount :"+colcount);
//		
//		for(int i=0;i<=rowcount;i++)
//		{
//			Row r=s.getRow(i);
//			
//			String user=r.getCell(0).getStringCellValue();
//			String pass=r.getCell(1).getStringCellValue();
//			
//			driver.findElement(By.id("user-name")).click();
//			driver.findElement(By.id("user-name")).sendKeys(user);
//			driver.findElement(By.xpath("//input[@id='password']")).click();
//			 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
//			 driver.findElement(By.xpath("//input[@id='login-button']")).click();
//			 
//			 driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();
//			 Thread.sleep(2000);
//			 driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
//			  System.out.println(i +" . "+user+" || "+pass);
//		}
//		w.close();
//		fis.close();
		
		
		
		

//		 File loc=new File("C:\\Users\\deedhole\\eclipse-workspace\\log\\Excel Data\\data2.xls");
//		
//		//read the input
//		FileInputStream fis=new FileInputStream(loc);
//		
//		//set the workbook
//		Workbook work =new HSSFWorkbook(fis);
//		
//		//sheet  by index
//		Sheet s= work.getSheetAt(0);
//		
//		// GET TOTAL VALUES OF ROWS AND COLS
//		  for(int i=0;i<s.getPhysicalNumberOfRows();i++)
//		     {  Row r=s.getRow(i);
//		    	 for(int j=0;j<r.getPhysicalNumberOfCells();j++)
//		    	 {
//		    		 Cell cell=r.getCell(j);
//						System.out.println(cell); 
//		    	 }
//		    }
//			
//		 work.close();
//		 fis.close();

		
		
		
		
		
//		File loc=new File("C:\\Users\\deedhole\\eclipse-workspace\\log\\Excel Data\\data2.xls");
//		
//		//read the input
//		FileInputStream fis=new FileInputStream(loc);
//		
//		//set the workbook
//		Workbook work =new HSSFWorkbook(fis);
//		
//		//sheet  by index
//		Sheet s= work.getSheetAt(0);
//		
//		   //  GET THE VALUES OF CELLS
//		//String cellValue = s.getRow(0).getCell(0).getStringCellValue();
//		//System.out.println(cellValue);
//		
//		Number cellValue = s.getRow(2).getCell(0).getNumericCellValue();
//		System.out.println(cellValue);
//		
//		// Boolean cellValue = s.getRow(2).getCell(0).getBooleanCellValue();
//		// System.out.println(cellValue);
//		
//		 work.close();
//		 fis.close();

		
		
		
		
//		File loc=new File("C:\\Users\\deedhole\\eclipse-workspace\\log\\Excel Data\\data2.xls");
//		
//		//read the input
//		FileInputStream fis=new FileInputStream(loc);
//		
//		//set the workbook
//		Workbook work =new HSSFWorkbook(fis);
//		
//		//sheet  by index
//		Sheet s= work.getSheetAt(0);
//		
//		  // PRINT THE FIRST AND LAST CELL NUMBERS , NO VALUES
//		int rows1=s.getFirstRowNum();
//		int cols1=s.getRow(1).getFirstCellNum();
//		
//		System.out.println(rows1);
//		System.out.println(cols1);
//		
//		int rows2=s.getLastRowNum();
//		int cols2=s.getRow(0).getLastCellNum();
//		
//		System.out.println(rows2);
//		System.out.println(cols2);
//		
//		 work.close();
//		 fis.close();
		
		
		
		
		
		
//		File loc=new File("C:\\Users\\deedhole\\eclipse-workspace\\log\\Excel Data\\data2.xls");
//		
//		//read the input
//		FileInputStream fis=new FileInputStream(loc);
//		
//		//set the workbook
//		Workbook work =new HSSFWorkbook(fis);
//		
//		//sheet  by index
//		Sheet s= work.getSheetAt(0);
//		
//		//using for loop ( PRINT ALL THE VALUES IN CELLS )
//				int rows=s.getLastRowNum();
//				int cols=s.getRow(1).getLastCellNum();
//		        
//				for(int r=0;r<=rows;r++)
//				{
//					Row ro=s.getRow(r);
//					
//					for(int c=0;c<cols;c++)
//					{
//						Cell ce=ro.getCell(c);
//						System.out.println(ce);
//						
//					}
//				}
//		
//		 work.close();
//		 fis.close();

		
		
		
		
		
		
//File file = new File("C:\\Users\\deedhole\\eclipse-workspace\\SwagDemo\\Excel Data\\data2.xlsx");
//		
//		FileInputStream fis= new FileInputStream(file);
//		
//		// set a workbook
//		Workbook w=new XSSFWorkbook(fis);
//		
//		// set a sheet
//		Sheet sheet=w.getSheetAt(0);
//
//		int row=sheet.getLastRowNum();
//		int col=sheet.getRow(1).getLastCellNum();
//		
//		for(int i=0;i<=row;i++)
//		{
//			Row r=sheet.getRow(i);
//			for(int j=0;j<col;j++)
//			{
//				Cell c=r.getCell(j);
//				
//				switch(c.getCellType())
//				{
//				case STRING: System.out.print(c.getStringCellValue());
//				break;
//				case NUMERIC: System.out.print(c.getNumericCellValue());
//				break;
//				case BOOLEAN: System.out.print(c.getBooleanCellValue());
//				break;
//				default:
//					break;
//				}
//				System.out.print(" | ");
//			}
//			System.out.println();
//		}
//		
//		
//		
//		w.close();
//		fis.close();
		
		

		
		
//		File file = new File("C:\\Users\\deedhole\\eclipse-workspace\\SwagDemo\\Excel Data\\data1.xls");
//		
//		FileOutputStream fos= new FileOutputStream(file);
//		
//		// set a workbook
//		Workbook w=new HSSFWorkbook();
//		
//		// set a sheet
//		Sheet sheet=w.createSheet();
//		sheet.createRow(0);
//		sheet.getRow(0).createCell(0).setCellValue("Hello");
//		sheet.getRow(0).createCell(1).setCellValue("Capgemini");
//		sheet.getRow(0).createCell(2).setCellValue("Employees");
//		
//		sheet.createRow(1);
//		sheet.getRow(1).createCell(0).setCellValue("Capgemini");
//		sheet.getRow(1).createCell(1).setCellValue("world");
//		sheet.getRow(1).createCell(2).setCellValue("welcome");
//		
//		w.write(fos);
//		w.close();

		
		
//		sheet.createRow(0);
//		sheet.getRow(0).createCell(0).setCellValue("Hello");
//		sheet.getRow(0).createCell(1).setCellValue("Capgemini");
//		sheet.getRow(0).createCell(2).setCellValue("Employees");
//		
//		Sheet s=w.createSheet("CapData");
//		s.createRow(0);
//		s.getRow(0).createCell(0).setCellValue("Capgemini");
//		s.getRow(0).createCell(1).setCellValue("world");
//		s.getRow(0).createCell(2).setCellValue("welcome");

	
	
	
	
	
	
	
	
	}

}

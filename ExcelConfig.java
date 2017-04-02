package lib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.IterateCells;
import org.apache.commons.collections4.IterableGet;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ReadExcelData.ReadExcel;

public class ExcelConfig extends ReadExcel{
	
	public static Object[][] TreatmentData;
	public static Object[][] TreatmentDetails;
	public static Object[][] LoginData;
	public static XSSFWorkbook WBook = null;
    public static XSSFSheet WSheet= null;
    public static XSSFRow Row;
    public static XSSFCell cell;
    public static String ExcelPath = "C:\\workspace\\WebsiteAutomation\\ExcelFolder\\Libro1.xlsm";
    public static XSSFSheet SheetName;
 
    public ExcelConfig(String ExcelPath){
		        
    			File file = new File(ExcelPath);
		        
		        try {
		            
		        	FileInputStream fis = new FileInputStream(file);
		           
		        	WBook = new XSSFWorkbook(fis);
		                   
		        
		        } catch (Exception e) {         
		            e.printStackTrace();
		        }
		        return; 
    }
		        public String getData(int Sheetindex, int row, int column)
		   	 {
		   		WSheet=WBook.getSheetAt(Sheetindex);
		   		 
		   		String data= WSheet.getRow(row).getCell(column).getStringCellValue();
		   		 
		   		return data;
		   	 }
		   	 
		   	 
		   	 public int getRowCount(int Sheetindex)
		   	 {
		   		 
		   		int row= WBook.getSheetAt(Sheetindex).getLastRowNum();
		   		 
		   		row=row+1;
		   		
		   		return row;
		   		
		   	 }
	 
		   	 public int getColCount(int Row)
		   	 {
		   		 int colcount = WSheet.getRow(Row).getLastCellNum();
		   				 
		   		 colcount=colcount+1;
		   		 
		   		 return colcount;
		   	 }
		   	 
		   	
			}
		   	 
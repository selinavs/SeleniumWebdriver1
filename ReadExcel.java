package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class ReadExcel {

	 public static XSSFWorkbook WBook = null;
	 public static XSSFSheet WSheet= null;
	 public static Object[][] LoginData;
	 public static Object[][] TreatmentData;
	 public static Object[][] TreatmentDetails;
	 public static XSSFRow Row;
	 public static XSSFCell cell;
	 public static String FilePath = "C:\\workspace\\WebsiteAutomation\\ExcelFolder\\Libro1.xlsm";
	 public static String SheetName1 = "Login";
	 public static String SheetName2 = "Treatment";
	 public static String SheetName3 = "TreatmentDetails";
	 public static int Sheetindex;
   

	    public XSSFSheet DataSheet(String FilePath, int Sheetindex){
	        File file = new File(FilePath);
	        try {
	            FileInputStream fis = new FileInputStream(file);
	            WBook = new XSSFWorkbook(fis);
	            WSheet = WBook.getSheetAt(Sheetindex);         
	        } catch (Exception e) {         
	            e.printStackTrace();
	        }
	        return WSheet;      
	    }       

}
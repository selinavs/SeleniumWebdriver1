package FormFillingScript;

import lib.ExcelConfig;

public class DataSet extends DataProviderSource {

	
	public static Object[][] getLoginDetails() {
		
		ExcelConfig config=new ExcelConfig("C:\\workspace\\WebsiteAutomation\\ExcelFolder\\Libro1.xlsm");
		
	     int row = config.getRowCount(0);
	    
		 
		 Object[][] LoginDetails = new Object[row][7];
		 
		 for (int i=0;row<i;i++)
	{
		LoginDetails[i][0]=config.getData(0, i, 0);
    	
		LoginDetails[i][1]=config.getData(0, i, 1);
    	
		LoginDetails[i][2]=config.getData(0, i, 2);
    	
		LoginDetails[i][3]=config.getData(0, i, 3);
    	
		LoginDetails[i][4]=config.getData(0, i, 4);
    	
		LoginDetails[i][5]=config.getData(0, i, 5);
    	
		LoginDetails[i][6]=config.getData(0, i, 6);
	}
	
	return LoginDetails;
	
	}
	
	public static Object[][] getTreatmentDetails() {
		   
		   ExcelConfig config = new ExcelConfig("C:\\workspace\\WebsiteAutomation\\ExcelFolder\\Libro1.xlsm");
			
		     int row = config.getRowCount(2);
		     
	Object[][]  TreatmentDetails = new Object[row][4];
	
	for (int i=0;row<i;i++)
	{
	     
		TreatmentDetails[i][0]=config.getData(2, i, 0);
		
		TreatmentDetails[i][1]=config.getData(2, i, 1);
		
		TreatmentDetails[i][2]=config.getData(2, i, 2);
		
		TreatmentDetails[i][3]=config.getData(2, i, 3);
				   
	}
	return TreatmentDetails;	
	}
	
	 public static Object[][] getProviderDetails() {
		   
		   ExcelConfig config = new ExcelConfig("C:\\workspace\\WebsiteAutomation\\ExcelFolder\\Libro1.xlsm");
			
		     int row = config.getRowCount(2);
		     
	Object[][]  ProviderDetails = new Object[row][5];
	 
	for(int i=0;row<i;i++)
	
	{
		
		ProviderDetails[i][4]=config.getData(2, i, 4);
		
		ProviderDetails[i][5]=config.getData(2, i, 5);
		
		ProviderDetails[i][6]=config.getData(2, i, 6);
		
		ProviderDetails[i][7]=config.getData(2, i, 7);
		
		ProviderDetails[i][8]=config.getData(2, i, 8);
		   
	}
	return new Object[][]{{ProviderDetails}};	
	}
	
	 public static Object[][] getTreatmentData() {
		   
		   ExcelConfig config = new ExcelConfig("C:\\workspace\\WebsiteAutomation\\ExcelFolder\\Libro1.xlsm");
			
		     int row = config.getRowCount(1);
		     
	Object[][]  TreatmentData = new Object[row][10];
	
	for (int i=0;row<i;i++)
	{
	     
		TreatmentData[i][0]=config.getData(1, i, 0);
		
		TreatmentData[i][1]=config.getData(1, i, 1);
		
		TreatmentData[i][2]=config.getData(1, i, 2);
		
		TreatmentData[i][3]=config.getData(1, i, 3);
		
		TreatmentData[i][4]=config.getData(1, i, 4);
		
		TreatmentData[i][5]=config.getData(1, i, 5);
		
		TreatmentData[i][6]=config.getData(1, i, 6);
		
		TreatmentData[i][7]=config.getData(1, i, 7);
		
		TreatmentData[i][8]=config.getData(1, i, 8);
		
		TreatmentData[i][9]=config.getData(1, i, 9);
					   
	}
	return TreatmentData;	
	}
	
}
	
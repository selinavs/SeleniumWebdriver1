package FormFillingScript;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSource extends FormFilling {

	@DataProvider(name="FormFillingData")
	public static Object[] getFormFillingData(Method method){
		   String testCase = method.getName();
		   if ("LoginData".equals(testCase)) {
			   Object[][] retObjArr=DataSet.getLoginDetails();
				return retObjArr;
	  }  else if ("TreatmentData".equals(testCase)){ 
			Object[][] retObjArr=DataSet.getTreatmentData();
			return retObjArr;
	 }  else if ("TreatmentDetails".equals(testCase)){
		 Object[][] retObjArr=DataSet.getTreatmentDetails();
			return retObjArr;
	 }  else if ("ProviderDetails".equals(testCase)){
		 Object[][] retObjArr=DataSet.getProviderDetails();
			return retObjArr;
	  }else{
		 return new Object[][]{DataSet.getLoginDetails()};
	 }
	}

}



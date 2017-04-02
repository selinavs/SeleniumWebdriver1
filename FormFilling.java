package FormFillingScript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.apache.poi.sl.usermodel.Sheet;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import lib.ExcelConfig;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.ITestContext;

public class FormFilling {

		WebDriver driver;

	    @BeforeTest

	    public void setup(){

	    	System.setProperty("webdriver.chrome.driver",
	    	           "C:\\workspace\\WebsiteAutomation\\chromedriver.exe");
	    	
	    	WebDriver driver = new ChromeDriver();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("www.https://sf.cidmcorp.com/review/ReviewWizard.aspx");
	        
	    }
	        
		@Test(dataProvider="FormFillingData", dataProviderClass=DataProviderSource.class)
		
	    public void LoginData(String claim,  String location, String firstname, String lastname, String Employee_DOB_, String Street_Address1, String Street_Address2) throws InterruptedException
		
		{
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtClaimNumber")).sendKeys(claim);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_StartNavigationTemplateContainerID_StartNextButton']")).click();
			
			Thread.sleep(30);
			
			Select select = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ddlLocation")));   
			
			select.deselectAll();
			
			select.deselectByVisibleText(location);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtClaimNumber")).sendKeys(claim);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_StartNavigationTemplateContainerID_StartNextButton']")).click();
			
			Thread.sleep(30);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_btnCreateNewReview']")).click();
			
			Thread.sleep(5);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_cbEditPatient")).sendKeys("YES");
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_cbEditClaimDemographics")).sendKeys("YES");
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_cbEditAppAtt")).sendKeys("YES");
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_cbEditClaimStakeholders")).sendKeys("YES");
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_cbSecPhyIsPresent")).sendKeys("YES");
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_cbProviderOfGSIsPresent")).sendKeys("YES");
				
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_cbEditAppAtt ")).sendKeys("YES");
					
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_cbSecPhyIsPresent ")).sendKeys("YES");
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_cbProviderOfGSIsPresent ")).sendKeys("YES");
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_StepNavigationTemplateContainerID_StepNextButton']")).click();
			
			Thread.sleep(5);

			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtPatientFirstNameSearch")).sendKeys(firstname);
					
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtPatientLastNameSearch")).sendKeys(lastname);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_btnSearchPatients ")).click();
			
			Thread.sleep(20);
					
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtEditPatientDOB")).sendKeys(Employee_DOB_);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_rblEditPatientGender']")).click();
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtEditPatientAddress1")).sendKeys(Street_Address1);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtEditPatientAddress2")).sendKeys(Street_Address2);
			
			Thread.sleep(10);
			
		}
			
		 @Test(dataProvider="FormFillingData", dataProviderClass=DataProviderSource.class)

		 public void TreatmentData(String Date_of_Injury_, String EAMS_Number_, String Employer_Name_, String Accepted_Body_Part1, String ICD_Code1, String RFA_Date, String Tx_Rqst_Recd_Date_, String CIDTime, String Tracking1, String specialty) throws InterruptedException
		
		{	
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_StepNavigationTemplateContainerID_StepNextButton']")).click();
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtDateOfInjury")).sendKeys(Date_of_Injury_);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtWCABNumber")).sendKeys(EAMS_Number_);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtEmployer")).sendKeys(Employer_Name_);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ClaimAcceptedBodyParts1_ddlAcceptedBodyParts")).sendKeys(Accepted_Body_Part1);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ClaimAcceptedBodyParts1_btnAcceptedBodyPart']")).click();
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ClaimICD9Codes1_txtICD9Code")).sendKeys(ICD_Code1);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ClaimICD9Codes1_btnAddICD9Code']")).click();
			
			Thread.sleep(100);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_StepNavigationTemplateContainerID_StepNextButton']")).click();
			
			Select select = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ddlReviewSpecialty")));   
			
			select.deselectAll();
			
			select.deselectByVisibleText(specialty);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtDateOfRFA")).sendKeys(RFA_Date);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtReviewDateRequestRec")).sendKeys(Tx_Rqst_Recd_Date_);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtReviewTimeRequestRec")).sendKeys("9");
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtTimeReceivedByUR")).sendKeys(CIDTime);
		
			Select select1 = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ddlRequestReceivedFrom")));   
			
			select1.deselectAll();
			
			select1.selectByVisibleText("Claims Adjuster");
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtExternalReviewId")).sendKeys(Tracking1);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_StepNavigationTemplateContainerID_StepNextButton']")).click();
					
		}
		
		 @Test(dataProvider="FormFillingData", dataProviderClass=DataProviderSource.class)

		    public void TreatmentDetails(String treatment1, String ReportDate, String treatmentcode, String price) throws InterruptedException

		{		
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtReviewDescriptionOfService")).sendKeys(treatment1);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtNoOfDaysForTxDateRange")).sendKeys("180");
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_dtRequestedTxStartDate")).sendKeys(ReportDate);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_RadAjaxPanel5']")).click();
				
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtExternalTPId")).sendKeys(treatmentcode);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ReviewWizardCPTCodes1_btnAddCPTCode")).click();
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtEstimatedTxCost")).sendKeys(price);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_StepNavigationTemplateContainerID_StepNextButton']")).click();
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_btnAddTxRequest']")).click();
			
			Thread.sleep(30);
		}
			
			@Test(dataProvider="FormFillingData", dataProviderClass=DataProviderSource.class)

			public void ProviderDetails(String claimsadjuster, String physicianfax, String physicicianaddress1,  String secondaryphone, String secondaryphysicianaddress) throws InterruptedException
			
			{

			Select select = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ddlClaimsExaminer")));   
			
			select.deselectAll();
			
			select.selectByVisibleText(claimsadjuster);
			
			Thread.sleep(30);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtRequestingPhysicianFaxInitial")).sendKeys(physicianfax);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_btnSearchPrimaryPhysicians']")).click();
			
			Select select1 = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ddlRequestingProvider")));   
			
			select1.deselectAll();
			
			select1.selectByVisibleText(physicicianaddress1);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_StepNavigationTemplateContainerID_StepNextButton']")).click();
			
			Thread.sleep(30);
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtSecondaryPhysicianPhoneInitial")).sendKeys(secondaryphone);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_btnSearchSecPhy']")).click();
			
			Select select11 = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ddlSecondaryPhysician")));   
			
			select11.deselectAll();
			
			select11.selectByVisibleText(secondaryphysicianaddress);
			
			Thread.sleep(30);
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_StepNavigationTemplateContainerID_StepNextButton']")).click();
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtProviderOfGSGroupNameInitial")).sendKeys("Healthesystem");
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_btnSearchProvidersGS']")).click();
			
			Select select111 = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ddlProviders")));   
			
			select111.deselectAll();
			
			select111.getFirstSelectedOption();
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_StepNavigationTemplateContainerID_StepNextButton']")).click();
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_btnAddMoreProviderGS']")).click();
			
			driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_txtProviderOfGSGroupNameInitial")).sendKeys("Express");
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_btnSearchProvidersGS']")).click();

			Select select1111 = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_ddlProviders")));   
			
			select1111.deselectAll();
			
			select1111.getFirstSelectedOption();
				
			driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ReviewWizardUC1_wzClaim_StepNavigationTemplateContainerID_StepNextButton']")).click();
		}
		
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
	}



}

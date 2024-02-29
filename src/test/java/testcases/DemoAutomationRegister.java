

package testcases;

import java.util.Map;

import static testutils.TestUtils.businessTestFile;
import static testutils.TestUtils.currentTest;
import static testutils.TestUtils.yakshaAssert;



import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.internal.Console;

import coreUtilities.testutils.ApiHelper;
import coreUtilities.utils.FileOperations;
import pages.DemoRegisterPages;
import pages.StartupPage;
import testBase.AppTestBase;

public class DemoAutomationRegister extends AppTestBase {
	
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	DemoRegisterPages RegisterPageInstance;
	String numberToBeEntered="nayaksurya50@gmail.com";
	String ExpectedErrorMessage="The phone number you're trying to verify was recently used to verify a different account.  Please try a different number.";
	
	
	@Parameters({"browser", "environment"})
	@BeforeClass(alwaysRun = true)
	public void initBrowser(String browser, String environment) throws Exception {
		try{
		configData = new FileOperations().readJson(config_filePath, environment);
		configData.put("url", configData.get("url").replaceAll("[\\\\]", ""));
		configData.put("browser", browser);
		
		boolean isValidUrl = new ApiHelper().isValidUrl(configData.get("url"));
		yakshaAssert(currentTest(), isValidUrl, businessTestFile);
		//Assert.assertTrue(isValidUrl, configData.get("url")+" might be Server down at this moment. Please try after sometime.");
		initialize(configData);
		startupPage = new StartupPage(driver);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
	
	@Test(priority = 1, groups = {"sanity"}, description="Navigate to the URL and Validate the Home Page")
	public void DemoRegisterAutomation() throws Exception {
		try{
		softAssert = new SoftAssert();
		RegisterPageInstance = new DemoRegisterPages(driver);
		
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "HomePage_Title");
		yakshaAssert(currentTest(), RegisterPageInstance.getPageTitle().equals( expectedData.get("pageTitle")), businessTestFile);
		//softAssert.assertEquals(RegisterPageInstance.getPageTitle(), expectedData.get("pageTitle"), "page title is not matching please check manually");
	}catch(Exception ex){
		yakshaAssert(currentTest(), false, businessTestFile);
	}	
	}	
	
	@Test(priority = 2, groups = {"sanity"}, description="Click SwitchTo à Alert Link. and Validate if control is navigated to new page")
	public void clickOnSwitchToAlertAndValidateTitlePage() throws Exception {
		try{
		softAssert = new SoftAssert();
		RegisterPageInstance = new DemoRegisterPages(driver);
		RegisterPageInstance.clickOnswitchToNavigationMenu();
		RegisterPageInstance.clickOnAlerts();
		
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "alerts_Page");
		yakshaAssert(currentTest(), RegisterPageInstance.alertsPageTitle().equals(expectedData.get("alertsTitle")), businessTestFile);
		//softAssert.assertEquals(RegisterPageInstance.alertsPageTitle(), expectedData.get("alertsTitle"), 				"page title is not matching please check manually");
	}catch(Exception ex){
		yakshaAssert(currentTest(), false, businessTestFile);
	}	
	}	
	
	@Test(priority = 3, groups = {"sanity"}, description="Click on button to display the alert box and Validate if alert popup is shown.")
	public void handleAlertsPopupAndValidateTheTextInsideAnAlertsPopup() throws Exception {
		try{
		RegisterPageInstance = new DemoRegisterPages(driver);
		RegisterPageInstance.clickOnButtonToDisplayAnAlertBox();	
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "alerts_message");
		yakshaAssert(currentTest(), RegisterPageInstance.alertsMessageValidation().equals(expectedData.get("alertsMessage")), businessTestFile);
		//softAssert.assertEquals(RegisterPageInstance.alertsMessageValidation(), expectedData.get("alertsMessage"), 				"page title is not matching please check manually");
		
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}	
		
	}	
	
	@Test(priority = 4, groups = {"sanity"}, description="Click on Register menu option to navigate to Register page. and  Fill the form with data provided in excel sheet.")
	public void clickOnRegisterLinkAndFillTheForms() throws Exception {
	try{
		softAssert = new SoftAssert();
		RegisterPageInstance = new DemoRegisterPages(driver);
		
		RegisterPageInstance.clickOnRegisterNavigationMenu();
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "HomePage_Title");
		yakshaAssert(currentTest(), RegisterPageInstance.getPageTitle().equals(expectedData.get("pageTitle")), businessTestFile);
		//softAssert.assertEquals(RegisterPageInstance.getPageTitle(), expectedData.get("pageTitle"), 				"page title is not matching please check manually");
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedRegisterDetails = new FileOperations().readJson(expectedDataFilePath, "userdetails");
		RegisterPageInstance.fillRegisterForm(expectedRegisterDetails);
		
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}	
	}		
	
	@Test(priority = 5, groups = {"sanity"}, description="Click on the country dropdown and Select each country option one by one.")
	public void clickOnCountryDropDownAndSelectEachCountryOptionsOneByOne() throws Exception {
		try{
		softAssert = new SoftAssert();
		RegisterPageInstance = new DemoRegisterPages(driver);
		//RegisterPageInstance.clickOnSelectCountryDropdownAndSelectEachCountryOneByOne();
		yakshaAssert(currentTest(), RegisterPageInstance.clickOnSelectCountryDropdownAndSelectEachCountryOneByOne()!=null, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}	
	}	
	
	@Test(priority = 6, groups = {"sanity"}, description="Click on the country dropdown and Validate if each country option is selectable from the dropdown.")
	public void clickOnCountryDropDownAndValidateEachCountryOptionsIsSelectableOneByOneFromDropdown() throws Exception {
		try{
		softAssert = new SoftAssert();
		RegisterPageInstance = new DemoRegisterPages(driver);
		//RegisterPageInstance.selectEachCountryOneByOneFromCountryDrpdownAndValidate();
		yakshaAssert(currentTest(), RegisterPageInstance.selectEachCountryOneByOneFromCountryDrpdownAndValidate()!=null, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}	
	}	
	
	@Test(priority = 7, groups = {"sanity"}, description=" Check and uncheck each hobby checkbox and Validate that the checkboxes are responding correctly to user interaction, allowing selection and deselection.")
	public void checkAndUncheckEachCheckBoxAndValidateThatCheckBox() throws Exception {
		try{
		softAssert = new SoftAssert();
		RegisterPageInstance = new DemoRegisterPages(driver);
		RegisterPageInstance.checkAndUncheckEachHobbyCheckBox();
		//RegisterPageInstance.validateCheckBoxesRespondingCorrectllyToUserInterAction_AllowingSelectionAndDeselection();
		yakshaAssert(currentTest(), RegisterPageInstance.validateCheckBoxesRespondingCorrectllyToUserInterAction_AllowingSelectionAndDeselection()!=null, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}	
	}	
	
	@Test(priority = 8, groups = {"sanity"}, description="Select each radio button option for gender and Validate that only one radio button option should be selectable at a time.")
	public void selectEachRadioOptionsForGenderValidateThatOnlyOneRadioButtonShouldBeSelect() throws Exception {
		try{
		softAssert = new SoftAssert();
		RegisterPageInstance = new DemoRegisterPages(driver);
		RegisterPageInstance.selectEachRadioButton();
		
		yakshaAssert(currentTest(), RegisterPageInstance.validateEachRadioButtonoptionShouldBeSelectableAttime()!=null, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}	
	}	
	
	@Test(priority = 9, groups = {"sanity"}, description="passwordValidation_for_Different_Scenarios")
	public void passwordValidationForDifferentScenarios() throws Exception {
		try{
		softAssert = new SoftAssert();
		RegisterPageInstance = new DemoRegisterPages(driver);

		// Scenario 1: Matching passwords
		String matchingPassword = "Password123";
		RegisterPageInstance.validatePasswordFieldForScenarioOneBySendingDifferentValues( matchingPassword);
		

		// Scenario 2: Non-matching passwords
		String nonMatchingPassword1 = "Password123";
        String nonMatchingPassword2 = "Password456";
		RegisterPageInstance.validatePasswordFieldForScenarioTwoBySendingDifferentValues( nonMatchingPassword1, nonMatchingPassword2 );		
		
		// Scenario 3: Password pattern validation
		String invalidPassword = "pass"; // Password doesn't meet the minimum length requirement
		RegisterPageInstance.validatePasswordFieldForScenarioThreeBySendingDifferentValues( invalidPassword );
		yakshaAssert(currentTest(), true, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}			
	    
	}	
	
	@Test(priority = 10, groups = {"sanity"}, description="Select different dates from the Date Of Birth fields_Validate that dates are selectable")
	public void DateOfBirthValidation() throws Exception {
		try{
		softAssert = new SoftAssert();
		RegisterPageInstance = new DemoRegisterPages(driver);
		RegisterPageInstance.selectYearMonthDate();	
		
		yakshaAssert(currentTest(), RegisterPageInstance.validateAccurateSelectableYearMonthDate()!=null, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}	
	}	
	
	@Test(priority = 11, groups = {"sanity"}, description="Click on the image upload button and Choose an image file from the file system _ Validate that the selected image should be displayed on the page after upload.")
	public void fileUploadAction() throws Exception {
		try{
		softAssert = new SoftAssert();
		RegisterPageInstance = new DemoRegisterPages(driver);
		RegisterPageInstance.clickOnChooseFilUploadButton();
		
		yakshaAssert(currentTest(), RegisterPageInstance.getUploadImageName()!=null, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}	
	}	
	
	@Test(priority = 12, groups = {"sanity"}, description="Fill the register form, leave any mandetory field (Phone No) and Verify that error messages for incomplete field displayed as appropriate.")
	public void filltheRegisterFormAndValidateErrorMessage() throws Exception {
		try{
		softAssert = new SoftAssert();
		RegisterPageInstance = new DemoRegisterPages(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedRegisterDetails = new FileOperations().readJson(expectedDataFilePath, "userdetails");
		RegisterPageInstance.fillAndValidateTheRegisterForm(expectedRegisterDetails);
		
		yakshaAssert(currentTest(), RegisterPageInstance.validateMandetoryField()!=null, businessTestFile);
		}catch(Exception ex){
			yakshaAssert(currentTest(), false, businessTestFile);
		}	
	}	

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		System.out.println("before closing the browser");
		browserTearDown();
	}
	
	@AfterMethod
	public void retryIfTestFails() throws Exception {
		startupPage.navigateToUrl(configData.get("url"));
	}
}

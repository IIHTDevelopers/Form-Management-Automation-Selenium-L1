package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.dockerjava.api.model.Link;


public class DemoRegisterPages extends StartupPage 
{
	//WebElement Declaration
	By pageTitleText = By.xpath(""); 
	By switchToNavigationMenu = By.xpath("");
	By Alerts = By.xpath("");
	By ButtonToDisplayAnAlertBox = By.xpath("");
	By RegisterNavigationMenu = By.xpath("");
	By firstNameTextbox = By.xpath("");
	By lastNameTextbox = By.xpath("");
	By addressInputAreabox = By.xpath("");
	By emailAddressTextbox = By.xpath("");
	By phoneNumberTextbox = By.xpath("");
	By maleRadioButton = By.xpath("");
	By feMaleRadioButton = By.xpath("");
	By CricketCheckBox = By.xpath("");
	By MoviesCheckBox = By.xpath("");
	By HockeyCheckBox = By.xpath("");
	By languageDropdown = By.xpath("");
	By selectEnglish = By.xpath("");
	By selectHindi = By.xpath("");
	By skillsDropdown = By.xpath("");
	By countryDropdown = By.xpath("");
	By clickOnCountryDropdown = By.xpath("");
	By selectCountryAustralia = By.xpath("");
	By selectCountryBangladesh = By.xpath("");
	By selectCountryDenmark = By.xpath("");
	By selectCountryHongKong = By.xpath("");
	By selectCountryIndia = By.xpath("");
	By selectCountryJapan = By.xpath("");
	By selectCountryNetherlands = By.xpath("");
	By selectCountryNewZealand = By.xpath("");
	By selectCountrySouthAfrica = By.xpath("");
	By selectCountryUnitedStatesOfAmerica = By.xpath("");
	By selectYear = By.xpath("");
	By selectMonth = By.xpath("");
	By selectDate = By.xpath("");
	By password = By.xpath("");
	By confirmPassword = By.xpath("");
	By submitButton = By.xpath("");
	By refreshButton = By.xpath("");
	By chooseFile = By.xpath("");
	By uploadImageFileName = By.xpath("");
	// add locators as per need
	
	// DECLARE ANY OBJECTS/VARIABLE TO SHARE DATA/INFORMATION/STATUS AMONG DIFFERENT METHODS 

	//Getting the page name
	String pageName = this.getClass().getSimpleName();
	

	//constructor Initialization
	public DemoRegisterPages(WebDriver driver) 
	{
		super(driver);

	}	
	
	
	
	//Utilization
	//Navigate to the URL and Validate the Home Page. Return the Home Page Title
	public String getHomePageTitle() throws Exception
	{
		return "";
	}
	
	

	//Hover SwitchTo menu Option
	public DemoRegisterPages hoverOnswitchToNavigationMenu() throws Exception {
		return null;
	}
	
	

	
	// Click on Alerts sub option
	public DemoRegisterPages clickOnAlerts() throws Exception {
		return null;
	}
	
	// Return the Alerts Page Title
	public String alertsPageTitle() throws Exception
	{
		return null;
	}

	// Click on button to display alerts box
	public DemoRegisterPages clickOnButtonToDisplayAnAlertBox() throws Exception {
		return null;
	}
	
	// Return the Alerts message
	public String alertsMessageValidation() throws Exception
	{
		//return page name
		return "";
	}	
	
	//Navigate to Register Page
	public DemoRegisterPages clickOnRegisterNavigationMenu() throws Exception {
		return null;
	}
	
	// Fill the registration form with data populated from expected_data.json
	public DemoRegisterPages fillRegisterForm(Map<String, String> expectedData) throws Exception {
		return null;
	}
	
	//Click on the country dropdown and Select each country option one by one
	public DemoRegisterPages clickOnSelectCountryDropdownAndSelectEachCountryOneByOne() throws Exception {
		return null;
	}
	

	//Check and uncheck each hobby checkbox and Validate that the checkboxes are responding correctly to user interaction, allowing selection and deselection.
	public DemoRegisterPages checkAndUncheckEachHobbyCheckBox() throws Exception {
		return null;
	}
	
	
	//Select each radio button option for gender and Validate that only one radio button option should be selectable at a time
	public DemoRegisterPages selectEachRadioButton() throws Exception {
		return null;
	}
	
	
	//Select different dates from the Date Of Birth fields_Validate that dates are selectable
	public DemoRegisterPages selectYearMonthDate() throws Exception {
		return null;
	}
	
	// Click on the image upload button and Choose an image file from the file system _ Validate that the selected image should be displayed on the page after upload
	public DemoRegisterPages clickOnChooseFilUploadButton() throws Exception {
		return null;
	}
	
	//Get the name of the file uploaded
	public String getUploadImageName() throws Exception {
		//return page name
		return null;
	}
	
	// Submit the register form, Verify that error messages for incomplete field displayed as appropriate. Return that message
	public String submitRegistrationFormAndReturnthatMessage() throws Exception {
		return null;
	}

}


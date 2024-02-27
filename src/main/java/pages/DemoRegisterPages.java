package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class DemoRegisterPages extends StartupPage 
{
	public SoftAssert softAssert;
	//WebElemet Declaration
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
	
	
	

	//Getting the page name
	String pageName = this.getClass().getSimpleName();
	

	//constructor Initialization
	public DemoRegisterPages(WebDriver driver) 
	{
		super(driver);
//		commonEvents.waitTillElementLocated(switchToNavigationMenu, 120)
//		.waitTillElementVisible(switchToNavigationMenu, 30);
		
//		commonEvents.waitTillElementLocated(Alerts, 120)
//		.waitTillElementVisible(Alerts, 30);

	}	
	
	
	
	//Utilization
	
	public String getPageTitle() throws Exception
	{
		return "";
	}
	
	public String alertsPageTitle() throws Exception
	{
		return "";
	}

	
	public DemoRegisterPages clickOnswitchToNavigationMenu() throws Exception {
		return null;
	}
	
	public DemoRegisterPages clickOnRegisterNavigationMenu() throws Exception {
		return null;
	}
	
	public DemoRegisterPages clickOnAlerts() throws Exception {
		return null;
	}
	

	
	public DemoRegisterPages clickOnButtonToDisplayAnAlertBox() throws Exception {
		return null;
	}
	
	public String alertsMessageValidation() throws Exception
	{
		//return page name
		return "";
	}	
	
	
	public DemoRegisterPages fillRegisterForm(Map<String, String> expectedData) throws Exception {
		return null;
	}
	
	public DemoRegisterPages fillAndValidateTheRegisterForm(Map<String, String> expectedData) throws Exception {
		return null;
	}

	public DemoRegisterPages clickOnSelectCountryDropdownAndSelectEachCountryOneByOne() throws Exception {
		return null;
	}
	

	public DemoRegisterPages selectEachCountryOneByOneFromCountryDrpdownAndValidate() throws Exception {
		return null;
	}
	
	public DemoRegisterPages checkAndUncheckEachHobbyCheckBox() throws Exception {
		return null;
	}
	
	public DemoRegisterPages validateCheckBoxesRespondingCorrectllyToUserInterAction_AllowingSelectionAndDeselection() throws Exception {
		return null;
	}
	
	public DemoRegisterPages selectEachRadioButton() throws Exception {
		return null;
	}
	
	public DemoRegisterPages validateEachRadioButtonoptionShouldBeSelectableAttime() throws Exception {
		return null;
	}
	
	public DemoRegisterPages validatePasswordFieldForScenarioOneBySendingDifferentValues(String data) throws Exception {
		return null;
	}
	
	public DemoRegisterPages validatePasswordFieldForScenarioTwoBySendingDifferentValues(String data1, String data2) throws Exception {
		return null;
	}
	
	public DemoRegisterPages validatePasswordFieldForScenarioThreeBySendingDifferentValues(String data) throws Exception {
		return null;
	}
	
	public DemoRegisterPages selectYearMonthDate() throws Exception {
		return null;
	}
	
	public DemoRegisterPages validateAccurateSelectableYearMonthDate() throws Exception {
		return null;
	}
	
	public DemoRegisterPages clickOnChooseFilUploadButton() throws Exception {
		return null;
	}
	
	public String getUploadImageName() throws Exception {
		//return page name
		return "";
	}
	
	public DemoRegisterPages validateMandetoryField() throws Exception {
		return null;
	}

}

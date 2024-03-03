package coreUtilities.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CommonEvents 
{
	public WebDriver driver;

	public CommonEvents(WebDriver driver) 
	{
		this.driver=driver;
	}

/**
	 * This method is useful to retrieve the text from the web element
	 * @param by - {@link By} type
	 * @return String
	 */
	public String getText(By by)
	{
		return "";
	}

	/**
	 * This method is useful to click on the given web element	
	 * @param by - {@link By} type
	 * @return {@link CommonEvents}
	 */
	public CommonEvents click(By by)
	{
		return null;

	}

	/***
	 * This method is useful to enter the value inside the text box.
	 * @param by - {@link By} type
	 * @param textToBeEntered - {@link String} type: Any input which must be a string data type
	 * @return {@link CommonEvents}
	 */
	public CommonEvents sendKeys(By by, String textToBeEntered)
	{
		return null;

	}
	
/***
	 * This method is useful to select the desired option from the drop down by the visible text.
	 * @param by - {@link By} type
	 * @param option - {@link String} type: the option which needs to be selected for the respective drop down
	 * @return {@link CommonEvents}
	 */
	public CommonEvents selectByVisibleText(By by, String option)
	{
		return null;

	}

	/***
	 * This method is useful to select the desired option from the drop down by the visible text.
	 * @param by - {@link By} type
	 * @param value - {@link String} type: the option which needs to be selected for the respective drop down
	 * @return {@link CommonEvents}
	 */
	public CommonEvents selectByValue(By by, String value)
	{
		return null;

	}

	/**
	 * This method is useful to clear the text box before entering any value to the desired text box	
	 * @param by - {@link By} type
	 * @return {@link CommonEvents}
	 */
	public CommonEvents clear(By by)
	{
		return null;

	}

	/**
	 * This method is useful to retrieve the tag name for the respective web element from DOM
	 * @param by - {@link By} type
	 * @return String
	 */
	public String getTagName(By by)
	{
		return "";

	}
	

	/***
	 * This method is useful to navigate to the desired application url
	 * @param url
	 * @return {@link CommonEvents}
	 * @throws Exception 
	 */
	public CommonEvents navigateTo(String url) throws Exception
	{
		return null;
	}

	
	
}

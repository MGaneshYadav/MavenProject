package genericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods implements FrameworkConstants {
	
	public static WebDriver driver;
	public static String URL;
	public static String browserName;
	public static Actions action;
	public static Select select;
	
	
	public void clickAction(WebElement element)
	{
		element.click();
	}
	
	public void enterValue(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	
	
	public void moveToTab(WebElement element) 
	{
		action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public void selectValueUsingIndex(WebElement element,int value)
	{
		select=new Select(element);
		select.selectByIndex(value);
	}
	
	public String getValueProperty(String Key) throws Throwable
	{
		FileInputStream file=new FileInputStream(PROPERTIES_PATH);
		Properties properties=new Properties();
		properties.load(file);
		return properties.getProperty(Key);
		
	}

}

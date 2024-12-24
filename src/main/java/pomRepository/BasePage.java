package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.UtilityMethods;

public class BasePage extends UtilityMethods {
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Register")
	public WebElement RegisterLink;
	
	public void clickRegisterLink()
	{
		clickAction(RegisterLink);
	}
	
	@FindBy(linkText = "Log in")
	public WebElement LoginLink;

	public void clickLoginLink()
	{
		clickAction(LoginLink);
	}
	@FindBy(xpath = "//a[contains(text(),'Computers')]")
	public WebElement computersTab;
	public void clickOnComputerTab()
	{
		clickAction(computersTab);
	}
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	public WebElement shoppingCartLink;
	public void clickOnShoppingCartLink()
	{
		clickAction(shoppingCartLink);
	}

}

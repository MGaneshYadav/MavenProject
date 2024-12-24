package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends BasePage {
	
	public ComputersPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "(//a[contains(text(),'Desktops')])[4]")
	WebElement desktopsTab;
	
	public void clickOnDesktopTab()
	{
		clickAction(desktopsTab);;
	}
	
	@FindBy(xpath = "//a[@class='hover'][normalize-space()='Notebooks']")
	WebElement notebooksTab;
	
	public void clickOnNotebooksTab()
	{
		clickAction(notebooksTab);
	}
	
	@FindBy(xpath = "//a[@class='hover'][normalize-space()='Accessories']")
	WebElement accessoriesTab;
	
	public void clickOnAccessoriesTab()
	{
		clickAction(desktopsTab);
	}
	

}

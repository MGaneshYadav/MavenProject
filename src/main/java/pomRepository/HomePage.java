package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Log out']")
	public WebElement logoutLink;
	
	public void clickLogOutLink()
	{
		clickAction(logoutLink);
	}
	

}

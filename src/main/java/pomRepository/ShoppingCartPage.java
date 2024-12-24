package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(WebDriver driver) 
	{
		super(driver);	
	}
	@FindBy(xpath = "//input[@name='removefromcart']")
	public WebElement removeCheckBox;
	public void clickOnRemoveCheckBox()
	{
		clickAction(removeCheckBox);
	}
	@FindBy(xpath = "//input[@name='updatecart']")
	public WebElement updateBtn;
	public void clickOnUpdateBtn()
	{
		clickAction(updateBtn);
	}
	
	@FindBy(id = "termsofservice")
	public WebElement termsofServiceCheckBox;
	
	public void clickOntermsCheckBox()
	{
		clickAction(termsofServiceCheckBox);
	}
	
	@FindBy(id = "checkout")
	public WebElement checkoutBtn;
	
	public void clickOncheckoutBtn()
	{
		clickAction(checkoutBtn);
	}

}

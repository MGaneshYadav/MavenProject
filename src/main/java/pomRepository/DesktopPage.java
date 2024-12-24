package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends BasePage
{

	public DesktopPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(id = "products-orderby")
	public WebElement sortByDropdown;
	
	public void selectSortDropdown(int value)
	{
		selectValueUsingIndex(sortByDropdown, value);
	}
	
	@FindBy(id = "products-pagesize")
	public WebElement displayDropdown;
	public void selectDisplayDropdown(int value)
	{
		selectValueUsingIndex(displayDropdown, value);
	}
	
	@FindBy(id = "products-viewmode")
	public WebElement viewAsDropdown;
	public void selectViewAsDropdown(int value)
	{
		selectValueUsingIndex(viewAsDropdown, value);
	}
	
	@FindBy(linkText = "Build your own cheap computer")
	public WebElement bookLink;
	public void clickOnBook()
	{
		clickAction(bookLink);
	}
	
	@FindBy(id = "add-to-cart-button-72")
	public WebElement addToCartBtn;
	public void clickOnAddToCart()
	{
		clickAction(addToCartBtn);
	}
	
	

}

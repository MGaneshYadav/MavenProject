package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{

	public CheckOutPage(WebDriver driver) 
	{
		super(driver);
	}
	@FindBy(xpath = "(//input[@title='Continue'])[1]")
	public WebElement billingContinuBtn;
	public void clickOnbillingContinue()
	{
		clickAction(billingContinuBtn);
	}
	@FindBy(id = "PickUpInStore")
	public WebElement pickUpCheckbox;
	public void clickOnpickUpCheckbox()
	{
		clickAction(pickUpCheckbox);
	}
	@FindBy(xpath = "(//input[@title='Continue'])[2]")
	public WebElement shippingContinuBtn;
	public void clickOnshippingContinue()
	{
		clickAction(shippingContinuBtn);
	}
	@FindBy(id = "paymentmethod_0")
	public WebElement CODRadioBtn;
	public void clickOnCODRadioBtn()
	{
		clickAction(CODRadioBtn);
	}
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	public WebElement paymentContinuBtn;
	public void clickOnPaymentContinue()
	{
		clickAction(paymentContinuBtn);
	}
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	public WebElement paymentInfoContinuBtn;
	public void clickOnPaymentInfoContinue()
	{
		clickAction(paymentInfoContinuBtn);
	}
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	public WebElement confirmContinuBtn;
	public void clickOnConfirmContinue()
	{
		clickAction(confirmContinuBtn);
	}

}

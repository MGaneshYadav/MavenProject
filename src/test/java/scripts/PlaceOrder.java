package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.CheckOutPage;
import pomRepository.ShoppingCartPage;

public class PlaceOrder extends BaseTest
{

	@Test
	public void placeOrder() throws Throwable
	{
		ShoppingCartTest shoppingCart=new ShoppingCartTest();
		shoppingCart.addProductToCart();
		
		ShoppingCartPage shoppingPage=new ShoppingCartPage(driver);
		shoppingPage.clickOntermsCheckBox();
		shoppingPage.clickOncheckoutBtn();
		
		CheckOutPage checkout=new CheckOutPage(driver);
		checkout.clickOnbillingContinue();
		checkout.clickOnpickUpCheckbox();
		checkout.clickOnshippingContinue();
		checkout.clickOnCODRadioBtn();
		checkout.clickOnPaymentContinue();
		checkout.clickOnPaymentInfoContinue();
		checkout.clickOnConfirmContinue();
	}
	
}

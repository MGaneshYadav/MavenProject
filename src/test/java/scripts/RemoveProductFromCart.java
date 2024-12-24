package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.ShoppingCartPage;

public class RemoveProductFromCart extends BaseTest
{	
	@Test()
	public void removeProductCartTest() throws Throwable
	{
		ShoppingCartTest shoppingCart=new ShoppingCartTest();
		shoppingCart.addProductToCart();
		ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
		shoppingCartPage.clickOnRemoveCheckBox();
		shoppingCartPage.clickOnUpdateBtn();
	}
}

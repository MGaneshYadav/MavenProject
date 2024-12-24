package scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.BasePage;
import pomRepository.ComputersPage;
import pomRepository.DesktopPage;

public class ShoppingCartTest extends BaseTest {
	
	@Test()
	public void addProductToCart()
	{
		BasePage basePage=new BasePage(driver);
		basePage.clickOnComputerTab();
		
		ComputersPage computer=new ComputersPage(driver);
		computer.clickOnDesktopTab();
		
		DesktopPage desktop=new DesktopPage(driver);
		desktop.selectSortDropdown(3);
		desktop.selectDisplayDropdown(2);
		desktop.selectViewAsDropdown(1);
		desktop.clickOnBook();
		desktop.clickOnAddToCart();
		basePage.clickOnShoppingCartLink();
	
	}
	
}

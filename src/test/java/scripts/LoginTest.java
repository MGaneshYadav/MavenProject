package scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.FrameworkConstants;
import genericLibrary.ReadExcelData;
import genericLibrary.UtilityMethods;
import pomRepository.BasePage;
import pomRepository.HomePage;
import pomRepository.LoginPage;

public class LoginTest implements FrameworkConstants {
	
	@Test(dataProvider = "loginTestData")
	public void loginTest(String email,String password) throws Throwable 
	{
		//System.setProperty(CHROME_KEY, CHROME_PATH);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUTS_WAIT));
		UtilityMethods utility=new UtilityMethods();
		String URL = utility.getValueProperty("URL");
		driver.get(URL);
		
		BasePage basePage=new BasePage(driver);
		basePage.clickLoginLink();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
		loginPage.clickOnRememberMe();
		loginPage.clickOnLoginBtn();
		Reporter.log("Login Test Succesful",true);
		HomePage homePage=new HomePage(driver);
		homePage.clickLogOutLink();
		driver.quit();
	}
	
	@DataProvider(name ="loginTestData")
	public Object[][] loginData() throws Throwable
	{
		return ReadExcelData.multipleRead("Login");
		
	}

}

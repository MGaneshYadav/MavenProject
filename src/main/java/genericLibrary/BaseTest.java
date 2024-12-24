package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomRepository.BasePage;
import pomRepository.HomePage;
import pomRepository.LoginPage;

public class BaseTest extends UtilityMethods{
	
	
	@BeforeClass
	public void browserSetUp() throws Throwable
	{
		browserName=getValueProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			Reporter.log("Enter a Valid browser name",true);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUTS_WAIT));
		URL=getValueProperty("URL");
		driver.get(URL);
		
	}
	
	@BeforeMethod
	public void login() throws Throwable {
		
		BasePage basePage=new BasePage(driver);
		basePage.clickLoginLink();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterEmail(getValueProperty("username"));
		loginPage.enterPassword(getValueProperty("password"));
		loginPage.clickOnRememberMe();
		loginPage.clickOnLoginBtn();
	}
	@AfterMethod
		public void logOut() throws InterruptedException
		{                                                                                       
			HomePage homePage=new HomePage(driver);
			homePage.clickLogOutLink();
		}
	
	

	@AfterClass
	public void browserTearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}

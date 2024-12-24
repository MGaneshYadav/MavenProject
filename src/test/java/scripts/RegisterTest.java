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
import pomRepository.RegisterPage;

/**
 * 
 * @author Ganesh yadav
 *
 */
public class RegisterTest implements FrameworkConstants{
	
	@Test(dataProvider ="testData" )
	public void registerTest(String firstname,String lastname,String email,String password,String confirmpossword) throws Throwable
	{
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--headless");
		
		System.setProperty(CHROME_KEY, CHROME_PATH);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUTS_WAIT));
		UtilityMethods utility=new UtilityMethods();
		String URL = utility.getValueProperty("URL");
		driver.get(URL);
		
		BasePage basePage=new BasePage(driver);
		basePage.clickRegisterLink();
		
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.clickMaleRadioBtn();
		registerPage.enterfname(firstname);
		registerPage.enterlname(lastname);
		registerPage.enterEmail(email);
		registerPage.enterPassword(password);
		registerPage.enterConfirmPassword(password);
		registerPage.clickRegisterBtn();
		Reporter.log("Register Test Succesful",true);
		driver.quit();
	}
	
	@DataProvider(name ="testData")
	public Object[][] registerData() throws Throwable
	{
		return ReadExcelData.multipleRead("Register");
		
	}

}

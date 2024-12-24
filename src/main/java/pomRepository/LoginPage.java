package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="Email")
	public WebElement emailTextfield;
	
	public void enterEmail(String email)
	{
		enterValue(emailTextfield, email);
	}
	
	@FindBy(id="Password")
	public WebElement passwordTextfield;
	
	public void enterPassword(String password)
	{
		enterValue(passwordTextfield, password);
	}
	
	@FindBy(id="RememberMe")
	public WebElement remeberMeCheckbox;
	
	public void clickOnRememberMe()
	{
		clickAction(remeberMeCheckbox);;
	}
	
	@FindBy(xpath ="//a[normalize-space()='Forgot password?']")
	public WebElement forgotPwdLink;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement LoginBtn ;
	
	public void clickOnLoginBtn()
	{
		clickAction(LoginBtn);;
	}
	
}

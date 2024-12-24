package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id = "gender-male")
	public WebElement maleRadioBtn;
	
	public void clickMaleRadioBtn()
	{
		clickAction(maleRadioBtn);
	}
	
	
	@FindBy(id = "gender-female")
	public WebElement femaleRadioBtn;
	
	public void clickFemaleRadioBtn()
	{
		clickAction(femaleRadioBtn);
	}
	
	@FindBy(id = "FirstName")
	public WebElement firstNameTextfield;
	
	public void enterfname(String firstname)
	{
		enterValue(firstNameTextfield, firstname);
	}
	
	@FindBy(id = "LastName")
	public WebElement lastNameTextfield;
	
	public void enterlname(String lastname)
	{
		enterValue(lastNameTextfield, lastname);
	}
	
	@FindBy(id = "Email")
	public WebElement emailTextfield;
	
	public void enterEmail(String email)
	{
		enterValue(emailTextfield, email);
	}
	
	@FindBy(id = "Password")
	public WebElement passwordTextfield;
	
	public void enterPassword(String password)
	{
		enterValue(passwordTextfield, password);
	}
	
	@FindBy(id = "ConfirmPassword")
	public WebElement confirmPasswordTextfield;
	
	public void enterConfirmPassword(String confirmPassword)
	{
		enterValue(confirmPasswordTextfield, confirmPassword);
	}
	
	@FindBy(id = "register-button")
	public WebElement registerBtn;
	
	public void clickRegisterBtn()
	{
		clickAction(registerBtn);
	}

}

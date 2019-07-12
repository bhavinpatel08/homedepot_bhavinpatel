package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@id='email_id'])[2]")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='registrationPassword']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='zipcode']")
	WebElement Zipcode;
	
	@FindBy(xpath="//input[@id='phoneNumber']")
	WebElement PhoneNumber;
	
	@FindBy(xpath="//span[text()='Create Account']")
	WebElement Create_Account;
	
	public WebElement Email()
	{
		return Email;
	}
	
	public WebElement Password()
	{
		return Password;
	}
	
	public WebElement Zipcode()
	{
		return Zipcode;
	}
	
	public WebElement PhoneNumber()
	{
		return PhoneNumber;
	}
	
	public WebElement Create_Account()
	{
		return Create_Account;
	}
}

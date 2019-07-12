package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Landingpage {

    WebDriver driver;
	public Landingpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//div[@class='MyAccount__label SimpleFlyout__link--bold'])[1]")
	WebElement MyAccount;
	
	@FindBy(xpath="//span[text()='Register']")
	WebElement Register;
	
	
	public WebElement MyAccount()
	{
		return MyAccount;
	}
	
	public WebElement Register()
	{
		return Register;
	}
			
}

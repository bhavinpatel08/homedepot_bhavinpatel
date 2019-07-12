package RegisterAccount;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import baseProperties.BaseClass;
import pageActions.Landingpage;
import pageActions.RegistrationPage;

public class Create_account_with_Valid_Credential extends BaseClass{
	
	Landingpage lp;
	RegistrationPage rp;
	
	
	@BeforeClass
	public void SetUpBrowser() throws IOException
	{
		Invo();
	}
	@Parameters({"email","pass","zip","ph"})
	@Test
	public void Validate_CreateAccount(String email,String pass,String zip,String ph) throws InterruptedException
	{
		lp=new Landingpage(driver);
		Thread.sleep(2000);
		lp.MyAccount().click();
		Thread.sleep(2000);
		lp.Register().click();
		Thread.sleep(2000);
		rp=new RegistrationPage(driver);
		rp.Email().sendKeys(email);
		rp.Password().sendKeys(pass);
		rp.Zipcode().sendKeys(zip);
		rp.PhoneNumber().sendKeys(ph);
		rp.Create_Account().click();
	}
	
	

    @AfterClass
	public void tearDown()
	{
		driver.close();
		
	}
}

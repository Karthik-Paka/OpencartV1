package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass
{
	@Test(groups={"Regression","Master"})
	public void verify_account_registration() throws InterruptedException
	{
		logger.info("***Starting TC001_AccountRegistrationTest***");
		
		try
		{
        HomePage hp=new HomePage(driver);
		hp.clickMyaccount();
		logger.info("Clicked on My Account link");
		
		hp.clickRegister();
		logger.info("Clicked on Register link");
		
		AccountRegistrationPage ar=new AccountRegistrationPage(driver);
		
		logger.info("Providing customer details...");
		ar.setFirstName(randomString().toUpperCase());
		ar.setLastName(randomString().toUpperCase());
		ar.setEmail(randomString()+"@gmail.com");  // randomly generated the email using RandomStringUtils.randomAlphabetic(5)
		ar.setTelephone(randomNumber());
		
		String password=randomAlphaNumberic(); // calling method one time to generate password one time. then we call pass that into password and confirm password
		
		ar.setPassword(password);
		ar.setConfirmPassword(password);
		
		ar.setPrivacyPolicy();
		ar.clickContinue();
		
		logger.info("Validating expected message");
		String comfmsg=ar.getConfirmationMsg();
		if(comfmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("TEST FAILED...");
			logger.debug("Debug log..");
			Assert.assertTrue(false);
		}
		
		}
		catch(Exception e)
		{
			
			Assert.fail();
		}
	
		logger.info("***Finished TC001_AccountRegistrationTest***");
	}
	
	
	
	

}

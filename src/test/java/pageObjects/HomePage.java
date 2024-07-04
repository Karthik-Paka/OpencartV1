package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver)  // constructor invoke from BasePage
	{
		super(driver);
		
	}
	
@FindBy(xpath="//span[normalize-space()='My Account']") WebElement linkMyaccount;
@FindBy(xpath="(//a[normalize-space()='Register'])[1]") WebElement linkRegister;
@FindBy(xpath="//a[normalize-space()='Login']") WebElement linkLogin;  //Login link added in step5 

public void clickMyaccount()
{
	linkMyaccount.click();
}

public void clickRegister()
{
	linkRegister.click();
}

public void clickLogin()
{
	linkLogin.click();;
}
	

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='input-email']") WebElement textemailaddress;
	@FindBy(xpath="//input[@id='input-password']") WebElement textpassword;
	@FindBy(xpath="//input[@value='Login']") WebElement loginBtn;
	
	
	public void setEmail(String email)
	{
		textemailaddress.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		textpassword.sendKeys(password);
	}
	
	public void clicklogin()
	{
		loginBtn.click();
	}
	

}

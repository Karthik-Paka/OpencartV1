package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage 
{

	public MyAccountPage(WebDriver driver)
	{
		super(driver);	
	}
	
	//Locators
	@FindBy(xpath="//h2[text()='My Account']") WebElement msgHeading;  // Myaccount page Heading 
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement linkLogput; // Adding in step 6
	
	
	
	
	//Action Class
	public boolean isMyAccountPageExists()
	{
		try
		{
		   return (msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
		   return false;
		}
		
	}
	
	public void clickLogout()
	{
		linkLogput.click();
	}
	
	
	

}

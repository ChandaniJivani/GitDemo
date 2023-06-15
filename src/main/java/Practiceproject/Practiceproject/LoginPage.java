package Practiceproject.Practiceproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="admin_user_email")
	WebElement userEmail;
	
	@FindBy(id="admin_user_password")
	WebElement passwordEle;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement submit;
	
	
	public void loginapplication(String email, String password)
	{
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
	}
	
	public void goTo()
	{
		driver.get("https://motor-admin-production-4dbc.up.railway.app/");
	}
	
		

}

package Practiceproject.Practiceproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderspage {
	
WebDriver driver;
	
	public Orderspage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@href='/data/orders']")
	WebElement orders;
	
	@FindBy(xpath="//button[@data-role='new']")
	WebElement addOrders;
	
	@FindBy(xpath="//form/div[1]/label/following-sibling::div/div")
	WebElement selectDropdown;
	
	@FindBy(xpath="//form/div[1]/label/following-sibling::div/div/div/ul/li[1]")
	WebElement selectvalue;
	
	
	@FindBy(xpath="//form/div[2]/label/following-sibling::div/div/input")
	WebElement addressline;

	@FindBy(xpath="//form/div[4]/label/following-sibling::div/div/input")
	WebElement city;
	
	@FindBy(xpath="//form/div[5]/label/following-sibling::div/div/input")
	WebElement state;
	
	@FindBy(xpath="//form/div[6]/label/following-sibling::div/div/input")
	WebElement zip;
	
	@FindBy(xpath="//form/div[7]/label/following-sibling::div/div/input")
	WebElement status;
	
	@FindBy(css = ".me-2")
	WebElement saveAndadd;
	
	@FindBy(css = ".ivu-drawer-close")
	WebElement closepopup;
	

	
	public void Orders()
	{
		
		orders.click();
	}
	
	public void addOrder()
	{
		
		addOrders.click();
	}
	
	public void selectdropdown()
	{
		selectDropdown.click();
		selectvalue.click();
	
	}
	
	public void addAddress(String Address)
	{
		addressline.sendKeys(Address);
	}
	
	public void addCity(String City)
	{
		city.sendKeys(City);
	}
	
	public void addState(String State)
	{
		state.sendKeys(State);
	}
	
	public void addZip(String Zip)
	{
		zip.sendKeys(Zip);
	}
	
	public void addStatus(String Status)
	{
		status.sendKeys(Status);
	}
	
	public void saveandAddOrder()
	{
		saveAndadd.click();
	}
	
	public void closePopup()
	{
		closepopup.click();
	}
}

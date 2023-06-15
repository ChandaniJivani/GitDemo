package Practiceproject.Practiceproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lineitems {
	
WebDriver driver;
	
	public Lineitems(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img[@src='/assets/icons/database.svg']")
	WebElement Lineitems;
	
	@FindBy(xpath="//button[@data-role='new']")
	WebElement addlineitems;
	
	@FindBy(xpath="//form/div[1]/label/following-sibling::div/div")
	WebElement selectOrderDropdown;
	
	@FindBy(xpath="//form/div[1]/label/following-sibling::div/div/div/ul/li[1]")
	WebElement selectOrdervalue;
	
	@FindBy(xpath="//form/div[2]/label/following-sibling::div/div")
	WebElement selectProductDropdown;
	
	@FindBy(xpath="//form/div[2]/label/following-sibling::div/div/div/ul/li[1]")
	WebElement selectProductvalue;
	
	@FindBy(xpath="//form/div[3]/label/following-sibling::div/div/div[2]/input")
	WebElement unitprice;
	
	@FindBy(xpath="//form/div[4]/label/following-sibling::div/div/div[2]/input")
	WebElement quantity;
	
	@FindBy(css = ".me-2")
	WebElement saveandAddnewLineitem;
	
	@FindBy(css = ".ivu-drawer-close")
	WebElement closelineitempopup;
	
	public void clickonLineItemsmenu() throws InterruptedException
	{
		
		Lineitems.click();
		
	}
	
	public void addLineitems()
	{
		
		addlineitems.click();
	}

	public void selectOrderdropdown()
	{
		selectOrderDropdown.click();
		selectOrdervalue.click();
	}
	
	public void selectProductdropdown()
	{
		selectProductDropdown.click();
		selectProductvalue.click();
	}
	
	public void addUnitprice(String price)
	{
		
		unitprice.sendKeys(price);
	}
	
	public void addQuantity(String Quantity)
	{
		
		quantity.sendKeys(Quantity);
	}
	
	public void saveandaddnewLineitem()
	{
		
		saveandAddnewLineitem.click();
	}
	
	public void closeLineitemPopup()
	{
		closelineitempopup.click();
	}
}

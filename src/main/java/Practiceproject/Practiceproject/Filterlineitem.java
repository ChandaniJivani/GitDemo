package Practiceproject.Practiceproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filterlineitem {
	
WebDriver driver;
	
	public Filterlineitem(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img[@src='/assets/icons/database.svg']")
	WebElement Lineitems;
	
	@FindBy(css = ".ion-ios-funnel")
	WebElement filter;
	
	@FindBy(xpath="//input[@class='ivu-select-input']")
	WebElement clickonselect;
	
	@FindBy(xpath="//div[@data-role='filter-item']/div/div/div[2]/ul/li[3]")
	WebElement clickonquantity;
	
	@FindBy(xpath="//div[@data-role='filter-value']/div[2]/input")
	WebElement sendquantity;
	
	@FindBy(xpath="//div[@class='sticky-footer']/button[3]/span")
	WebElement applyfilter;
	
	public void clickonFilter()
	{
		filter.click();
	
	}
	
	public void clickonSelect()
	{
		clickonselect.click();
	
	}
	
	public void clickonQuantity()
	{
		clickonquantity.click();
	
	}
	
	public void sendQuantity()
	{
		sendquantity.sendKeys("120");
	
	}
	
	public void applyFilter() throws InterruptedException
	{
		applyfilter.click();
		Thread.sleep(5000);
	
	}
	


}

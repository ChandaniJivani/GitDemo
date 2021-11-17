package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By cookie=By.id("wt-cli-accept-all-btn");
	By search=By.id("search-btn");
	By closesearch=By.cssSelector("a[href='#']");
	By contactus=By.linkText("CONTACT US");
	By bookvenue=By.linkText("BOOK VENUE");
	By donate=By.linkText("DONATE");
	By bookbutton=By.cssSelector("a[href='/our-meeting-rooms/']");
	By donatebutton=By.cssSelector("a[href='/donate/']");
	By viewall=By.cssSelector("a[href='/category/latest-news/']");
	By donateamount=By.xpath("//button[@data-attribute='10']");
	By donate1=By.cssSelector(".donation");
	By Contactus=By.id("menu-item-924");
	By Accessibility=By.id("menu-item-87");
	By privacy=By.id("menu-item-89");
	By terms=By.id("menu-item-86");
	
			
	public WebElement getCookie()
	{
		return driver.findElement(cookie);
		
	}
	
	public WebElement getSearch()
	{
		return driver.findElement(search);
	}
	
	public WebElement getClosesearch()
	{
		return driver.findElement(closesearch);
	}

	public WebElement getContactus()
	{
		return driver.findElement(contactus);
		
	}
	public WebElement getBookvenue()
	{
		return driver.findElement(bookvenue);
		
	}
	public WebElement getDonate()
	{
		return driver.findElement(donate);
		
	}
	public WebElement getBookbutton()
	{
		return driver.findElement(bookbutton);
		
	}
	public WebElement getDonatebutton()
	{
		return driver.findElement(donatebutton);
		
	}
	
	public WebElement getViewall()
	{
		return driver.findElement(viewall);
		
	}
	
	public WebElement getDonateamount()
	{
		return driver.findElement(donateamount);
		
	}
	
	public WebElement getDonate1()
	{
		return driver.findElement(donate1);
		
	}
	
	public WebElement getContact()
	{
		return driver.findElement(Contactus);
		
	}
	
	public WebElement getAccesibility()
	{
		return driver.findElement(Accessibility);
		
	}
	
	public WebElement getPrivacypolicy()
	{
		return driver.findElement(privacy);
		
	}
	
	public WebElement getTerms()
	{
		return driver.findElement(terms);
		
	}
	
}

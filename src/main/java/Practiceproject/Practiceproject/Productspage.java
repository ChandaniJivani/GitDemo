package Practiceproject.Practiceproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productspage {
	
WebDriver driver;
	
	public Productspage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@href='/data/products']")
	WebElement products;
	
	@FindBy(xpath="//button[@data-role='new']")
	WebElement addProducts;
	
	@FindBy(xpath="//form/div[1]/label/following-sibling::div/div/input")
	WebElement name;
	
	@FindBy(xpath="//form/div[2]/label/following-sibling::div/div/div/following-sibling::div/input")
	WebElement price;
	
	@FindBy(xpath="//form/div[3]/label/following-sibling::div/div/input")
	WebElement description;
	
	@FindBy(xpath="//form/div[4]/label/following-sibling::div/div/input")
	WebElement category;
	
	@FindBy(xpath="//form/div[5]/label/following-sibling::div/div/input")
	WebElement slug;
	
	@FindBy(xpath="//form/div[6]/label/following-sibling::div/div/div/following-sibling::div/input")
	WebElement releaseyear;
	
	@FindBy(css = ".me-2")
	WebElement saveAndadd;
	
	@FindBy(css = ".ivu-drawer-close")
	WebElement close;
	
	public void products()
	{
		
		products.click();
	}
	
	public void addProducts()
	{
		
		addProducts.click();
	}
	
	public void addName(String Name)
	{
		name.sendKeys(Name);
	}
	
	public void addPrice(String Price)
	{
		price.sendKeys(Price);
	}
	
	public void addDescription(String Description)
	{
		description.sendKeys(Description);
	}
	
	public void addCategory(String Category)
	{
		category.sendKeys(Category);
	}
	
	public void addSlug(String Slug)
	{
		slug.sendKeys(Slug);
	}
	
	public void addReleaseyear(String Year)
	{
		releaseyear.sendKeys(Year);
	}
	
	public void saveandAddproduct()
	{
		saveAndadd.click();
	}
	
	public void closepopup()
	{
		close.click();
	}
		
		

}

package Practiceproject.Practiceproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import Testcomponents.ReadConfig1;
import io.github.bonigarcia.wdm.WebDriverManager;





public class test  {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void createProduct() throws InterruptedException
	{	
		
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		LoginPage loginpage= new LoginPage(driver);
		loginpage.goTo();
		driver.manage().window().maximize();
		loginpage.loginapplication("chandanijivani@gmail.com", "hello123");
		Productspage products=new Productspage(driver);
		products.products();
		products.addProducts();
		Thread.sleep(2000);
		products.addName("Jiya");
		products.addPrice("$70,000");
		products.addDescription("This is my dream home");
		products.addCategory("Middle class");
		products.addSlug("path");
		products.addReleaseyear("2023");
		products.saveandAddproduct();
		products.closepopup();
		
		
		
	}
	
	@Test(priority=2)
	public void createOrder() throws InterruptedException
	{
		Orderspage orders=new Orderspage(driver);
		orders.Orders();
		orders.addOrder();
		orders.selectdropdown();
		orders.addAddress("Hinjewadi");
		orders.addCity("Pune");
		orders.addState("Maharashtra");
		orders.addZip("411057");
		orders.addStatus("pending");
		orders.saveandAddOrder();
		Thread.sleep(2000);
		orders.closePopup();
		Thread.sleep(2000);
		
	}
	
	
	
	
	@Test(priority=3)
	public void addLineitemandcheckValidationOnLineitemCreation() throws InterruptedException
	{
		Lineitems lineitem1=new Lineitems(driver);
		lineitem1.clickonLineItemsmenu();
		lineitem1.addLineitems();
		Thread.sleep(2000);
		lineitem1.selectOrderdropdown();
		lineitem1.selectProductdropdown();
		lineitem1.addUnitprice("200");
		lineitem1.addQuantity("5");
		lineitem1.saveandaddnewLineitem();
		lineitem1.closeLineitemPopup();
		
		lineitem1.clickonLineItemsmenu();
		lineitem1.addLineitems();
		Thread.sleep(2000);
		lineitem1.saveandaddnewLineitem();
		
		WebElement actual1 = driver.findElement(By.xpath("//form/div[1]/label/following-sibling::div/div[2]"));
		String expected1="Order is required";
		
		Assert.assertEquals(expected1, actual1.getText());
		System.out.println("first assertion statement is executed");
		
		WebElement actual2 = driver.findElement(By.xpath("//form/div[2]/label/following-sibling::div/div[2]"));
		String expected2="Product is required";
		
		Assert.assertEquals(expected2, actual2.getText());
		System.out.println("second assertion statement is executed");
		
		WebElement actual3 = driver.findElement(By.xpath("//form/div[3]/label/following-sibling::div/div[2]"));
		String expected3="Unit price is required";
		
		Assert.assertEquals(expected3, actual3.getText());
		System.out.println("third assertion statement is executed");
		
		WebElement actual4 = driver.findElement(By.xpath("//form/div[4]/label/following-sibling::div/div[2]"));
		String expected4="Quantity is required";
		
		Assert.assertEquals(expected4, actual4.getText());
		System.out.println("fourth assertion statement is executed");
		
		lineitem1.closeLineitemPopup();
	}
	

	@Test(priority=4)
	public void filterLineitem() throws InterruptedException
	{
		Lineitems lineitem1=new Lineitems(driver);
		lineitem1.clickonLineItemsmenu();
		Filterlineitem filter=new Filterlineitem(driver);
		filter.clickonFilter();
		filter.clickonSelect();
		filter.clickonQuantity();
		filter.sendQuantity();
		filter.applyFilter();
	}
}

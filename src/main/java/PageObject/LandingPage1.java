package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage1 {
	
public WebDriver driver;
	
	public LandingPage1(WebDriver driver)
	{
		this.driver=driver;
	}
	By cookie=By.id("wt-cli-accept-all-btn");
	By navlink1=By.id("menu-item-299");
	By navlink11=By.id("menu-item-318");
	By navlink111=By.cssSelector("a[href='/wp-content/uploads/2021/08/2020_annual.pdf']");
	By navlink112=By.cssSelector("a[href='/wp-content/uploads/2021/08/2019_MH_final_unsigned.pdf']");
	By navlink12=By.id("menu-item-288");
	By navlink13=By.id("menu-item-477");
	By navlink14=By.id("menu-item-317");
	By navlink15=By.id("menu-item-874");
	
	By navlink2=By.id("menu-item-300");
	By navlink21=By.id("menu-item-1449");
	By navlink22=By.id("menu-item-591");
	By navlink23=By.id("menu-item-1338");
	By navlink24=By.id("menu-item-1460");
	
	By navlink3=By.id("menu-item-875");
	
	By navlink4=By.id("menu-item-302");
	By navlink41=By.id("menu-item-595");
	By navlink42=By.id("menu-item-642");
	By navlink43=By.id("menu-item-1446");
	By navlink44=By.id("menu-item-876");
	
	By navlink5=By.id("menu-item-303");
	By navlink51=By.id("menu-item-420");
	By navlink52=By.id("menu-item-878");
	By navlink53=By.id("menu-item-1518");
	By navlink54=By.id("menu-item-877");
	
	By navlink6=By.id("menu-item-304");
	By navlink61=By.id("menu-item-901");
	By navlink62=By.id("menu-item-879");
	
	
	
	
	public WebElement getCookie()
	{
		return driver.findElement(cookie);
		
	}
	public WebElement getNavlink1()
	{
		return driver.findElement(navlink1);
		
	}
	public WebElement getNavlink11()
	{
		return driver.findElement(navlink11);
		
	}
	
	public WebElement getNavlink111()
	{
		return driver.findElement(navlink111);
		
	}
	
	public WebElement getNavlink112()
	{
		return driver.findElement(navlink112);
		
	}
	public WebElement getNavlink12()
	{
		return driver.findElement(navlink12);
		
	}
	public WebElement getNavlink13()
	{
		return driver.findElement(navlink13);
		
	}
	public WebElement getNavlink14()
	{
		return driver.findElement(navlink14);
		
	}
	public WebElement getNavlink15()
	{
		return driver.findElement(navlink15);
		
	}
	
	public WebElement getNavlink2()
	{
		return driver.findElement(navlink2);
		
	}
	
	public WebElement getNavlink21()
	{
		return driver.findElement(navlink21);
		
	}
	public WebElement getNavlink22()
	{
		return driver.findElement(navlink22);
		
	}
	public WebElement getNavlink23()
	{
		return driver.findElement(navlink23);
		
	}
	
	public WebElement getNavlink24()
	{
		return driver.findElement(navlink24);
		
	}
	
	public WebElement getNavlink3()
	{
		return driver.findElement(navlink3);
		
	}
	
	public WebElement getNavlink4()
	{
		return driver.findElement(navlink4);
		
	}
	
	public WebElement getNavlink41()
	{
		return driver.findElement(navlink41);
		
	}
	public WebElement getNavlink42()
	{
		return driver.findElement(navlink42);
		
	}
	public WebElement getNavlink43()
	{
		return driver.findElement(navlink43);
		
	}
	public WebElement getNavlink44()
	{
		return driver.findElement(navlink44);
		
	}
	
	public WebElement getNavlink5()
	{
		return driver.findElement(navlink5);
		
	}
	
	public WebElement getNavlink51()
	{
		return driver.findElement(navlink51);
		
	}
	
	public WebElement getNavlink52()
	{
		return driver.findElement(navlink52);
		
	}
	public WebElement getNavlink53()
	{
		return driver.findElement(navlink53);
		
	}
	public WebElement getNavlink54()
	{
		return driver.findElement(navlink54);
		
	}
	
	public WebElement getNavlink6()
	{
		return driver.findElement(navlink6);
		
	}
	
	public WebElement getNavlink61()
	{
		return driver.findElement(navlink61);
		
	}
	
	public WebElement getNavlink62()
	{
		return driver.findElement(navlink62);
		
	}


}

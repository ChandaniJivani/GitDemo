package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObject.LandingPage1;
import resources.base;

public class ValidateNavigationlinks extends base {
	
	@Test
	public void basePageNavigation() throws IOException, InterruptedException {
		driver=initializeDriver();
		driver.get("https://merchantshouse.org.uk/");
		LandingPage1 l1=new LandingPage1(driver);
		l1.getCookie().click();
		l1.getNavlink1().click();
		l1.getNavlink11().click();
		//l1.wait();
		//l1.getNavlink111().click();
		//driver.get("https://merchantshouse.org.uk/category/annual-accounts/");
		//l1.getNavlink112().click();
		//driver.get("https://merchantshouse.org.uk/");
		driver.navigate().back();
		l1.getNavlink1().click();
		l1.getNavlink12().click();
		driver.navigate().back();
		l1.getNavlink1().click();
		l1.getNavlink13().click();
		driver.navigate().back();
		l1.getNavlink1().click();
		l1.getNavlink14().click();
		driver.navigate().back();
		l1.getNavlink1().click();
		l1.getNavlink15().click();
		driver.navigate().back();
		
		l1.getNavlink2().click();
		l1.getNavlink21().click();
		driver.navigate().back();
		l1.getNavlink2().click();
		l1.getNavlink22().click();
		driver.navigate().back();
		l1.getNavlink2().click();
		l1.getNavlink23().click();
		driver.navigate().back();
		l1.getNavlink2().click();
		l1.getNavlink24().click();
		driver.navigate().back();
		
		
		l1.getNavlink3().click();
		driver.navigate().back();
		
		l1.getNavlink4().click();
		l1.getNavlink41().click();
		driver.navigate().back();
		l1.getNavlink4().click();
		l1.getNavlink42().click();
		driver.navigate().back();
		l1.getNavlink4().click();
		l1.getNavlink43().click();
		driver.navigate().back();
		l1.getNavlink4().click();
		l1.getNavlink44().click();
		driver.navigate().back();
		
		l1.getNavlink5().click();
		l1.getNavlink51().click();
		driver.navigate().back();
		l1.getNavlink5().click();
		l1.getNavlink52().click();
		driver.navigate().back();
		l1.getNavlink5().click();
		l1.getNavlink53().click();
		l1.getNavlink54().click();
		driver.navigate().back();
		
		
		l1.getNavlink6().click();
		l1.getNavlink61().click();
		driver.navigate().back();
		l1.getNavlink6().click();
		l1.getNavlink62().click();
		driver.navigate().back();
		
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}

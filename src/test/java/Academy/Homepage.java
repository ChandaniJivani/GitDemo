package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import resources.base;

public class Homepage extends base {

	
		
		@Test
		public void basePageNavigation() throws IOException, InterruptedException
		{
			driver= initializeDriver();
			driver.get("https://merchantshouse.org.uk/");
			LandingPage l=new LandingPage(driver);
			l.getCookie().click();
			l.getSearch().click();
			l.getClosesearch().click();
			l.getContactus().click();
			driver.navigate().back();
			l.getBookvenue().click();
			driver.navigate().back();
			l.getDonate().click();
			driver.navigate().back();
			l.getBookbutton().click();
			driver.navigate().back();
			l.getDonatebutton().click();
			driver.navigate().back();
			l.getViewall().click();
			driver.navigate().back();
			//l.getDonateamount().click();
			//driver.wait(1000);
			//l.getDonate1().click();
			l.getContact().click();
			driver.navigate().back();
			l.getAccesibility().click();
			driver.navigate().back();
			l.getPrivacypolicy().click();
			driver.navigate().back();
			l.getTerms().click();
			driver.navigate().back();
			
		}
		
		@AfterTest
		public void teardown()
		{
			driver.close();
		}

	}



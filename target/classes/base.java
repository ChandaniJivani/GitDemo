package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class base {


		public WebDriver driver;
		
		public WebDriver initializeDriver() throws IOException {
			
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\OPTIMUS\\eclipse-workspace\\E2E\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			String browsername=prop.getProperty("browser");
			
			if(browsername.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Automation downloads files\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			
			else if(browsername.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "D:\\Automation downloads files\\geckodriver-v0.29.1-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
			
		}
		
		public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
			FileUtils.copyFile(source,new File(destinationFile));
			return destinationFile;


		}
	}



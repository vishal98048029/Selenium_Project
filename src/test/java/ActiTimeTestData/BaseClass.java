package ActiTimeTestData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pom.ActiTimeLoginPage;

public class BaseClass {
	public WebDriver driver;
	
	public WebDriver initalizedriver() throws IOException {
	
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\ActiUtilities\\Global.properties");
	prop.load(fis);
	
	if(prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
		

	}
	else if(prop.getProperty("browser").equalsIgnoreCase("Firefox")) {
		driver=new FirefoxDriver();
	}
	else if(prop.getProperty("browser").equalsIgnoreCase("IE")) {
		driver=new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	return driver;
	}
	
	@BeforeMethod()
		public ActiTimeLoginPage launchBrowser() throws IOException {
			driver=initalizedriver();
			
			ActiTimeLoginPage actlp=new ActiTimeLoginPage(driver);
			actlp.goTo("http://localhost/login.do");
			return actlp;
		}
	
	@AfterMethod()
	public void closeBrowser()
	{
	driver.close();	
	}
}

package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginPage {
	WebDriver driver;
	
	@FindBy(name="username")
	private WebElement user;
	//pwd button
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement submit;
	
	@FindBy(xpath = "(//span[@class='errormsg'])[1]")
	private WebElement loginerror;
	
	public ActiTimeLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public ActiTimeEnterTimeTrack login(String userN,String pass) {
		user.sendKeys(userN);
		pwd.sendKeys(pass);
		submit.click();
		ActiTimeEnterTimeTrack aett=new ActiTimeEnterTimeTrack(driver);
		return aett;
	}
	public void goTo(String s1) {
		driver.get(s1);
	}
	
	public String getErrorMessage() {
		String acterrorMessage=loginerror.getText();
		return acterrorMessage;
	}
	
	
	
	

}

package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ActiTime.AbstractComponents.AbstractComponent;

public class ActiTimeEnterTimeTrack extends AbstractComponent{
	WebDriver driver;
	@FindBy(xpath="//div[contains(text(),'Time-Track')]")
	private WebElement enterTimTrack;
	
	@FindBy(xpath="(//td[@class='pagetitle'])[1]")
	private WebElement title;
	
	
	@FindBy(xpath = "//a[contains(text(),'Enter Time-Track')]")
	private WebElement timeTracktab;
	
	@FindBy(xpath = "//a[contains(text(),'View Time-Track')]")
	private WebElement viewtimeTracktab;
	
	@FindBy(xpath = "//a[contains(text(),'Lock Time-Track')]")
	private WebElement locktimeTracktab;
	
	By findBy = Byxpath("(//td[@class='pagetitle'])[1]");
	
	
	public ActiTimeEnterTimeTrack(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 
	private By Byxpath(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public void clickonTimeTrack() {
		enterTimTrack.click();		
	}
	
	public String verifytitleEnterTimeTrack() {
		timeTracktab.click();
//		waitForElementToAppear(findBy);
		waitforWElementToAppear(title);
		String actText=title.getText();
		return actText;
	}
	public String verifytitleViewTimeTrack() {
		viewtimeTracktab.click();
//		waitForElementToAppear(findBy);
		waitforWElementToAppear(title);
		String actText=title.getText();
		return actText;
	}

	public String verifyttitlelockTimeTrack() {
		locktimeTracktab.click();
//		waitForElementToAppear(findBy);
		waitforWElementToAppear(title);
		String actText=title.getText();
		return actText;
	
	}
	

}

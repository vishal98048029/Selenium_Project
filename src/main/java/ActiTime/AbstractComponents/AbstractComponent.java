package ActiTime.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	public WebDriver driver;
	public WebDriverWait wait;
	
	//By findBy = By xpath("(//td[@class='pagetitle'])[1]");
//	public AbstractComponent(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}	


	public AbstractComponent(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}


	public void waitForElementToAppear(By test) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));		
		wait.until(ExpectedConditions.visibilityOfElementLocated(test));		
	}
	public void waitforWElementToAppear(WebElement findBy) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(findBy));
	}
	

}

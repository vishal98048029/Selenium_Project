package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ActiTimeUsersList {
	 WebDriver driver;
	
	@FindBy(xpath="//div[contains(text(),'Users')]")
	private WebElement userListlink;
	
	@FindBy(xpath ="//div[contains(text(),'User List')]")
	private WebElement link;
	
	
	public ActiTimeUsersList(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnUserList() throws InterruptedException {
		userListlink.click();
		Thread.sleep(1000);
		
	}
	public void verifylinktitle() {
		String exp=link.getText();
		String act="User List";
		Assert.assertEquals(act, exp);
	}
	
	

}

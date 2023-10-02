package TimeTracking.ActiTimeImplementaion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ActiTimeTestData.BaseClass;
import pom.ActiTimeEnterTimeTrack;
import pom.ActiTimeLoginPage;
import pom.ActiTimeUsersList;

public class Features extends BaseClass{
	public  String act="actiTIME - Enter Time-Track";
  @Test
  public void LogoutFunctionality() {	  
	  ActiTimeLoginPage actlp=new ActiTimeLoginPage(driver);
	  ActiTimeEnterTimeTrack actee=actlp.login("admin", "manager");
	  String t1=driver.getTitle();	 
	  Assert.assertEquals(act, t1);
	  
  }  
  @Test
  public void UserList() throws InterruptedException {
	  ActiTimeLoginPage actlp=new ActiTimeLoginPage(driver);
	  ActiTimeEnterTimeTrack actee=actlp.login("admin", "manager");
	 ActiTimeUsersList aul=new ActiTimeUsersList(driver);
	 aul.clickOnUserList();	  
	  aul.verifylinktitle();
	  
  }
}

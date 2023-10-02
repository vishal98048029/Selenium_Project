package TimeTracking.ActiTimeImplementaion;

import org.testng.Assert;
import org.testng.annotations.Test;

import ActiTimeTestData.BaseClass;
import pom.ActiTimeEnterTimeTrack;
import pom.ActiTimeLoginPage;

public class SmokeTest extends BaseClass{
	
	@Test(groups = {"SmokeTest"})
	public void errorLoginPage() {
		 ActiTimeLoginPage actlp=new ActiTimeLoginPage(driver);
		  actlp.login("admin", "guru");
		  Assert.assertEquals("Username or Password is invalid. Please try again.", actlp.getErrorMessage());		
	}
	
	@Test(groups = {"SmokeTest"})
	public void timeTrackNavigation() {
		ActiTimeLoginPage actlp=new ActiTimeLoginPage(driver);
		ActiTimeEnterTimeTrack actee= actlp.login("admin", "manager");
		Assert.assertEquals("EnterTimeTrack", actee.verifytitleEnterTimeTrack());
		Assert.assertEquals("            View Time-Track\r\n"
				+ "", actee.verifytitleViewTimeTrack()); 
		Assert.assertEquals("Lock Time-Track", actee.verifyttitlelockTimeTrack());
	}

}

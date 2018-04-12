package LoginTestCase;



import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import LoginDemo.Login;
import testbasedemo.Testbase;

public class LogTestCase extends Testbase {

	Login login1;
	public LogTestCase()
	{
		super();
	}
	
	@BeforeSuite
	public void Set()
	{
		initialization();
		login1=new Login();
	}
	@Test
	public void verifyTitle()
	{
	String title=login1.verifiyTitle();
	Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	@Test
	public void verifyLog()
	{
		login1.verifyLogin();
	}
	@AfterSuite
	public void tdown()
	{
		driver.quit();
	}
}

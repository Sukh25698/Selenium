package LoginDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbasedemo.Testbase;

public class Login extends Testbase{
@FindBy(name="email")
WebElement LoginName;

@FindBy(id="pass")
WebElement Password;

@FindBy(id="loginbutton")
WebElement Log;

 public Login() 
	{
	PageFactory.initElements(driver, this);
}
public String verifiyTitle(){
	return driver.getTitle();
}
public void verifyLogin()
{
	LoginName.sendKeys(prop.getProperty("username"));
	Password.sendKeys(prop.getProperty("password"));
	Log.click();
}
}

package testbasedemo;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {

	public static WebDriver driver;
	public static Properties prop; 
	
	public Testbase() 
	{
	try {
		FileInputStream ip= new FileInputStream("C:\\Users\\install\\Desktop\\Java Automation\\com.facebook.pages\\src\\main\\java\\com\\facebook\\configuration\\com\\facebook\\pages\\configuration.properties");
			
		  prop = new Properties();
		  prop.load(ip);
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	}
	public static void initialization()
	{
		String name=prop.getProperty("browser");
		if(name.equalsIgnoreCase("chrome"));
		{
			System.setProperty(prop.getProperty("systemproperty1"),prop.getProperty("systemproperty2"));
			driver=new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
	}
	
	}


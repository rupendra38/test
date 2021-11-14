package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screen {

	WebDriver driver=null;
	// here we are using parameter 
	@Parameters({"data","data1"})
	@Test(priority = -1)
	public void getScreen(String b,String a) 
	{
		if(b.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.youtube.com");

		}
		
		if(a.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");

		}
		
		
		
		
	}
	
	
	@Test(dataProvider = "twoData",dataProviderClass = DataPro.class)
	public void getDP(int a, int b)
	{
	System.out.println(a+b);	
		
	}
	
	
	@Test(dataProvider = "twoData",dataProviderClass = DataPro.class)
	public void multi(int a, int b)
	{
		Assert.assertEquals(false, true);
		System.out.println(a*b);
		
	}
	
	
	@Test(dependsOnMethods = "multi")
	public void dep()
	{
		
	}

	
}

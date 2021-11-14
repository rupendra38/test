package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FB_login;

public class LoginTest   {

	FB_login fb;
	WebDriver driver;
	@BeforeMethod
	public void run()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
driver.get("www.google.co.in");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void doLog()
	{
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("scrollBy(0,450)");
		WebElement ele=  driver.findElement(By.xpath(".//div/a[text()='हिन्दी']"));
	ele.click();
	}
	
	
	@Test
	public void process()
	{
		
		
	}
	
	
}

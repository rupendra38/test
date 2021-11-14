package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FB_login {

	WebDriver driver;
	
	public FB_login(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	
	private By email =By.id("email");
	private By pass= By.id("pass");
	private By login=By.id("u_0_j_96");
	
	
	
	public void setEmail(String e)
	{
		
		driver.findElement(email).sendKeys(e);
	}
    	
	public void setPass(String p)
	{
		driver.findElement(pass).sendKeys(p);
	}
	
	
	public void login()
	{
		
		driver.findElement(login).click();
	}
}

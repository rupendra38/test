package screenShot;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

//driver.get("https://www.google.co.in/");
      List<WebElement> links=    driver.findElements(By.tagName("a"));

     System.out.println(links.size());
     
    
     for (WebElement webElement : links) {
		//System.out.println(webElement.getAttribute("href"));
    	 String urllink =webElement.getAttribute("href");
    	 
    	 //varify(urllink);
    	 
	}
      
      Thread.sleep(3000);
           
//    
      
//     
      
WebElement ele=driver.findElement(By.id("doubleClickBtn"));






	}
	
	
	public static void varify(String link) throws IOException
	{
		URL url=new URL(link);
		
HttpURLConnection httpcon =(HttpURLConnection)url.openConnection();
		

httpcon.setConnectTimeout(2000);

httpcon.connect();

if(httpcon.getResponseCode()==200)
{
	
	System.out.println(" link response is "+httpcon.getResponseMessage());
	
}


if(httpcon.getResponseCode()==404)
{
	
	System.out.println(" link response "+httpcon.getResponseMessage());
}




	}

	
	
	
	
}

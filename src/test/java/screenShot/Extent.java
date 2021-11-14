package screenShot;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent {

	static ExtentReports report;
	static ExtentSparkReporter spark;
	static ExtentTest test;
	
	
	@BeforeSuite
	public void startRep()
	{
		spark = new ExtentSparkReporter("res//result.html");
		report = new ExtentReports();
		report.attachReporter(spark);
		
	}
	
	
	@AfterSuite
	public void finish()
	{
		report.flush();
	}
	
}

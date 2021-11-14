package screenShot;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
int count=0;
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<3)
		{
			
			count++;
			return true;
		}
		
		
		
		// TODO Auto-generated method stub
		return false;
	}

}

package screenShot;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Extent{
@Test (retryAnalyzer = Retry.class)
public void log()
{
	test=report.createTest("log test creted success by ex");
	Assert.assertTrue(false);
	System.out.println(" this is login test method");
	
}
}

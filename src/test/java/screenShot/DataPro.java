package screenShot;

import org.testng.annotations.DataProvider;

public class DataPro {
	@DataProvider(name="twoData")
	public Object[][] data()
	{
		Object req[][]=new Object[2][2];

		
		req[0][0]=100;
		req[0][1]=20;
		req[1][0]=30;
		req[1][1]=40;

return req;		
		
		
	}
}

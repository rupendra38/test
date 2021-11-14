package screenShot;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ManyDp {

	@Test(dataProvider = "myData")
	public void add(int a,int b)
	{
		System.out.println(a+b);
		
	}
	
	
	@Test(dataProvider = "myData")
	public void mul(int a,int b)
	{
		System.out.println(a*b);

	}
	
	
	
	
	@DataProvider(name="myData")
	public Object[][]getData(Method m)
	{
		Object val[][]=null;
		
		
		switch(m.getName())
		{
		
		case "add": 
			        val=new Object[][] {{10,20},{30,40}};
			         break;
			         
		case "mul": 
			        val=new Object[][]	{{45,25},{12,35}}; 
			        break;
		
		}
		
		return val;
	}
	
	
}

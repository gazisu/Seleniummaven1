package Testng.assertion;

import org.testng.Assert;

public class Assertdemo {

	public class Assetdemo {
		
	@Test	
	
		int num1 =5;
		int num2 =6;
		int expectedResult =12;
		int actualResult = Mathutil.add(num1,num2);
		
		Assert.assertEquals(actualResult, expectedResult);
				
		
		
	}
	
}

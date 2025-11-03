package demo.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringTest {
	
	@Test
	public void testCharCount()
	{
		String name="Manisha";
		Assert.assertEquals(name.length(),7 );
		
	}

}

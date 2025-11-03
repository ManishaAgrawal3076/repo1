package demo.testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGDemo1 {
	
	@Test(groups = "A")
	public void test1()
	{
		Assert.assertEquals(false, 3==3);
		System.out.println("Stops execution if fail");
	}
	
	@Test(groups="A")
	public void test2()
	{
		SoftAssert assert1=new SoftAssert();
		assert1.assertEquals(false, 3==3);
		System.out.println("Does not stop execution if fail");
	
		assert1.assertAll();
	}
	
	@Test(priority = 1,groups="B")
	public void loginTest()
	{
		//Assert.assertEquals(false, 3==3);
		System.out.println("Login test.");
	}
	
	@Test(priority = 2 , dependsOnMethods = "loginTest",groups = "B")
	public void searchTest()
	{
		System.out.println("Search test.");
	}
	
	@Test(priority = 3,dependsOnMethods = "loginTest",groups="B")
	public void logoutTest()
	{
		System.out.println("Logout test.");
	}

}

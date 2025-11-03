package demo.testngdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EdgeTest {
	WebDriver driver;
	
	public void beforeSuit()
	{
		
	}
	
	@BeforeClass
	public void setUp()
	{
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\magrawa4\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	      driver = new EdgeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(groups= {"A","B"})
	public void loginTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		boolean status=driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed();
	    Assert.assertEquals(status, true);
	
	}

}
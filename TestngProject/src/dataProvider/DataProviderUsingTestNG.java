package dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsingTestNG 
{
	WebDriver driver;
	@BeforeClass
	
	public void BrowserLaunching()
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium exe Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@DataProvider(name="TestData")
	public static Object[][] credentials()
	{
		return new Object[][]
		{
				{"username-1","password-1"},
				{"username-2","password-2"},
				{"username-3","password-3"}
		};
	}
	
	
	@Test(dataProvider="TestData")
	public void login(String username, String password)
	{
		WebElement user=driver.findElement(By.xpath("//*[@id='email']"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(user));
		user.sendKeys(username);
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='u_0_4']")).click();
	}
	
		@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}

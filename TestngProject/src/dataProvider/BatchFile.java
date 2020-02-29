package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BatchFile
{
	//this code is for batch file
	@Test
	public void launching()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	}
}

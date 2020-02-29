package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BatchFile
{
	@Test
	public void launching()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	}
}

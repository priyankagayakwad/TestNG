package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping_TC
{	
		@Test(groups={"Regression"})
		 
		 public void regression1()
		{
			System.out.println("In regression1");
		}
		
		@Test(groups={"Regression"})
		
		public void regression2()
		{
			System.out.println("in regression2");
		}
		
		@Test(groups={"Smoke"})
		public void SmokeTest()
		{
			System.out.println("In smoke test");
		}
}

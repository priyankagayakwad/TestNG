package TableauOnline;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Tableau_1
{
	WebDriver driver;
	@BeforeClass
	public void Launching() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium exe Files\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://eu-west-1a.online.tableau.com/#/site/asset123/views/WorkOrderManagementReportApr152019v4_0/WorkOrderMagement?:iid=1");
		Thread.sleep(10000);
	}
	
	@Test
	
	public void testing() throws InterruptedException, AWTException, IOException
	{
		driver.findElement(By.id("email")).sendKeys("priyanka.gayakwad@assetanalytix.com");
		driver.findElement(By.id("password")).sendKeys("Survik@123");
		driver.findElement(By.id("login-submit")).click();
		
		Thread.sleep(10000);
		//driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"viz\"]/iframe"));
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[9]")).click();
		//driver.findElement(By.id("toggle-fullscreen-ToolbarButton")).click();
		Thread.sleep(5000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		//Actions a=new Actions(driver);
		
		//WebElement ele1=driver.findElement(B6y.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div[1]/div/div/div/div/div[2]/div/div/span"));
		WebElement ele2=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[123]/div/div"));
		
		/*Thread.sleep(2000);
		a.moveToElement(ele2, 0, 250).build().perform();
		
		
		Thread.sleep(2000);
		*/
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		

		Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver); 
		ImageIO.write(screenshot.getImage(),".png",new File("D:\\Screenshot\\"));
		*/
		

	   /* JavascriptExecutor jsExec = (JavascriptExecutor)driver;

	    //Returns a Long, Representing the Height of the window’s content area.
	    Long windowHeight = (Long) jsExec.executeScript("return window.innerHeight;");

	    //Returns a Long, Representing the Height of the complete WebPage a.k.a. HTML document.
	    Long webpageHeight = (Long) jsExec.executeScript("return document.body.scrollHeight;"); 

	    //Marker to keep track of the current position of the scroll point
	    //Long currentWindowScroll = Long.valueOf(0);
	    //Using java's boxing feature to create a Long object from native long value.

	    Long currentWindowScroll = 0L;

	    do{
	        //System.out.println(windowHeight + ", " + webpageHeight + ", " + currentWindowScroll);

	        jsExec.executeScript("window.scrollTo(0, " + currentWindowScroll + ");");

	        Actions act = new Actions(driver);
	        act.pause(5000).perform();

	        File tempScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	        //Unique File Name For Each Screenshot
	        File destination = new File("D:\\ScreenShot\\" + ".png");

	        Files.copy(tempScreenshot, destination);
	        currentWindowScroll = currentWindowScroll + windowHeight;

	    }while(currentWindowScroll <= webpageHeight);
	}
		//System.out.println("Scroll successfully");
		
		//ele.click();
*/	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int yPosition = ele2.getLocation().getY();
		
		js.executeScript("window.scroll (0, " + yPosition + ") ");       
		Thread.sleep(3000L);         
		  File tempScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	        //Unique File Name For Each Screenshot
	        File destination = new File("D:\\ScreenShot\\" + ".png");
	}
		
	@AfterClass

	public void teardown()
	{
		driver.close();
	}
}

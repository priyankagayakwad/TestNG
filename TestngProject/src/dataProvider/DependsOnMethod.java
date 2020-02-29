package dataProvider;

import org.testng.annotations.Test;

public class DependsOnMethod 
{
	@Test
	public void launching()
	{
		System.out.println("Open browser");
	}
	@Test
	
	public void depending()
	{
		System.out.println("Depends on browser");
	}
	
	@Test(dependsOnMethods={"depending"})
	
	public void lastmethod()
	{
		System.out.println("In last method");
	}
	
}

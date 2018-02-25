package TwentythWeekend;

import org.testng.annotations.Test;

public class TestngTesting {

	@Test(priority=1, groups= {"Smoke", "Regression"})
	public void test1()
	{
		System.out.println("Testing 1");
	}
	
	@Test(priority=2, groups= {"S1", "R1"})
	public void test2()
	{
		System.out.println("Testing 2");
	}
	
}

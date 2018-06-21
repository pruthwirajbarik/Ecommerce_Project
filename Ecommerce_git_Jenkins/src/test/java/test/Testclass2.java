package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testclass2 {
	@Test
	public void build()
	{
		Assert.assertEquals(4, 6);
		System.out.println("First build test");
	}
	@Test
	public void build1()
	{
		
		System.out.println("First build2 test");
	}


}

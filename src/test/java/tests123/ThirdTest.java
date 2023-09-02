package tests123;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTest {
	@Test(retryAnalyzer = tests123.RetryFailed.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}

}

package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
 
	
	@Test (dataProvider= "datasets")
  public void Test(String s1 , String s2) {
	  System.out.println(s1);
	  System.out.println(s2);
	  
  }
	
	@DataProvider (name="datasets")
	public static Object[][] data()
	{
		return new Object[][]
				{
			{"123","SQL"},
			{"456","Testing"},
			{"125","Selenium"}
				};

	}

}





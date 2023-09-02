package com.test;

import org.testng.annotations.Test;

public class NewTest2 {
	@Test (dataProvider= "datasets" , dataProviderClass=DataProviderTest.class)
	  public void Test(String s1 , String s2) {
		  System.out.println(s1);
		  System.out.println(s2);
		  
	  }
}

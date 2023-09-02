package com.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeTest
	public void beforeTest() {
	  System.out.println("before test");
	}

  @Test (priority=-1 , invocationCount =5, threadPoolSize =3)
  public void log() {
	  System.out.println("Log method");
	  System.out.println("thread ID: " +Thread.currentThread().getId());
  }
  
  @Test (priority=0 )
  public void search() {
	  System.out.println("Search method");
  }
  
  @Test (priority=1)
  public void add() {
	  System.out.println("Add method");
  }
  
  @Test (priority=2)
  public void check() {
	  System.out.println("Check method");
  }
  
  @AfterTest
  public void afterTest() {
    System.out.println("After test");
  }

  
  
  
  
  
  
  
  
  
  
  
  
  
}

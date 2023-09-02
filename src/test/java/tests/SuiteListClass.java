package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteListClass {

		@BeforeSuite
		public void bsuite()
		{
		System.out.println("BeforeSuite method started");
		}

		@Test
		public void test()
		{
		System.out.println("Test method started for the first IsuiteListener example class");
		}

		@AfterSuite
		public void asuite()
		{
		System.out.println("AfterSuite method started");
		}

		}


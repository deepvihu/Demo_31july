package tests;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteList implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("onStart function started of ISuiteListener " );
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("onFinish function started of ISuiteListener " );
	}

}

package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+"test case started");}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+"test case is scuccessed");}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+"test case Failed");}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+"test case is skipped");}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String testname= result.getName();
		System.out.println(testname+"test case is failed due to timeout");}

	@Override
	public void onStart(ITestContext context) {
		String testname=context.getName();
		System.out.println(testname+"test starts");}

	@Override
	public void onFinish(ITestContext context) {
		String testname=context.getName();
		System.out.println(testname+"test finished");

	}

}

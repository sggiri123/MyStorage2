package LearnListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener{

	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName()+" Test is failed but passsed with some success %");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(result.getName()+" ailedWithTimeout");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" Skipped");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" Success");
	}
	
	
	
	
	
	
	

}

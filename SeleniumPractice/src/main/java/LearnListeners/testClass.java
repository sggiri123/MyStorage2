package LearnListeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (ListenerClass.class)
public class testClass {

	@Test 
	public void myTest1() {
	
		throw new SkipException("Forcefully skipping this test");

	}
	
	
	@Test 
	public void myTest2() {
	
		System.out.println("Shridhar");

	}
	
	
	
}

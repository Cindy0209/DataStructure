package stack.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Cindy
 * @create 2018-01-16 11:38
 */
public class TestRunnerBaseOnArray {

	public static void main(String[] args){
		Result result= JUnitCore.runClasses(TestJunitBaseOnArray.class);
		for(Failure failure:result.getFailures()){
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}

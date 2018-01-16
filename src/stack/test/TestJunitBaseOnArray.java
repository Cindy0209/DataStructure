package stack.test;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;
import stack.main.Stack_Array;
import stack.main.exception.ExceptionStackEmpty;

/**
 * 栈基于数组实现的单元测试类
 *
 * @author Cindy
 * @create 2018-01-16 11:10
 */
public class TestJunitBaseOnArray extends TestCase {

	Stack_Array array=new Stack_Array(4);



	@Test
	public void testPop(){
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
		assertEquals(4,array.pop());

	}
	@Test
	public void testPush(){
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);


	}
	@Test
	public void testisEmpty(){
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
		assertEquals(false,array.isEmpty());
	}

	@Test
	public void testGetSize(){
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
		assertEquals(4,array.getSize());
	}

	@Test
	public void testTop(){
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
		assertEquals(4,array.top());
	}

	@Test
	public void testEmptyTop(){

		assertEquals(new ExceptionStackEmpty("意外：栈空"),array.top());
	}

	@Test
	public void testEmptyPop(){

		assertEquals(new ExceptionStackEmpty("意外：栈空"),array.pop());
	}

	@Test
	public void testFullPush(){
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
		array.push(5);

	}

	@Test
	public void testPushPop(){
		array.push(1);
		array.push(2);
		array.pop();
		assertEquals(1,array.top());
		assertEquals(false,array.isEmpty());
		assertEquals(1,array.getSize());
	}

}

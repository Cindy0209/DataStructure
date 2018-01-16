package stack;

import stack.exception.ExceptionStackEmpty;

/**
 * 栈接口（出栈，入栈，栈空，栈大小，栈顶）
 *
 * @author Cindy
 * @create 2018-01-16 10:17
 */
public interface Stack {

	//出栈
	public Object pop() throws ExceptionStackEmpty;

	//入栈
	public void push(Object obj);

	//判断栈空
	public boolean isEmpty();

	//栈大小
	public int getSize();

	//栈顶
	public Object top() throws ExceptionStackEmpty;


}

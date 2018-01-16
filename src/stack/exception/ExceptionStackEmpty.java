package stack.exception;

/**
 * 试图对空栈进行取栈顶或者出栈的异常方法
 *
 * @author Cindy
 * @create 2018-01-16 10:20
 */
public class ExceptionStackEmpty extends RuntimeException{
	public ExceptionStackEmpty(String err){
		super(err);
	}
}

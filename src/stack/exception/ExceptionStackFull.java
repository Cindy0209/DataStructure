package stack.exception;

/**
 * 基于数组存储实现的栈满入栈异常类
 *
 * @author Cindy
 * @create 2018-01-16 10:37
 */
public class ExceptionStackFull extends RuntimeException {
	public ExceptionStackFull(String err){
		super(err);
	}
}

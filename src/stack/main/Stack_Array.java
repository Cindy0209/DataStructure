package stack.main;

import stack.main.exception.ExceptionStackEmpty;
import stack.main.exception.ExceptionStackFull;

/**
 * 基于数组存储的栈实现类
 *
 * @author Cindy
 * @create 2018-01-16 10:38
 */
public class Stack_Array implements Stack {

	public static final int CAPACITY=1024; //数组的默认容量
	protected int realCapacity; //数组的实际容量
	protected int top=-1; //栈顶元素默认位置
	protected Object[] S; //对象数组

	//根据默认容量来创建数组
   public Stack_Array(){
   		S=new Object[CAPACITY];
   }

	//根据实际容量来创建数组
	public Stack_Array(int cap){
		realCapacity=cap;
		S=new Object[realCapacity];
	}

	@Override
	public Object pop() throws ExceptionStackEmpty {

		Object elem;
		if (isEmpty()){
			throw new ExceptionStackEmpty("意外：栈空");
		}else{
			elem=S[top];
			top--;
		}

		return elem;
	}

	@Override
	public void push(Object obj)throws ExceptionStackFull {

		if(getSize()==realCapacity){
			throw new ExceptionStackFull("意外：栈满");
		}else{
			S[top+1]=obj;
			top++;
		}

	}

	@Override
	public boolean isEmpty() {

		return (top<0);
	}

	@Override
	public int getSize() {

		return (top+1);
	}

	@Override
	public Object top() throws ExceptionStackEmpty {
		Object elem;
		if(isEmpty()){
			throw new ExceptionStackEmpty("意外：栈空");
		}else{
			elem=S[top];
		}

		return elem;
	}
}

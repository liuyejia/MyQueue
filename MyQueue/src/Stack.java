import java.util.*;

class Stack<T> {

	private ArrayList<T> stack=new ArrayList<T>();
	private int top=0;
	public int size()
	{
		return top;
	}
	public void push(T val)
	{
		stack.add(top++,val);
	}
	public T pop()
	{
	 return	stack.remove(--top);
	}
	
}

import java.util.*;
import java.util.Stack;
public class myQueue<T> {

	Stack<T> s1,s2;
	public myQueue()
	{
		s1=new Stack<T>();
		s2=new Stack<T>();
	}
	public int size()
	{
		return s1.size()+s2.size();
	}
	public void add(T item)
	{
		s1.push(item);
	}
	public T peek()
	{
		if(!s2.isEmpty()) return s2.peek();
		if(!s1.isEmpty()) s2.push(s1.pop());
		return s2.peek();
	}
	public T pop()
	{
		if(!s2.isEmpty()) s2.pop();
		if(!s1.isEmpty()) s2.push(s1.pop());
		return s2.pop();
	}
	
}

import java.util.*;
import java.util.Stack;
public class Sort<Integer>{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> r=new Stack<Integer>();
		while(!s.isEmpty())
		{
			Integer tmp=(Integer) s.pop();
			while(!r.isEmpty()&&(int)r.peek()>(int)tmp)
				s.push(r.pop());
			r.push(tmp);
		}
		return r;
	}
}

import java.util.*;
class stackWithMin extends Stack<Integer>
{
	java.util.Stack<Integer> s2;
	stackWithMin()
	{
		s2=new java.util.Stack<Integer>();	
	}	
	public void push(int value)
	{
		if(value <= min())
		{
			s2.push(value);
		}
		super.push(value);
	}
	public int pop()
	{
		int value=super.pop();
		if(value==min())
		{
			s2.pop();
		}
		return value;
	}
	public int min()
	{
		if(s2.empty())
			return Integer.MAX_VALUE;
		else return s2.peek();
	}
}
class q2
{
	public static void main(String[] args)
	{
		stackWithMin x=new stackWithMin();
		x.push(10);	
		x.push(20);
		x.push(30);
		x.push(40);
		System.out.println(x.pop());
	}
}
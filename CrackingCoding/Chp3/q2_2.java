class Stack
{
	int top=-1;
	int a[];
	Stack()
	{}
	Stack(int n)
	{
		a=new int[n];
	}
	public void push(int e)throws Exception
	{
		if(top==a.length-1)
			throw new Exception("Stack is full ");
		else
			a[++top]=e;
	}
	public int pop()throws Exception
	{
		if(top==-1)
			throw new Exception("Stack is empty ");
		else
			return a[top--];	
	}
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public int peek()throws Exception
	{
		if(top==-1)
			throw new Exception("Stack is empty ");
		else
			return a[top];	
	}
}

public class StackWithMin extends Stack 
{ 
	public void push(int value)
	{
		int newMin = Math.min(value, min()); 
		super.push(new NodeWithMin(value, newMin));
	}
	public int min()
	{
		if (this.isEmpty())
		{
			return Integer.MAX_VALUE;
		} 
		else
		{
		return peek().min;
		}
	} 	
}
class NodeWithMin
{
	public int value;
	public int min;
	public NodeWithMin(int v, int min)
	{
		value = v;
		this.min = min;
	}
}
class q2_2
{
	public static void main(String[] args)
	{
		StackWithMin x=new StackWithMin();	
		x.push(10);
		x.push(20);
		System.out.println(x.pop());
	}
}
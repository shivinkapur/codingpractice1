class Stack
{
	int top=-1;
	int a[];
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
	public boolean empty()
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

class StackDemo
{
	public static void main(String []args)
	{
		Stack x=new Stack(30);
		try
		{
			x.push(20);
			x.push(34);
			x.push(45);
			x.push(10);
			x.push(54);
			while(!x.empty())
				System.out.println(x.pop());
		}
		catch(Exception e){}	
	}
}
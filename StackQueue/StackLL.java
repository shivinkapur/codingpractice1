class Node
{
	private Node next;
	private Object data;
	public Object getData()
	{
		return data;
	}
	public Node getNext()
	{
		return next;
	}
	public void setData(Object d)
	{
		data=d;
	}
	public void setNext(Node n)
	{
		next=n;
	}
}
class StackLL
{
	Node first=null;
	void push(Object e)
	{
		Node t=new Node();
		t.setData(e);
		Node p=first;
	    first=t;
	    t.setNext(p);
	}
	Object pop()throws Exception
	{
		if(first==null)
			throw new Exception("Stack is empty ");
		else
		{
			Node p=first;
			first=p.getNext();
			return p.getData();
		}	
	}
	boolean empty()
	{
		return (first==null);
	}
}

class DemoStackLL
{
	public static void main (String []args)
	{
		StackLL x=new StackLL();
		try
		{
			x.push(10);
			x.push(30);
			x.push(25);
			x.push(50);
			x.push(15);
			while(!x.empty())
				System.out.println(x.pop());
		}
		catch(Exception e){}
	}
}
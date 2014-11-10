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
class QueueLL
{
	Node front=null,rear=null;
	void insert(Object v)
	{
		Node t=new Node();
		t.setData(v);
		if(rear==null)
		{
			rear=t;
			front=rear;
		}
		else
		{
			rear.setNext(t);
			rear=t;
		}
	}
	Object remove()throws Exception
	{
		if(rear==null)
			throw new Exception("Queue is empty ");
		else
		{
			Node p=front;
			front=p.getNext();
			if(front==null)
				rear=null;
			return p.getData()	;
		}		
	}
	boolean empty()
	{
		return (front==null||rear==null);
	}
}

class QueueLLDemo
{
	public static void main(String []args)
	{
		QueueLL x=new QueueLL();
		try
		{
			x.insert(20);
			x.insert(24);
			x.insert(28);
			x.insert(15);
			x.insert(10);
			while(!x.empty())
				System.out.println(x.remove());
		}
		catch(Exception e){}
	}
}
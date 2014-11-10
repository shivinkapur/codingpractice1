class Node
{
	private Node next;
	private int data;
	public int getData()
	{
		return data;
	}
	public Node getNext()
	{
		return next;
	}
	public void setData(int d)
	{
		data=d;
	}
	public void setNext(Node n)
	{
		next=n;
	}
}
class CircularQLL
{
	Node last;
	void insert(int v)
	{
		Node t=new Node();
		t.setData(v);
		if(last==null)
		{
			last=t;
			t.setNext(last);
		}
		else
		{
			t.setNext(last.getNext());
			last.setNext(t);
			last=t;
		}
	}
	int remove()throws Exception
	{
		if (last==null)
			throw new Exception("Queue is empty ");
		else
		{
			Node p=last.getNext();
			last.setNext(p.getNext());
			if(p==last)
				last=null;
			return p.getData();	
		}	
	}
	void display()
	{
		Node p=last.getNext();
		do
		{
			System.out.print(p.getData()+" ");
			p=p.getNext();
		}
		while(p!=last.getNext());
	}
}

class CircularQueueLLDemo
{
	public static void main(String []args)throws Exception
	{
		CircularQLL x=new CircularQLL();
		x.insert(40);
		x.insert(30);
		x.insert(70);
		x.insert(100);
		x.display();
		System.out.println();
		x.remove();
		x.remove();
		x.insert(110);
		x.display();
		System.out.println();
	}
}


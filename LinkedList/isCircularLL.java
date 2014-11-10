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

class CLL
{
	Node last=null;
	/*
	CLL(Node start)
	{
		last=start;
	}
	*/
	void add(Object o)
	{
		Node t=new Node();
		t.setData(o);
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
	void delete(Object v)
	{
		Node p=last.getNext();
		Node prev=null;
		boolean found=false;
		do{
			if(p.getData().equals(v))
			{
				found=true;
				break;
			}	
			prev=p;
			p=p.getNext();	
		}while(p!=last.getNext());

		if(found==false)
			System.out.println("Data doesnt exist");
		else if(p==last.getNext())
		{
			last.setNext(p.getNext());
		}
		else if(p==last)
		{
			prev.setNext(p.getNext());
			last=prev;
		}
		else
		{
			prev.setNext(p.getNext());
		}	
	}
	void display()
	{
		Node p=last.getNext();
		do{
		    System.out.print(p.getData()+" ");
		    p=p.getNext();
		}
		while(p!=last.getNext());
		boolean b=findCircular(p);
		System.out.println(b);
	}
	boolean findCircular(Node startNode)
	{
		Node slowNode=startNode, fastNode=startNode.getNext();
		while(true)
		{
			if(fastNode.getNext()==null || fastNode==null)
				return false;
			else if(fastNode==slowNode || fastNode.getNext()==slowNode)
				return true;
			else
			{
				fastNode.setNext((fastNode.getNext()).getNext());
				slowNode.setNext(slowNode.getNext());
			}
		}
	}
}

class isCircularLLDemo
{
	public static void main(String []args)
	{
		//Node start=new Node();
		//CLL x=new CLL(start);
		CLL x=new CLL();
		x.add(25);
		x.add(35);
		x.add(14);
		x.add(30);
		x.add(45);
		x.delete(45);
		x.display();
		System.out.println();
		//boolean b=findCircular(start);
		//System.out.println(b);
	}
}
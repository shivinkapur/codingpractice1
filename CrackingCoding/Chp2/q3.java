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

class SLL
{
	Node first=null;
	void add(Object o)
	{
		Node t=new Node();
		t.setData(o);
		if(first==null)
			first=t;
		else
		{
			Node p=first;
			while(p.getNext()!=null)
				p=p.getNext();
			p.setNext(t);	
		}	
	}
	void delete(Object v)
	{
		Node p=first;
		Node prev=null;
		while(p!=null)
		{
			if(p.getData().equals(v))
				break;
			prev=p;
			p=p.getNext();	
		}
		if(p==null)
			System.out.println("element doesnt exist ");
		else if(p==first)
			first=p.getNext();
		else
			prev.setNext(p.getNext());		
	}
	void display()
	{
		Node p=first;
		while(p!=null)
		{
			System.out.print(p.getData()+" ");
			p=p.getNext();
		}
	}	
	void delete(Node n)
	{
		Node mhead=n;
		if(mhead==null)
			System.out.println("The Node cannot be deleted as it doesnt exist");
		if(mhead.getNext()==null)
			System.out.println("The Node cannot be deleted as it is the last node");
		Node p=mhead.getNext();
		Object temp=p.getData();
		mhead.setData(temp);
		mhead.setNext(p.getNext());
	}
}
class q3
{
	public static void main(String []args)
	{
		SLL x=new SLL();
		x.add(25);
		x.add(35);
		x.add(10);
		x.add(40);
		x.add(23);
		x.add(10);
		x.add(20);
		x.display();
		System.out.println();
		x.findStart();
	}
}	
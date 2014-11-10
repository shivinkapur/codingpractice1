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
	public void findStart()
	{
		Node n1=first,n2=first;
		while(n2.getNext()!=null)
		{
			n1=n1.getNext();
			n2=n1.getNext().getNext();
			if(n1==n2)
				break;
		}
		if(n2.getNext()==null)
			{
				System.out.println("There is no loop in this list");
			}
		else
		{
			n1=first;
			while(n1!=n2 && n2.getNext()!=null)
			{
				n1=n1.getNext();
				n2=n2.getNext();
			}
			System.out.println("The starting point of the loop is "+n2.getData());	
		}			
	}
}
class q5_2
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
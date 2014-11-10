class Node
{
	private Object data;
	private Node next;
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
	Node head=null;
	public void add(Object o)
	{
		Node t=new Node();
		t.setData(o);
		if(head==null)
		{
			head=t;
			t.setNext(head);
		}
		else
		{
			Node p=head;
			while(p.getNext()!=head)
			{
				p=p.getNext();
			}
			p.setNext(t);
			t.setNext(head);
		}
	}
	public void delete(Object o)
	{
		Node p=head.getNext();
		Node prev=null;
		boolean found=false;
		do
		{
			if(p.getData().equals(o))
			{
				found=true;
				break;
			}	
			prev=p;
			p=p.getNext();
		}while(p!=head.getNext());

		if(found==false)
			System.out.println("The object was not found in the list");
		else if(p==head)
		{
			prev.setNext(p.getNext());
			head=prev;
		}
		else if(p==head.getNext())
		{
			head.setNext(p.getNext());
		}	
		else
		{
			prev.setNext(p.getNext());
		}
	}
	public void display()
	{
		Node p=head;
		do{
		    System.out.print(p.getData()+" ");
		    p=p.getNext();
		}
		while(p!=head);
	}
	public void findStart()
	{
		Node n1=head,n2=head;
		while(n1.getNext()!=head)
		{
			n1=n1.getNext();
			n2=n1.getNext().getNext();
			if(n1==n2)
				break;
		}
		if(n1.getNext()==head)
			System.out.println("There is no loop in this list");
		n1=head;
		while(n1!=n2)
		{
			n1=n1.getNext();
			n2=n2.getNext();
		}
		System.out.println("The starting point of the loop is "+n2);
	}
}
class q5
{
	public static void main(String[] args) 
	{
		CLL x=new CLL();
		x.add(25);
		x.add(35);
		x.add(14);
		x.add(30);
		x.add(45);
		x.delete(45);
		x.add(35);
		x.display();
		System.out.println();
		x.findStart();
	}
}
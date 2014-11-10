import java.util.*;
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
	Node head=null;
	void add(Object o)
	{
		Node t=new Node();
		t.setData(o);
		if(head==null)
			head=t;
		else
		{
			Node p=head;
			while(p.getNext()!=null)
				p=p.getNext();
			p.setNext(t);	
		}	
	}
	void display()
	{
		Node p=head;
		while(p!=null)
		{
			System.out.print(p.getData()+" ");
			p=p.getNext();
		}
	}	
	void nthToLast(int n)
	{
		if(head==null || n<1)
			System.out.println("The input is invalid");
		else
		{
			Node p1=head,p2=head;
			for(int i=0;i<n;i++)
			{
				if(p2==null)
				{	
					System.out.println("The list is smaller than n");
					break;
				}
				p2=p2.getNext();
			}
			while(p2.getNext()!=null)
			{
				p2=p2.getNext();
				p1=p1.getNext();
			}
			System.out.println("The nth value is "+ p1.getData());
		} 
	}
}
class q2
{
	public static void main(String[] args)
	{
		SLL x=new SLL();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.add(50);
		x.add(60);
		x.display();
		System.out.println();
		x.nthToLast(3);	
	}
}	
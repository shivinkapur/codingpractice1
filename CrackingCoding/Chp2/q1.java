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
	void removeDuplicates()
	{
		Hashtable ht=new Hashtable();
		Node p=first;
		while(p.getNext()!=null)
		{
			if(ht.contains(p.getData()))
				p=p.getNext();
			else
			{
				ht.put(p.getData(),true);
			}
			p=p.getNext();
		}
		System.out.println("The linked list after removing duplicates is ");
		Set set=ht.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Object ele=i.next();
			System.out.print(ele+" ");
		}
		System.out.println();
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
}
class q1
{
	public static void main(String[] args)
	{
		SLL x=new SLL();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.add(20);
		x.add(30);
		System.out.println("The linked list before removing duplicates is ");
		x.display();
		x.removeDuplicates();	
	}
}	
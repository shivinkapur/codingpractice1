import java.io.*;
import java.util.*;
class Node
{
	private Object data;
	private Node prev;
	private Node next;
	Object getData()
	{
		return data;
	}
	Node getNext()
	{
		return next;
	}
	Node getPrev()
	{
		return prev;
	}
	void setData(Object v)
	{
		data=v;
	}
	void setNext(Node n)
	{
		next=n;
	}
	void setPrev(Node p)
	{
		prev=p;
	}
}
class DLL
{
	Node first=null;
	void add(Object v)
	{
		Node t=new Node();
		t.setData(v);
		if(first==null)
		{
			t.setPrev(first);
			first=t;
		}
		else
		{
			Node p=first;
			while(p.getNext()!=null)
				p=p.getNext();
			t.setPrev(p);
			p.setNext(t);
		}
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
	boolean delete(Object v)
	{
		Node p=first;
		Node prev=null;
		while(p!=null)
		{
			if(p.getData().equals(v))
				break;
			p=p.getNext();
			prev=p;	
		}
		if(p==null)
			return false;
		else if(p.getNext()==null)
		{
			prev.setNext(null);
		}	
		else if(p==first)
		{
			first=p.getNext();
			p.getNext().setPrev(null);
		}	
		else
		{
			p.getPrev().setNext(p.getNext());
			p.getNext().setPrev(p.getPrev());
		}	
			return true;
	}
}
class DoublyLLDemo
{
	public static void main(String arg[])
	{
		DLL d=new DLL();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.delete(30);
		d.display();
		System.out.println();
	}
}
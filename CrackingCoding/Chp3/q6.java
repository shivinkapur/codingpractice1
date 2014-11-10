import java.util.*;
/*
class Node
{
	Node next = null;
	int data;
	public Node(int d)
	{
	 	data = d;
	}
	void appendToTail(int d)
	{
		Node end = new Node(d);
		Node n = this;
		while (n.next != null)
		{
		 	n = n.next;
		}
		n.next = end;
	}
}
class Stack
{
	Node top;
	void push(Object item)
	{
		Node t=new Node(item);
		t.next=top;
		top=t;
	}
	Node pop()
	{
		if(top!=null)
		{
			Object item=top.data;
			top=top.next;
			return item;
		}
		return null;
	}
}	*/
class q6
{
	public static void main(String []args)
	{
		Stack<Integer> x=new Stack<Integer>();
		try
		{
			x.push(20);
			x.push(34);
			x.push(45);
			x.push(10);
			x.push(54);
			Stack<Integer> sorted=sort(x);
			while(!sorted.empty())
				System.out.println(sorted.pop());
		}
		catch(Exception e){}	
	}
	public static Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> r=new Stack<Integer>();
		while(!s.empty())
		{
			int temp=s.pop();
			while(!r.empty() && r.peek()>temp)
			{
				s.push(r.pop());
			}
			r.push(temp);
		}
		return r;
	}
}
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
	boolean search(Object v)
	{
		Node p=first;
		while(p!=null)
		{
			if(p.getData().equals(v))
				return true;
			p=p.getNext();	
		}
		return false;
	}
	void insertA(Object o,Object v)
	{
		Node p=first;
		while(p!=null)
		{
			if(p.getData().equals(o))
			{
				Node t=new Node();
				t.setData(v);
				t.setNext(p.getNext());
				p.setNext(t);
			}
			p=p.getNext();
		}
	}
	void insertB(Object v)
	{
		Node t=new Node();
		t.setData(v);
		t.setNext(first);
		first=t;
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
	void insertP(Object v,int pos)
	{
		Node p=first;
		Node prev=null;
		Node t=new Node();
		t.setData(v);
		if(pos==1||first==null)
		{
			t.setNext(first);
			first=t;
		}
		else
		{
			int c=1;
			while(p!=null&&c<pos)
			{
				prev=p;
				p=p.getNext();
				c++;
			}
			t.setNext(p);
			prev.setNext(t);
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
	
}

class SinglyLLDemo
{
	public static void main(String []args)
	{
		SLL x=new SLL();
		x.add(25);
		x.add(35);
		x.add(10);
		x.add(40);
		x.add(23);
		x.display();
		System.out.println();
		System.out.println(x.search(21));
		x.insertA(35,20);
		x.display();
		System.out.println();
		x.insertB(5);
		x.display();
		System.out.println();
		x.delete(5);
		x.delete(40);
		x.display();
		System.out.println();
		x.insertP(5,1);
		x.insertP(24,3);
		x.display();
		System.out.println();
	}
}
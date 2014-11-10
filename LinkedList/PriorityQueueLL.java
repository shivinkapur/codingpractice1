class Node
{
	private Object data;
	private int pri;
	private Node next;
	public Object getData()
	{
		return data;
	}
	public int getPri()
	{
		return pri;
	}
	public Node getNext()
	{
		return next;
	}
	public void setData(Object d)
	{
		data=d;
	}
	public void setPri(int z)
	{
		pri=z;
	}
	public void setNext(Node n)
	{
		next=n;
	}
	public String toString()
	{
		return data+"\t"+pri;
	}
}
class PQ
{
	Node first;
	void insert(Object v,int q)
	{
		Node x=new Node();
		x.setData(v);
		x.setPri(q);
		if(first==null||first.getPri()>q)
		{
			x.setNext(first);
			first=x;
		}
		else
		{
			Node p=first,prev=null;
			while(p!=null)
			{
				if(p.getPri()>q)
					break;
				prev=p;
				p=p.getNext();	
			}
			x.setNext(p);
			prev.setNext(x);	
		}
	}
	Object remove()throws Exception
	{
		if(first==null)
			throw new Exception("Empty");
		else
		{
			Node p=first;
			first=first.getNext();
			return p.getData();
		}	
	}
	void display()
	{
		Node p=first;
		while(p!=null)
		{
			System.out.print(p+" ");
			p=p.getNext();
		}
	}
}

class PriorityQueue
{
	public static void main(String []args)throws Exception
	{
		PQ x=new PQ();
		x.insert(20,5);
		x.insert(40,10);
		x.insert(35,7);
		x.insert(54,15);
		x.insert(105,3);
		x.insert(5,32);
		x.display();
		System.out.println(x.remove());
		System.out.println();
		x.display();
		System.out.println();
	}
}
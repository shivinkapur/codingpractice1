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
	SLL addLists(SLL x, SLL y, int carry)
	{
		if(x==null || y==null)
			return null;
	}
}
class q4
{
	static int[] convertToDigits(int n)
	{
		int []temp={(n/100),((n/10)%10),(n%10)};
		return temp;
	}
	static void display(int[] n)
	{
		for(int i=0;i<n.length;i++)
			System.out.print(n[i]+" ");
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		SLL x=new SLL();
		SLL y=new SLL();
		System.out.println("Enter the 1st 3 digit number");
		int no1=sc.nextInt();
		int[] no1_arr=convertToDigits(no1); 
		System.out.println("The first number is ");
		display(no1_arr);
		System.out.println("Enter the 2nd 3 digit number");
		int no2=sc.nextInt();
		int[] no2_arr=convertToDigits(no2); 
		System.out.println("The second number is ");
		display(no2_arr);
		for(int i=0;i<no1_arr.length;i++)
			x.add(no1_arr[i]);
		x.display();
		System.out.println();

		for(int i=0;i<no2_arr.length;i++)
			y.add(no2_arr[i]);
		y.display();
		System.out.println();
		SLL z=addLists(x,y,0);
		z.display();
	}
}	
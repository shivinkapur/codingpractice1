import java.util.*;
class Stack
{
	int []a;
	int top1,top2;
	Stack(int n)
	{
		a=new int[n];
		top1=-1;
		top2=n;
	}
	void pushbot(int v)
	{
		if(top1+1==top2)
			System.out.println(" Bottom Stack is full ");
		else
			a[++top1]=v;	
	}
	void pushup(int v)
	{
		if(top1+1==top2)
			System.out.println(" Top Stack is full ");
		else
			a[--top2]=v;	
	}
	int popbot()throws Exception
	{
		if(top1==-1)
			throw new Exception("Bottom Stack is empty ");
		else
			return a[top1--];	
	}
	int popup()throws Exception
	{
		if(top2==a.length)
			throw new Exception("Top Stack is empty ");
		else
			return a[top2++];	
	}
	boolean emptybot()
	{
		return top1==-1;
	}
	boolean emptyup()
	{
		return top2==a.length;
	}
}
class twoStacksDemo
{
	public static void main (String arg[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements you want in the stack");
		int n=sc.nextInt();
		Stack s=new Stack(n);
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element ");
			int v=sc.nextInt();
			s.pushup(v);
		}
		while(!s.emptybot())
			System.out.print(s.popbot()+" ");
		System.out.println();
		while(!s.emptyup())
			System.out.println(s.popup()+" ");	
	}
}
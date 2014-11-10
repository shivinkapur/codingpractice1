import java.io.*;
import java.util.*;
class Stack
{
	Vector v;
	Stack()
	{
		v=new Vector();
	}
	void push(Object e)
	{
		v.add(e);
	}
	Object pop()throws Exception
	{
		if(v.isEmpty())
			throw new Exception("Stack is empty");
		else
			return v.remove(v.size()-1);
	}
	Object peek()throws Exception
	{
			if(v.isEmpty())
			throw new Exception("Stack is empty");
		else
			return v.lastElement();
	}	
	boolean empty()
	{
		return v.isEmpty();
	}		
}

class Demo
{
	public static void main(String[] args)throws Exception
	{
		Stack s=new Stack();
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the infix expression ");
		String s1=sc.nextLine();
		String post="";
		char a[]=s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(Character.isLetterOrDigit(a[i]))
				post+=a[i];
			else 
			{
				if(s.empty()||a[i]=='('||(preced(a[i])>preced((Character)s.peek())||a[i]=='^'))
				s.push(a[i]);
			    else if(a[i]==')')
			{
				      while(!s.empty()&&(Character)s.peek()!='(')
					  post+=s.pop();
					  s.pop();
			}
			    else
			{
				while(!s.empty()&&(preced(a[i])<=preced((Character)s.peek())))
					post+=s.pop();
					s.push(a[i]);
			}
			}
		}
		while(!s.empty())
			post+=s.pop();
		System.out.println(post);	
	}
	static int preced(char op)
	{
		switch(op)
		{
			case '^':
			case '$':
				return 4;
			case '*':
			case '/':
			case '%':
				return 3;
			case '+':
			case '-':
				return 2;
			case '(':
			case ')':
				return 1;			
		}
		return 0;
	}
}
import java.util.*;
import java.io.*;
class Graph
{
	boolean b[][];
	boolean directed;
	Graph(int n,boolean direct)
	{
		b=new boolean [n][n];
		directed=direct;
		createGraph();
	}
	void createGraph()
	{
		char ch;
		do{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the edge name ");
			String s=sc.next();
			s=s.toUpperCase();
			int x=s.charAt(0)-65;
			int y=s.charAt(1)-65;
			b[x][y]=true;
			if(!directed)
				b[y][x]=true;
			System.out.println("Enter y to continue ");
			ch=sc.next().charAt(0);	
		}while(ch=='y');
	}
	void dfs(int s,boolean v[])throws Exception
	{
		Stack st=new Stack();
		v[s]=true;
		st.push(s);
		System.out.println((char)(s+65));
		while(!st.empty())
		{
			int j;
			s=(Integer)(st.peek());
			for(j=0;j<b.length;j++)
			{
				if(b[s][j] && !v[j])
				{
					v[j]=true;
					System.out.println((char)(j+65));
					st.push(j);
					break;
				}
			}
			if(j==b.length)
			st.pop();
		}	
	}
}
class DFSDemo
{
	public static void main(String agr[])throws Exception
	{
		Graph x=new Graph(7,true);
		boolean v[]=new boolean[7];
		x.dfs(0,v);
	}
}

/*
--------------------Configuration: <Default>--------------------
Enter the edge name 
AE
Enter y to continue 
y
Enter the edge name 
BA
Enter y to continue 
y
Enter the edge name 
CA
Enter y to continue 
y
Enter the edge name 
DB
Enter y to continue 
y
Enter the edge name 
EC
Enter y to continue 
y
Enter the edge name 
ED
Enter y to continue 
y
Enter the edge name 
EF
Enter y to continue 
y
Enter the edge name 
FC
Enter y to continue 
y
Enter the edge name 
GD
Enter y to continue 
y
Enter the edge name 
FG
Enter y to continue 
y
Enter the edge name 
GE
Enter y to continue 
n
A
E
C
D
B
F
G

Process completed.
*/
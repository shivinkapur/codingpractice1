import java.util.*;
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
	void bfs(int s)
	{
		boolean v[]=new boolean[b.length];
		int q[]=new int[b.length];
		int j;
		v[s]=true;
		int rear=-1,front=-1;
		q[++rear]=s;
		System.out.println((char)(s+65));
		while(rear!=front)
		{
			s=q[++front];
			for(j=0;j<b.length;j++)
			{
				if(b[s][j] && !v[j])
				{
					v[j]=true;
					q[++rear]=j;
					System.out.println((char)(j+65));
				}
			}
		}	
	}
}
	class BFSDemo
	{
		public static void main(String arg[])
		{
			Graph g=new Graph(7,false);
			g.bfs(0);
		}
	}

/*
--------------------Configuration: <Default>--------------------
Enter the edge name 
AC
Enter Y to continue 
Y
Enter the edge name 
AD
Enter Y to continue 
Y
Enter the edge name 
CB
Enter Y to continue 
Y
Enter the edge name 
DB
Enter Y to continue 
N
ACDB
Process completed.
*/
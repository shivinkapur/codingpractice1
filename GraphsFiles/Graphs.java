import java.io.*;
import java.util.*;
class Graph
{
	boolean a[][];
	boolean visited[];
	boolean dir;
	Graph(int n,boolean directed)
	{
		a=new boolean[n][n];
		dir=directed;
		create();
		visited=new boolean[n];
	}
	void create()
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.print("Enter edge ");
			String s=sc.next();
			char x=s.charAt(0);
			char y=s.charAt(1);
			x=Character.toUpperCase(x);
			y=Character.toUpperCase(y);
			a[x-65][y-65]=true;
			if(!dir)
				a[y-65][x-65]=true;
		    System.out.print("enter y to quit");
			ch=sc.next().charAt(0);	
		}
		while(ch!='y');
		
	}
	void dfs(int r)
	{
		System.out.print((char)(r+65)+" ");
		visited[r]=true;
		for(int c=0;c<visited.length;c++)
			if(a[r][c]&&!visited[c])
				dfs(c);
	}
}

class GraphDemo
{
	public static void main(String []args)
	{
		Graph x=new Graph(6,false);
		x.dfs(0);
	}	
}

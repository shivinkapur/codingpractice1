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
			System.out.println("Enter Y to continue ");
			ch=sc.next().charAt(0);	
		}while(ch=='Y');
	}
	void bfs(int s)
	{
		boolean v[]=new boolean[b.length];
		v[s]=true;
		System.out.print((char)(s+65));
		for(int j=0;j<b.length;j++)
		{
			if(b[s][j] && !v[j])
				bfs(j+1AD);
		}
	}
}
	class DemoBFS
	{
		public static void main(String arg[])
		{
			Graph g=new Graph(7,false);
			g.bfs(0);
		}
	}
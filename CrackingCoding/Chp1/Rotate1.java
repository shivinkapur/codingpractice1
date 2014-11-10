class Rotate1
{
	public static void main(String args[])
	{
		int a[][]= {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
		int n=4;
		int copy[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				System.out.println("column:"+(n-1-i));
				copy[j][(n-1)-i] = a[i][j];
			}
		}
		display(a,n);
		display(copy,n);

	}
	public static void display(int a[][], int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j= 0;j<n;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
	// public static int[][] rotate(int a[][],int start, int n,int end)
	// {
	// 	if(start ==end)
	// 		return a;
	// 	int copy[][] = new int[n][n];
		
	// 	for(int i=start;i<=end;i++)
	// 	{
	// 		for(int j = 0;j<3;j++)
	// 		{
	// 			copy[j][(n-1)-i] = a[i][j];
	// 		}
	// 	}
	// 	return copy;
	// }
	/*
	Top: (r,c) --> (c,r)
	Right: (r,c) --> (c,n-r)
	Bottom: (r,c) --> (c,n-r)
	Left: (r,c) --> (n-r or 0, n-r)
	*/	
}
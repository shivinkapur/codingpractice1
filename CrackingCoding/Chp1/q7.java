import java.util.*;
class q7
{
	public static void main(String args[])
	{
		int array[][]={{12,10,0},{8,0,3},{1,2,7}};
		display(array);
		int output[][]=setZeros(array);
		display(output);
	}
	public static void display(int array[][])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
				System.out.print(array[i][j]+" ");
			System.out.println();
		}
	}
	public static int[][] setZeros(int a[][])
	{
		int row[]=new int[a.length];
		int column[]=new int[a[0].length];
		for(int i=0;i<row.length;i++)
		{
			for(int j=0;j<column.length;j++)
			{
				if(a[i][j]==0)
				{
					row[i]=1;
					column[j]=1;
				}
			}
		}
		for(int i=0;i<row.length;i++)
			for(int j=0;j<column.length;j++)
				if(row[i]==1 || column[j]==1)
					a[i][j]=0;
		return a;
	}
}
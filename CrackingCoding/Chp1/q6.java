import java.util.*;
class q6
{
	public static void main(String args[])
	{
		int array[][]={{0,1,2},{3,4,5},{6,7,8}};
		int n=3;
		display(array);
		int[][] output=rotate(array,n);
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
	public static int[][] rotate(int[][] a, int n)
	{
		for(int layer=0;layer<n/2;++layer)
		{
			int first=layer;
			int last=n-1-layer;
			for(int i=first;i<last;++i)
			{
				int offset=i-first;
				int top=a[first][i]; //save top

				//left->top
				a[first][i]=a[last-offset][first];

				//bottom->left
				a[last-offset][first]=a[last][last-offset];

				//right->bottom
				a[last][last-offset]=a[i][last];

				//top->right
				a[i][last]=top;
			}
		}
		return a;
	}
}
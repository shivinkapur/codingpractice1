import java.util.*;
class q3
{
	public static void main(String[] args)
	{
		int[] a={15,16,19,20,25,1,3,4,5,7,10,14};
		int index=search(a,5);
		System.out.println("The index of 5 is "+index);	
	}
	public static int search(int a[], int l, int u, int x) 
	{
		while (l <= u)
		{
			int m=(l+u)/2;
			if(x==a[m])
			{
				return m;
			}
			else if (a[l] <= a[m])
			{
				if (x > a[m])
				{
					l = m+1;
				}
				else if (x >= a[l])
				{
					u = m-1;
				}
				else
				{
					l = m+1;
				}
			}
			else if(x<a[m])
				u=m-1;
			else if(x<=a[u])
				l=m+1;
			else u=m-1;
		}
		return -1;
	}
	public static int search(int a[], int x)
	{ 
		return search(a, 0, a.length - 1, x);
	}
}
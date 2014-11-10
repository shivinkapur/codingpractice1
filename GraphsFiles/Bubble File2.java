import java.util.*;
class Bubble
{
	static void bubble(int []a)
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		//System.out.print(Arrays.toString(a));
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int e=sc.nextInt();
		int a[]=new int[e];
		System.out.println("Enter the elements");
		for(int i=0;i<e;i++)
			a[i]=sc.nextInt();
			bubble(a);
			for(int i=0;i<e;i++)
			{System.out.print(a[i]);
		System.out.println();
	}
	}
}
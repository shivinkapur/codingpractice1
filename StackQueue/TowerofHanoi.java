import java.util.*;
class TowerH
{
	static void Tower(int n,char source,char aux,char target)
	{
		if(n==1)
			System.out.println("Shift "+n+" from "+source+" to "+target);
		else
		{
			Tower(n-1,source,target,aux);
			System.out.println("Shift "+n+" from "+source+" to "+target);
			Tower(n-1,aux,source,target);
		}	
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of disks ");
		int n=sc.nextInt();
		Tower(n,'A','B','C');
	}
}
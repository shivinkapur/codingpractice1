import java.util.*;
class zeroOneGoogle2
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String ip=sc.nextLine();
		permutations(ip);
	}
	public static void permutations(String s)
	{
		permutations("",s);
	}
	public static void permutations(String prefix,String s)
	{
		int n=s.length();
		if(n==0)
			System.out.println(prefix);
		else
		{
			for(int i=0;i<n;i++)
			{
				if(s.contains("?"))
					permutations(prefix+"0",s.substring(0,i)+s.substring(i,n));
			}
		}
	}
}
import java.util.*;
class q4
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string 1");
		String input1=sc.next();
		System.out.println("Enter string 2");
		String input2=sc.next();
		boolean b=anagrams(input1,input2);
		if(b)
			System.out.println("The 2 strings are anagrams");
		else
			System.out.println("The 2 strings are not anagrams");
	}
	public static boolean anagrams(String input1,String input2)
	{
		if(input1.length()!=input2.length())
			return false;
		int a[]=new int[256];
		int index=0; 
		for(int i=0;i<input1.length();i++)
		{
			index=(int)input1.charAt(i);
			a[index]++;
		}
		for(int i=0;i<input2.length();i++)
		{
			index=(int)input2.charAt(i);
			a[index]--;
			if(a[index]<0)
				return false;	
		}
		return true;
	}
}
import java.util.*;
class permutationsString
{
	public static void permutation(String str)
	{ 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str)
	{

   	 	int n = str.length();
    	if (n == 0)
    		System.out.println(prefix);
    	else
    	{
    	    for (int i = 0; i < n; i++)
    	        permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    	}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		permutation(s);	
	}
}
/*
Output
Shivins-MacBook-Pro:Chp9 shivinkapur$ java permutationsString
Enter a string
01?
01?
0?1
10?
1?0
?01
?10
*/
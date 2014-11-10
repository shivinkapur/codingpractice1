import java.util.*;
class q8
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string 1");
		String input1=sc.next();
		System.out.println("Enter string 2");
		String input2=sc.next();
		boolean b=isRotation(input1,input2);
		if(b)
			System.out.println("The 2nd string is a rotation of the 1st");
		else
			System.out.println("The 2nd string is NOT a rotation of the 1st");
	}
	public static boolean isRotation(String str1,String str2)
	{
		if(str1.length()==str2.length() && str1.length()>0)
		{
			String concatStr1= str1+str1;
			return isSubstring(concatStr1,str2);
		}
		return false;
	}
	public static boolean isSubstring(String s1,String s2)
	{
		if(s1.contains(s2))
			return true;
		return false;
	}
}
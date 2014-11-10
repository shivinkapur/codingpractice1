import java.util.*;
class q1
{
	public static boolean isUnique(String input)
	{
		boolean[] char_set=new boolean[256];
		for(int i=0;i<input.length();i++)
		{
			int isPresent=input.charAt(i);
			if(char_set[isPresent])
				return false;
			else char_set[isPresent]=true;			
		}
		return true;
	}
	public static boolean isUniqueHash(String input)
	{
		HashMap hm=new HashMap();
		char[] char_map=input.toCharArray();
		int value=0;
		for(int i=0;i<char_map.length;i++)
		{
			Character c = new Character(char_map[i]);
			if(hm.containsKey(c))
				return false;
			hm.put(new Character(char_map[i]),new Integer(value));
		}
		return true;
	}
	public static void main(String args[])
	{
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		boolean b=isUnique(input);
		boolean c=isUniqueHash(input);
		if(c)
			System.out.println("The string has all unique characters");
		else
			System.out.println("The string doesn't have unique characters");
	}
}
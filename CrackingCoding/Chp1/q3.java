import java.util.*;
class q3
{
	static void isDuplicateHash(String input)
	{
		HashMap hm=new HashMap();
		char[] char_map=input.toCharArray();
		int value=0;
		for(int i=0;i<char_map.length;i++)
		{
			Character c = new Character(char_map[i]);
			if(!hm.containsKey(c))
				hm.put(new Character(char_map[i]),new Integer(value));
		}
		Set set=hm.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			Object ele=i.next();
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		isDuplicateHash(input);
	}
}
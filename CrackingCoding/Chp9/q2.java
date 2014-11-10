import java.util.*;
class AnagramComparator implements Comparator<String>
{
	public String sortChars(String s)
	{
		char[] content=s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	public int compare(String s1,String s2)
	{
		return sortChars(s1).compareTo(sortChars(s2));
	}
}
class q2
{
	public static void main(String[] args)
	{
		String[] array={"god","abc","dog","cab","man"};
		Arrays.sort(array,new AnagramComparator());
		for(String s:array)
			System.out.print(s+" ");
	}
}
/*
Output

Shivins-MacBook-Pro:Chp9 shivinkapur$ javac q2.java
Shivins-MacBook-Pro:Chp9 shivinkapur$ java q2
abc cab man god dog Shivins-MacBook-Pro:Chp9 shivinkapur$ 

*/
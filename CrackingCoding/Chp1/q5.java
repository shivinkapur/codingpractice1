import java.util.*;
class q5
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String a=sc.nextLine();
		removeSpacesSplit(a);
		removeSpacesReplace(a);
	}
	public static void removeSpacesSplit(String a)
	{
		String str_arr[]=a.split(" ");
		String output="";
		System.out.println(str_arr.length);
		for(int i=0;i<str_arr.length-1;i++)
		{
			output=output+str_arr[i]+"%20";
		}
		System.out.println(output+str_arr[str_arr.length-1]);
	}
	public static void removeSpacesReplace(String a)
	{
		String output=a.replace(" ","%20");
		System.out.println(output);
	}
}
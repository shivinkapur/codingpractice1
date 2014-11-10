import java.io.*;
class String1
{
	public static void main(String[] args) 
	{
		String s="This is a test string";
		String[] a= s.split(" ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
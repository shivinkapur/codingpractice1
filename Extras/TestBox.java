import java.io.*;
public class TestBox
{
	Integer i=3;
	int j;
	public static void main(String args[])
	{
		TestBox t=new TestBox();
		t.go();
	}
	public void go()
	{
		j=i;
		System.out.println(j);
		System.out.println(i);
	}
}
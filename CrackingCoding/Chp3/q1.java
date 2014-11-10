import java.util.*;
class stacks3
{
	int size;
	int a[];
	int stackPointer[]={0,0,0};

	stacks3(int n)
	{
		size=n;
		a=new int[size*3];
	}
	public void push(int stackNo,int value)
	{
		int index=stackNo*size + stackPointer[stackNo] + 1;
		stackPointer[stackNo]++;
		a[index]=value;
	}
	public int pop(int stackNo)
	{
		int index=stackNo*size + stackPointer[stackNo];
		stackPointer[stackNo]--;
		int value=a[index];
		a[index]=0;
		return value;
	}
	public int peek(int stackNo)
	{
		int index=stackNo*size+ stackPointer[stackNo];
		return a[index];
	}
	public boolean isEmpty(int stackNo)
	{
		return stackPointer[stackNo]==stackNo*size;
	}
}
class q1
{
	public static void main(String[] args)
	{
		stacks3 s=new stacks3(3);
		s.push(0,10);
		s.push(1,11);
		s.push(0,20);
		s.push(2,30);
		while(!s.isEmpty(0))
		{
			System.out.println(s.pop(0));
		}	
	}
}
import java.util.*;
class zeroOneGoogle
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String ip=sc.nextLine();
		char[] chars=ip.toCharArray();
		//ArrayList<String> sout=new ArrayList<String>();
		int count=0;
		for(int i=0;i<chars.length;i++)
		{
			if(chars[i]=='?')
			{
				count++;
			}
		}
		System.out.println(count);
		char[][] output=new char[2*count][ip.length()];
		/*
		for(int i=0;i<(2*count-1);i++)
		{
			for(int j=0;j<ip.length();j++)
			{
				output[i][j]=chars[j];
				if(chars[j]=='?')
				{
					output[i][j]=0;
					if(i==2*count-2)
						break;
					output[i+1][j]=1;
				}
			}
		}
		*/
		System.out.println("The asnwer is ");
		for(int i=0;i<(2*count);i++)
		{
			for(int j=0;j<ip.length();j++)
			{
				output[i][j]=chars[j];
				if(chars[j]=='?')
				{
					if(i%2==0)
						output[i][j]='0';
					else
						output[i][j]='1';
				}
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
	}
}
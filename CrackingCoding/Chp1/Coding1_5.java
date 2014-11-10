import java.io.*;
import java.util.*;
class Coding1_5
{
	public static void main(String args[])throws IOException
	{
		char c[]={'t','h','i','s',' ','i','s',' ','a',' ','s','t','r','i','n','g'};
		int len = c.length;
		int spaceCount = 0;
		for(int i=0;i<len;i++)
		{
			if(c[i]==' ')
				spaceCount++;
		}
		int newsize = len + (spaceCount*3);
		char newc []= new char[newsize];
		int ptr=0;
		System.out.println();
		for(int i=0;i<len;i++)
		{
			if(c[i]==' ')
			{
				newc[ptr++]='%';
				System.out.print(newc[ptr-1]+" ");
				newc[ptr++]='2';
				System.out.print(newc[ptr-1]+" ");
				newc[ptr++]='0';
			}
			else
				newc[ptr++]=c[i];
			System.out.print(newc[ptr-1]+" ");
		}

	}
}
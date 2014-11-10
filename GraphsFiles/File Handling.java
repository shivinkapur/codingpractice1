import java.io.*;
class Files
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=new FileReader("D:\\Shivin College\\2nd Year\\DSF\\My Programs\\Bubble.java");
		int i;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		fr.close();	
	}
}
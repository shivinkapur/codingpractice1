import java.io.*;
class Files
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=new FileReader("D:\\Shivin College\\2nd Year\\DSF\\My Programs\\Bubble.java");
		FileWriter fw=new FileWriter("D:\\Shivin College\\2nd Year\\DSF\\My Programs\\Bubble File.java");
		int i;
		while((i=fr.read())!=-1)
			fw.write(i);
		fr.close();	
		fw.close();	
	}
}
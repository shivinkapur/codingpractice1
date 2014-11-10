import java.io.*;
class Files
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fr=new FileInputStream("D:\\Shivin College\\2nd Year\\DSF\\My Programs\\Bubble.java");
		FileOutputStream fw=new FileOutputStream("D:\\Shivin College\\2nd Year\\DSF\\My Programs\\Bubble File2.java");
		int ch;
		while((ch=fr.read())!=-1)
			fw.write(ch);
		fr.close();	
		fw.close();	
	}
}
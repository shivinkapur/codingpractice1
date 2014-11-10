import java.util.*;
class game
{
	static char[][] matrix;
	public static void buildGame()
	{
		matrix=new char [20][20];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				System.out.print("O  ");
			}
			System.out.println();	
		}	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		buildGame();
		String in="ZZOO,OOZZ";
		String[] a=in.split(",");
		char[][] input;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length();j++)
				input[i][j]=a[i].toCharArray();
		}
	}
}
import java.io.*;
class q2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a decimal number");
		String s=br.readLine();
		String binary=printBinary(s);
		System.out.println("The binary form of the number is "+ binary);	
	}
	public static String printBinary(String n)
	{
		int intPart = Integer.parseInt(n.substring(0, n.indexOf(".")));
		double decPart = Double.parseDouble(n.substring(n.indexOf("."), n.length())); 
		//System.out.println(intPart);
		//System.out.println(decPart);
		String int_string =" ";
		while (intPart > 0)
		{
			int r = intPart % 2; 
			intPart >>= 1;
			int_string = r + int_string;
		}
		//System.out.println(int_string);
		StringBuffer dec_string = new StringBuffer();
		while (decPart > 0)
		{
			//if (dec_string.length() > 32)
			//	return "ERROR"; 
			if (decPart == 1)
			{
				dec_string.append((int)decPart);
				break;
			}
			double r = decPart * 2;
			if(r>=1)
			{
				dec_string.append(1);
				decPart = r - 1; 
			}
			else
			{
				dec_string.append(0);
				decPart = r;
			}
		}
		return int_string + "." + dec_string.toString();
	}
}	
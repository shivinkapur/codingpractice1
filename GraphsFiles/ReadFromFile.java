import java.io.*;

class ReadFromFile 
{
        public static void main(String args[])
	{
                // args.length will give length of command line argument 
                if (args.length == 1)
		{
                        try
			{
                                // Open the file that is the first 
                                // command line parameter
                                FileInputStream fstream = new FileInputStream(args[0]);

                                // Convert our input stream to a
                                // DataInputStream
				DataInputStream in = new DataInputStream(fstream);

                                // Continue to read lines while 
                                // there are still some left to read
                                while (in.available() !=0)
				{
                                        // Print file line to screen
					System.out.println (in.readLine());
				}

				in.close();
			} 
                        catch (Exception e)
			{
				System.err.println("File input error");
			}
		}
                else
                                System.out.println("Invalid parameters");
	}

}


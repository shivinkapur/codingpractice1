class q1
{
	public static void main(String[] args)
	{
		int i=2;
		int j=6;
		int n=1000;
		int m=23;
		toBinary(n);
		toBinary(m);
		int ans=updateBits(n,m,i,j);
		System.out.println("Answer is");
		toBinary(ans);	
	}
	public static int updateBits(int n, int m, int i, int j)
	{
    	int max = ~0; /* All 1's */
 		System.out.println("Max=");
 		toBinary(max);

 	   	// 1's through position j, then 0's
 	   	int left = max - ((1 << j) - 1);
		System.out.println("Left=");
		toBinary(left);

 	   	// 1's after position i
 	   	int right = ((1 << i) - 1);
 		System.out.println("Right=");
 		toBinary(right);

 	   	// 1's with 0s between i and j
 	   	int mask = left | right;
 		System.out.println("Mask=");
 		toBinary(mask);

   		// Clear i through j, then put m in there
   		return (n & mask) | (m << i);
	}
	public static void toBinary(int int1)
	{
       System.out.println(int1 + " in binary is");
       System.out.println(Integer.toBinaryString(int1));
   }
}
/*
Shivins-MacBook-Pro:Chp5 shivinkapur$ javac q1.java
Shivins-MacBook-Pro:Chp5 shivinkapur$ java q1
1000 in binary is
1111101000
23 in binary is
10111
Max=
-1 in binary is
11111111111111111111111111111111
Left=
-64 in binary is
11111111111111111111111111000000
Right=
3 in binary is
11
Mask=
-61 in binary is
11111111111111111111111111000011
Answer is
988 in binary is
1111011100
*/

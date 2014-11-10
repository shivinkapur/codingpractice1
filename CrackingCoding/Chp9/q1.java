class q1
{
	public static void main(String[] args)
	{
		//int a[]=new int[10];
		int[] a={1,3,5,7,9,0,0,0,0,0};
		int[] b={2,4,6};
		merge(a,b,5,3);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
 	}

	public static void merge(int[] a, int[] b, int n, int m)
	{
		int k=m+n-1;//Indexoflastlocationofarrayb
		int i=n-1;//Indexoflastelementinarrayb
		int j=m-1;//Indexoflastelementinarraya
		// Start comparing from the last element and merge a and b
		while(i>=0 && j>=0)
		{
			if (a[i] > b[j])
			{
				a[k--] = a[i--];
			}
			else
			{
				a[k--]=b[j--];
			}
		} 
		while(j>=0)
			a[k--] = b[j--];
	} 
}
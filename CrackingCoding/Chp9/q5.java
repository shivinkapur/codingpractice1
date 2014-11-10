class q4
{
	public static void main(String[] args)
	{
		String[] strings={"at","","","","ball","","","car","","dad","",""};
		String s="ball";
		int index=search(strings,s);	
		System.out.println("The index of the string is "+index);
	}
	public static int search(String[] strings,String str)
	{
		if(strings==null || str==null)
			return -1;
		if(str=="")
		{
			for(int i=0;i<strings.length;i++)
			{
				if(strings[i]=="")
					return i;
			}
			return -1;
		}
		return search(strings,str,0,strings.length-1);
	}
	public static int search(String[] strings,String str,int first,int last)
	{
		System.out.println("First is "+first+" Last is "+last);
		while(first<=last)
		{
			while(first<=last && strings[last]=="")
				--last;
			System.out.println("last after removing empty strings is "+last);
			if(last<first)
				return -1;
			int mid=(first+last)/2;
			//System.out.println("Mid is "+mid);
			while(strings[mid]=="")
				++mid;
			int r=strings[mid].compareTo(str);
			System.out.println("value of R is "+r);
			if(r==0)
				return mid;
			if(r<0)
				first=mid+1;
			else
				last=mid-1;
		}
		return -1;
	}
}
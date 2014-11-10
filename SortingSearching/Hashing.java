class HashTable
{
	Object a[];
	int k[];
	HashTable(int n)
	{
		a=new Object[n];
		k=new int[n];
	}
	int hash(int key)
	{
		return (key%a.length+1)%a.length;
	}
	void insertLinear(int key,Object value)
	{
		int i=hash(key);
		while(k[i]!=0)
			i=(i+1)%a.length;
		a[i]=value;
		k[i]=key;	
	}
	Object searchLinear(int key)
	{
		int i=hash(key);
		while(k[i]!=key&&k[i]!=0)
			i=(i+1)%a.length;
		if(k[i]==key)
			return a[i];
		else
			return null;		
	}
	void insertQuadratic(int key,Object value)
	{
		int c=1;
		int i=hash(key);
		int x=i;
		while(k[i]!=0)
		{
			i=(x+c*c)%a.length;
			c++;
		}
		a[i]=value;
		k[i]=key;
	}
	Object searchQuadratic(int key)
	{
		int x;
		int i=hash(key);
		int c=1;
		x=i;
		while(k[i]!=key&&k[i]!=0)
		{
			i=(x+c*c)%a.length;
			c++;
		}
		if(k[i]==key)
			return a[i];
		else
			return null;	
	}
	int hash2(int v)
	{
		return (v%(a.length-1)+1)%a.length;
	}
	void insertDoubleHash(int key,Object value)
	{
		int i=hash(key);
		while(k[i]!=0)
			i=(i+hash2(key))%a.length;
		a[i]=value;
		k[i]=key;	
	}
	Object searchDoubleHash(int key)
	{
		int i=hash(key);
		while(k[i]!=key&&k[i]!=0)
			i=(i+hash2(key))%a.length;
		if(k[i]==key)
			return a[i];
		else
			return null;		
	}
}
class Hashing
{
	public static void main(String []args)
	{
		HashTable x=new HashTable(100);
		x.insertLinear(25,"Hello");
		x.insertLinear(35,"Hi");
		x.insertLinear(45,"wasuuppp");
		Object v=x.searchDoubleHash(35);
		System.out.println(v);
	}
}
class CircularQueue
{
	int rear=-1,front=-1,count=0;
	int a[];
	CircularQueue(int n)
	{
		a=new int[n];
	}
	void insert(int v)throws Exception
	{
		if(a.length==count)
			throw new Exception("Queue is full ");
		else
		{
			rear=(rear+1)%a.length;
			a[rear]=v;
			count++;
		}	
	}
	int remove()throws Exception
	{
		if(count==0)
			throw new Exception("Queue is empty ");
		else
		{
			front=(front+1)%a.length;
			count--;
			return a[front];
		}	
	}
	boolean empty()
	{
		return count==0;
	}
}

class CircularQueueDemo
{
	public static void main(String []args)
	{
		CircularQueue x=new CircularQueue(3);
		try
		{
			x.insert(20);
			x.insert(25);
			x.insert(30);
			x.remove();
			x.insert(5);
			while(!x.empty())
				System.out.println(x.remove());
			
		}
		catch (Exception e){}
		
	}
}
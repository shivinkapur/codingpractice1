class Queue
{
	int a[];
	int front=-1,rear=-1;
	Queue(int n)
	{
		a=new int[n];
	}
	public void insert(int v)throws Exception
	{
		if(a.length-1==rear)
			throw new Exception("Queue is full ");
		else
			a[++rear]=v;	
	}
	public int remove()throws Exception
	{
		if(rear==front)
			throw new Exception("Queue is empty ");
		else
			return a[++front];	
	}
	public boolean empty()
	{
		return (front==rear);
	}	
}

class QueueDemo
{
	public static void main(String []args)
	{
		Queue x=new Queue(20);
		try
		{
			x.insert(20);
			x.insert(40);
			x.insert(30);
			x.insert(15);
			x.insert(24);
			//x.remove();
			while(!x.empty())
				System.out.println(x.remove());
		}
		catch(Exception e){}
	}
}
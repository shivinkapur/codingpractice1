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
class stackUsing2Queues
{
	Queue q1,q2;
	void push(int value)throws Exception
	{
		if(q1.isFull())
			System.out.println("Overflow");
		else
		{
			q1.insert(value);
		}
	}
	int pop()
	{
		if(q1.empty())
		{
			System.out.println("Underflow");
		}
		else
		{
			while(q1.getSize()!=1)
				q2.insert(q1.remove());
			int value=q1.remove();
			while(!q2.empty())
				q1.insert(q2.remove());
		}
		return value;
	}
}
import java.util.*;
class CircularArray<T> implements Iterable<T>
{
	public T[] items;
	public int head=0;
	public CircularArray(int size)
	{
		items=(T[])new Object[size];
	}
	private int convert(int index)
	{
		if(index<0)
			index+=items.length;
		return (head+index)%items.length;
	}
	public void rotate(int shiftRight)
	{
		head=convert(shiftRight);
	}
	public T get(int i) throws Exception
	{
		if(i<0 || i>=items.length)
			throw new java.lang.IndexOutOfBoundsException();
		return items[i];
	}
	public void put(int i,T item)
	{
		items[convert(i)]=item;
	}
	public Iterator<T> iterator()
	{
		return new CircularArrayIterator<T>(this);
	}
	public int length()
	{
		return items.length;
	} 
}
class CircularArrayIterator<TI> implements Iterator<TI>
{
	private TI[] _items;
	private int _current=-1;
	public CircularArrayIterator(CircularArray array)
	{
		//_items=(TI[]) new Object[array.length()];
		//for(int i=0;i<array.length();i++)
		//	_items[i]=(TI)array[i];
		_items=(TI[])array.items;
	}
	public boolean hasNext()
	{
		return _current< _items.length-1;
	}
	public TI next()
	{
		_current++;
		TI item=(TI) _items[convert(_current)];
		return item;
	}
	private int convert(int index)
	{
		if(index<0)
			index+=_items.length;
		return (_current+index)%_items.length;
	}
	public void remove()
	{
		System.out.println(" ");
	}
}
public class q6
{
	public static void main(String[] args) throws Exception
	{
		CircularArray<String> ca=new CircularArray<String>(5);
		ca.put(0,"Shivin");
		ca.put(1,"Manoj");
		ca.put(2,"Raghav");
		ca.put(3,"UV");
		ca.put(4,"Shomo");
		ca.rotate(2);
		ca.get(2);
		CircularArrayIterator<String> i=new CircularArrayIterator<String>(ca);
		for(String s:ca)
			System.out.println(s);
		while(i.hasNext())
			System.out.println(i.next());
	}
}
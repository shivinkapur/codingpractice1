import java.util.*;
public class SortMountains
{
	LinkedList<Mountain> m=new LinkedList<Mountain>();
	class NameCompare implements Comparator<Mountain>
	{
		public int compare(Mountain one, Mountain two)
		{
			return one.name.compareTo(two.name);
		}
	}
	class HeightCompare implements Comparator<Mountain>
	{
		public int compare(Mountain one, Mountain two)
		{
			return (two.height)-(one.height);
		}
	}
	public static void main(String[] args)
	{
		new SortMountains().go();
	}
	public void go()
	{
		m.add(new Mountain("A",1000));
		m.add(new Mountain("B",3000));
		m.add(new Mountain("C",1020));
		m.add(new Mountain("D",2300));
		NameCompare nc=new NameCompare();
		HeightCompare hc=new HeightCompare();
		System.out.println("as entered "+ m);
		Collections.sort(m,nc);
		System.out.println("by name: "+ m);
		Collections.sort(m,hc);
		System.out.println("by height: "+ m);
	}
}
class Mountain
{
	String name;
	int height;
	Mountain(String n,int h)
	{
		name=n;
		height=h;
	}
	public String toString()
	{
		return name+" "+height;
	}
}
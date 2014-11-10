import java.util.*;
class htwt
{
	int height;
	int weight;
	htwt(int ht,int wt)
	{
		height=ht;
		weight=wt;
	}
}
public class q7
{
	ArrayList<htwt> items;
	ArrayList<htwt> maxSeq;
	ArrayList<htwt> lastFoundSeq;

	ArrayList<htwt> seqWithMaxLength(ArrayList<htwt> s1,ArrayList<htwt> s2)
	{
		return s1.size()>s2.size()?s1:s2;
	}
	int fillNextSeq(int startFrom,ArrayList<htwt> seq1)
	{	
		int firstUnfit=startFrom;
		if(firstUnfit<items.size())
		{
			for(int i=0;i<items.size();i++)
			{
				htwt item=items.get(i);
				if(i==0 || items.get(i-1).isBefore(item))
					seq.add(item);
				else
					firstUnfit=i;
			}
		}
		return firstUnfit;
	}
	void findMaxSeq()
	{
		Collections.sort(items);
		int currentUnfit=0;
		while(currentUnfit<items.size())
		{
			ArrayList<htwt> nextSeq=new ArrayList<htwt>();
			int nextUnfit=fillNextSeq(currentUnfit,nextSeq);
			maxSeq=seqWithMaxLength(maxSeq,nextSeq);
			if(nextUnfit==currentUnfit)
				break;
			else
				currentUnfit=nextUnfit;
		}
	}
	public static void main(String[] args)
	{
		htwt item1=new htwt(60,100);
		htwt item2=new htwt(70,150);
		htwt item3=new htwt(56,90);	
		htwt item4=new htwt(75,190);
		htwt item5=new htwt(60,95);
		htwt item6=new htwt(68,110);
		findMaxSeq();
	}
}
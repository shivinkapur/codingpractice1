import java.util.*;
import java.io.*;
public class Jukebox1
{
	ArrayList<Song> songList= new ArrayList<Song>();
	public static void main(String[] args)
	{
		new Jukebox1().go();
	}
	public void go()
	{
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		System.out.println(songList);
		//HashSet<Song> songSet= new HashSet<Song>();
		TreeSet<Song> songSet=new TreeSet<Song>();
		songSet.addAll(songList);
		System.out.println(songSet);
	}
	void getSongs()
	{
		try
		{
			File file=new File("songList.txt");
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line=null;
			while((line=br.readLine()) != null)
				addSong(line);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	void addSong(String lineToParse)
	{
		String tokens[]=lineToParse.split("/");
		Song nextSong=new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
		songList.add(nextSong);
	}
} 
class Song implements Comparable<Song>
{
	String title;
	String artist;
	String bpm;
	String rating;
	Song(String t,String a,String r,String b)
	{
		title=t;
		artist=a;
		rating=r;
		bpm=b;
	}
	public String getTitle()
	{
		return title;
	}
	public String getArtist()
	{
		return artist;
	}
	public String getRating()
	{
		return rating;
	}
	public String getBpm()
	{
		return bpm;
	}
	public String toString()
	{
		return title;
	}
	public int compareTo(Song s)
	{	
		return title.compareTo(s.getTitle());
	}
	public int hashCode()
	{
		return title.hashCode();
	}
	public boolean equals(Object aSong)
	{
		Song s=(Song)aSong;
		return getTitle().equals(s.getTitle());
	}
}
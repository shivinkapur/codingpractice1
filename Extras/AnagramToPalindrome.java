import java.util.*;
public class AnagramToPalindrome
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        if( checkPalindrome(input) )
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean checkPalindrome(String input)
    {
        int [] count = new int[26];
        for( int i = 0; i < input.length(); i++ )
        {
            char ch = input.charAt(i);
            count[ch-'a']++;
        }
        int oddOccur = 0;
        for( int cnt:count )
        {
            if( oddOccur > 1)
                return false;
            if( cnt%2 == 1 )
                oddOccur++;
        }
        return true;
    }
}
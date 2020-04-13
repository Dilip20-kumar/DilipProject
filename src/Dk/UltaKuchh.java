package Dk;
import java.util.HashSet;
import java.util.Set;
public class UltaKuchh 
{

	public static void main(String[] args)
	{
		String s = "ABC";
		
		System.out.println("permutation is: " + set(s));
	}
 
	public static Set<String>set(String s) 
	{
		Set<String> set = new HashSet<String>();
		if (s == null) 
		{
			return null;
		} 
		else if (s.length() == 0) 
		{
			set.add("");
			return set;
		}
 
		char firstChar = s.charAt(0);
		String rem = s.substring(1);
		Set<String> words = set(rem);
		for (String newString : words) 
		{
			for (int i = 0; i <= newString.length(); i++) 
			{
				set.add(setCharAdd(newString, firstChar, i));
			}
		}
		return set;
	}
 
	public static String setCharAdd(String str, char c, int i)//any interger type we can take j or anythiing 
	{
		String first = str.substring(0, i);
		String last = str.substring(i);
		return first + c + last;
	}
 
}

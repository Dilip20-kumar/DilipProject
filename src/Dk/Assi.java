package Dk;

public class Assi 
{
	public static void main(String[] args)
	{
		String s1="J1a9n94";
		
		splitString(s1);
	}
	static void splitString( String s1)
	{
		StringBuffer alpha=new StringBuffer();
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isAlphabetic(s1.charAt(i)))
				alpha.append(s1.charAt(i));
		 }
			System.out.println(alpha);
		 
		   }	
  }


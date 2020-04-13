package Dk;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Fetch 
{

	public static void main(String[] args)
	{
   String s1="developer";
   int count=0;
   Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
   {
	   for(int i=0;i<s1.length();i++)
	    {
		  char ch=s1.charAt(i);
		   if(m.containsKey(ch))
		   {
			   m.put(ch,m.get(ch)+1);
		   }
		   else
		   {
			   m.put(ch,1);
			  
		   }
	   }
	    System.out.println("the frequency is"+m.entrySet());
   }
	}
}
   
    	
    	  
      
 
   
    


	



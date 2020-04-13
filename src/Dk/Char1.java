package Dk;

public class Char1
{
	public static void main(String[] args) 
	{
		int count=0;
		String s1="developer";
		int len=s1.length();
		String s2=" ";
		for(int i=0;i<=len-1;i++)
		{
			char ch=s1.charAt(i);
           int index=s2.indexOf(ch);
            
           if(index==-1)
           {
        	   s2=s2+ch;
        	   
        	   count++;
           }
		}
		System.out.println(s2);
		System.out.println(count);
	
       
        	   }
           }
		
		
	



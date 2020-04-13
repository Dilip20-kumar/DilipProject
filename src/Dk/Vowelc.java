package Dk;
import java.util.Scanner;
public class Vowelc 
{

	public static void main(String[] args)
	{
			int count=0;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a string : ");
			String s=sc.nextLine();	
			System.out.println("Vowels in a string are"); 
			for(int j=0;j<s.length();j++)
			{
			char ch=s.charAt(j);	
			switch(ch)
			{
			 case  'a' :
			 case 'e'  :
			 case 'i'   :
			 case 'o'  :
			 case 'u'  :
			 case  'A' :
			 case 'E'  :
			 case 'I'   :
			 case 'O'  :	
			 case 'U'  :
				 count=1;
				 
				System.out.println(ch); 
				
				
			}	
			}
			if(count==0)
			{
			System.out.println("There are no vowels in a string"); 
			
			}
			for(int i=0;i<s.length();i++)
			{
				char ch = s.charAt(i);
	            if(ch == 'a' || ch == 'e' || ch == 'i'
	                || ch == 'o' || ch == 'u')
	            {
	                count++;
	            }
	                System.out.println(count);
			}
			}
		
		 }

		

	



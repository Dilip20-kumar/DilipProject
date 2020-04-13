package Dk;

public class Divide
{
	    public static void main(String[] args) 
	    {  
	    	
	    	String text="Abbbcbbdbbbbef";
             public static int count(String)
             {
	    	 int c=0;
	    	 String found="bb";
	    	  for(int j=0; j<text.length();j++){
	    	      if(text.contains(found))
	    	      {
	    	          c=c+1;
	    	          
	    	      }
	    	  }
	    	  System.out.println("counter="+c);
	    }
}
	
	



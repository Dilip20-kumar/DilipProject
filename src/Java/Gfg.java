package Java;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Gfg {

	public static void main(String[] args)
	{
		        Scanner sc = new Scanner(System.in);
		        int t = sc.nextInt();
		        
		        while(t-- > 0)
		        {
		            int n = 0, res = 0;
		            n = sc.nextInt();
		            
		            int x;
		            for(int i = 1; i < n; i++)
		            {
		                  x = sc.nextInt();
		                res = res^x;
		                res = res^i;
		                
		            }
		           System.out.println(res^n);
		            
		        }
		    }
		}


	



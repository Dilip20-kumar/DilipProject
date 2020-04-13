package java1213;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee1
{
			 String ename;
			 int eid;
			 int esal; 
			 Employee1(String ename,int eid,int esal)
			 {
			 this.ename=ename;  
			 this.eid=eid;  
			 this.esal=esal; 
			 }
		}
			 class Run1
			{
			@SuppressWarnings("unchecked")
			public static void main(String[] args)
			{
				ArrayList<Employee1 > al=new ArrayList<Employee1 >(); 
				 al.add(new Employee1("pritam",101,1000));
				 al.add(new Employee1("raghu",102,10000));
				 al.add(new Employee1("Zakeer",103,40000));
				 al.add(new Employee1("pooja",104,50000));
				 System.out.println("+++++++ salry compare");
				 salCompare com=new salCompare();
				 Collections.sort(al,com);
				 for(Employee1 e:al)
				 {
				  System.out.println(e.ename+","+e.eid+","+e.esal);
				 }
				  System.out.println("+++++++ name compare");
				nameCompare com1=new nameCompare();
				Collections.sort(al,com1);
				for(Employee1 e:al)
				 {
				  System.out.println(e.ename+","+e.eid+","+e.esal);
				 }
			   
		     }
			}
		 class salCompare implements Comparator
		 {
		  public int compare(Object o1, Object o2)
		 	{
		 	 Employee1 e1=(Employee1)o1;	
		 	 Employee1 e2=(Employee1)o2;
		 	  if(e1.esal>e2.esal)
		 		{
		 		 return 1;
		 		}
		 	  else if(e1.esal<e2.esal)
		 		{
		 		 return -1;
		 		 }
		 	  else
		 		{
		 		return 0;
		 		}
		 	}
		 }
		 		
		  class nameCompare implements Comparator<Employee1> 
		   {
		 	public int compare(Employee1 e1,Employee1 e2)
		 	{
		 	 return e1.ename.compareTo(e2.ename);
		 	}
		    

			



	}



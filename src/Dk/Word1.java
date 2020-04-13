package Dk;

public class Word1 
{

	public static void main(String[] args) 
	{
		String s1="big black dog in big black house";
		String[] s2=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			int count=1;
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i].equals(s2[j]))
				{
					count++;
				}
			}
			if(count>1 && s2[i]!="0")
			{
				System.out.println(s2[i]);
			}
		}

	}

}

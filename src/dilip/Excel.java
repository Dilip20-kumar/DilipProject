package dilip;

import org.testng.annotations.Test;

public class Excel
{
  public static Object setDta(String string1, int i, int j, String string) 
	{
		return null;
	}

	@Test
	public void login()
	{
		Object val=Excel.getData("Sheet1",2,3);
		System.out.println(val);
		Excel.setDta("Sheet1",2,9,"pass");
		
	}

	public static Object getData(String string, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}

   package Practice1;

import org.testng.annotations.Test;

import dilip.Excel;

public class Excell1
{
	@Test
	public void login()
	{
		Object val=Excel.getData("Sheet1",2,3);
		System.out.println(val);
		Excel.setDta("Sheet1", 2, 7, "pass");

	}

}
 
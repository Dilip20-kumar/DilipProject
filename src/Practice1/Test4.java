package Practice1;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test4 
{
	public static string[]getAllColData[String sheetName,int colName]
			{
		 String[]s1=null;
		 try
		 {
			FileInputStream fis =new FileInputStream("C:\\Users\\Admin\\Desktop\\sheet.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet(sheetName)
		 }
			}

}

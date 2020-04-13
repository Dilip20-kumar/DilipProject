package dilip;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read 
{
	public static void getData(String SheetName,int rowNum, int colNum, boolean data)
	{
		try
		{
		FileInputStream	fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\sheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(SheetName);
		XSSFRow row=sheet.getRow(rowNum);
		XSSFCell cell=row.createCell(colNum);
		cell.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\sheet.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("Sucess");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

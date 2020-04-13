package Practice1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Test6
{
	private static final int rowNum = 0;

	public static Object SetData(String sheetName,int rowName,int colName,String data)
	{

	try
	{
		FileInputStream	fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\sheet.xlsx");
		XSSFWorkbook workbook	=new XSSFWorkbook(fis); //load the excell sheet into the workbook
		
	XSSFSheet sheet=workbook.getSheet(sheetName); //got to sheet
	XSSFRow row=sheet.getRow(rowNum);
	XSSFCell cell=row.createCell(colName);
	cell.setCellType(org.apache.poi.ss.usermodel.CellType.STRING);
	
	cell.setCellValue(data);
	FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\sheet.xlsx");
	workbook.write(fos);
	fos.close();
         
          }
	 
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return data;


}
}

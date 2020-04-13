package Practice1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test5
{
	public static void setData(String sheetName,int rowNum,int colNum,String data, CellType cellType)
	{
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\sheet.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet(sheetName);
			XSSFRow row=sheet.getRow(rowNum);
			XSSFCell cell=row.createCell(colNum);
			cell.setCellType(cellType);
			cell.setCellValue(data);
			FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\sheet.xlsx");
			workbook.write(fos);
			fos.close();
			System.out.println("sucess");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			
			
		}
	}

}

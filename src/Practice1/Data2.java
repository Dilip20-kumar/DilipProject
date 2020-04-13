package Practice1;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Data2 
{
	public static Object[] getAllRowData(String SheetName,int rowNum)
	{
		Object[] o1=null;
		try
		{
			FileInputStream	fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\");//(opon excelsheet in read mode)
			XSSFWorkbook workbook	=new XSSFWorkbook(fis); //load the excell sheet into the workbook
			
		XSSFSheet sheet=workbook.getSheet(SheetName); //got to sheet
		XSSFRow row=sheet.getRow(rowNum);
		int cellNum=row.getLastCellNum();
		   o1=new Object[cellNum];
		 for(int i=0;i<cellNum;i++)
		 {
			XSSFCell cell=row.getCell(i);
	       org.apache.poi.ss.usermodel.CellType celltype=cell.getCellType();
	         switch(celltype)
	          {
	            case STRING:
		          o1[i]=cell.getStringCellValue();
		          break;
	            case NUMERIC:
	               o1[i]=cell.getNumericCellValue();
	               break;
	            case BOOLEAN:
	            	o1[i]=cell.getBooleanCellValue();
	            	break;
	          }
		 }
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return o1;
	

			
			
		 }
		
			
			
		}
	



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class ExcelRead {
	public static void main(String []args) throws FileNotFoundException,IOException{
		
		/* File src=new File("filepath/excelsheetname.xlsx");

	    FileInputStream fis=new FileInputStream(src);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1= wb.getSheetAt(0);
		System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());

		System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());

        System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());

		System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
				 }		  	
}*/

	FileInputStream file=new FileInputStream("C:\\Users\\Seenu\\OneDrive\\Desktop\\Book2.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("Sheet1"); //providing sheet name
			//int rowcount=sheet.getLastRowNum(); //return row count
			//int colcount=sheet.getRow(0).getLastCellNum();//return columns
			//String value;
			/*for(int i=0;i<rowcount;i++)
			{
				XSSFRow currentrow=sheet.getRow(i);
				for(int j=0;j<colcount;j++)
				{
					 value=currentrow.getCell(j).toString(); //read the value from a cell
					 System.out.println(value);
				}
			}*/
			System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());

			System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());

	        System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
           
			System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());

	}
}

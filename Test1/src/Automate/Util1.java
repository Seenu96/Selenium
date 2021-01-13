package Automate;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Util1 {
	public Object[][] ReadData() throws IOException{
		Object[][] excelData=null;
		int startrow=1;
		int startcell=0;
		String testdataurl="C:\\Users\\Seenu\\OneDrive\\Desktop\\Book2.xlsx";
		FileInputStream file=new FileInputStream(testdataurl);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		 int rowcount=sheet.getLastRowNum();
		 int colcount=sheet.getRow(0).getLastCellNum();
		 excelData=new Object[rowcount][colcount];
		 int row=0;
		 for(int i=startrow;i<=rowcount;i++,row++)
		 {
			 try {
			 int col=0;
			 for(int j=startcell;j<colcount;j++,col++)
			 {
				 excelData[row][col]=sheet.getRow(i).getCell(j).toString(); 
			 }
			 }
			 catch(NullPointerException NPE)
			 {
				 NPE.printStackTrace();
			 }
		 }
		return excelData;
	}

}

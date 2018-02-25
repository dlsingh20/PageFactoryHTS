package FirstClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		excel();
	}
	
	public static void excel() throws IOException
	{
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("TestData");
		for(int i=1; i<=10; i++)
		{
			XSSFRow row= sh.createRow(i-1);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue("TestCase"+i);
			
		}
		
		FileOutputStream fo = new FileOutputStream(new File("C:\\Users\\sony\\Desktop\\TestData.xlsx"));
		wb.write(fo);
		fo.close();
	}

}

package TwentythWeekend;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAndPro {

	public static void main(String[] args) throws IOException {
		readExcel();
		//readProp();
	}
	
	public static void readExcel() throws IOException
	{
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\sony\\Desktop\\TestData.xlsx"));
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Data1");
		
		//org.apache.poi.ss.usermodel.Cell Cell;
		XSSFCell Cell = sh.getRow(0).getCell(0);

		Cell.setCellType(Cell.CELL_TYPE_STRING);
		//Cell.setCellType(Cell.CELL_TYPE_STRING);
		
		String data = Cell.getStringCellValue();
		System.out.println(data);
		//String str = sh.getRow(1).getCell(1).getStringCellValue();
		//System.out.println(str);
		
	}
	
	public static void readProp() throws IOException
	{
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\sony\\Desktop\\tte.properties"));
		
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("login"));
				
	}

}

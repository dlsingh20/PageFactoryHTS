package AbstractionExe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashmapTest {	
	public static HashMap readExcel(int r) throws IOException
	{
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\sony\\Desktop\\TestData.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		Row row = sh.getRow(r);
		int size = row.getLastCellNum();
		
		HashMap<String, String> HM = new HashMap<>();
				
		for(int i=1; i<=size-1; i=i+2)
		{
			XSSFCell cell = (XSSFCell) row.getCell(i);
			cell.setCellType(cell.CELL_TYPE_STRING);
			String keyName = cell.getStringCellValue();
			
			cell = (XSSFCell) row.getCell(i+1);
			cell.setCellType(cell.CELL_TYPE_STRING);
			String keyValue = cell.getStringCellValue();
			HM.put(keyName, keyValue);
		}
		return HM;		
	}
	

	public static void main(String[] args) throws IOException {
		HashMap<String, String> hm = readExcel(2);
		System.out.println(hm.get("InvoiceID"));
		System.out.println(hm.get("State"));
				
	}

}

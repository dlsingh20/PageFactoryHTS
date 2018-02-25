package TuesdayExe;

import java.io.File;
import java.io.FileInputStream;

public class ExecptionExe {

	public static void main(String[] args)  {
		test();

	}
	
	public static void test() 
	{
		try {
			File file  = new File("D:\\Users\\din\\Desktop\\O.png");
			FileInputStream fis = new FileInputStream(file);
		} catch (Exception e) {
			e.toString();
		}
		
		
		
	}

}

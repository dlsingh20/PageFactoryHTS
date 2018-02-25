package ClassObjExe;

import java.util.Calendar;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class GetDateTime {

	public static void main(String[] args) {
	System.out.println(getCurrentDate());

	}
	
	public static int getCurrentDate()
	{
		Date dt = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt); // don't forget this if date is arbitrary e.g. 01-01-2014

		
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH); // 17
		
		return dayOfMonth;
	}

}

package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		System.out.println("Time: "+calendar.getTime());
		System.out.println("Calendar Time in millis: "+calendar.getTimeInMillis());
		System.out.println("System Time in millis: "+System.currentTimeMillis());
		SimpleDateFormat dateFormatter=new SimpleDateFormat("dd-MM-yy");
		System.out.println("Date Formatter: "+dateFormatter.format(new Date(2017,05,23)));
	}

}

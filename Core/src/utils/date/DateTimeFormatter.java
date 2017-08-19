package utils.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateAsString;
		String timeStamp="2017-08-16T02:29:56Z";
		try{
            SimpleDateFormat dateFormat=new SimpleDateFormat(DateTimeConstants.dateFormat_ddMMMyyyy);
            dateAsString=dateFormat.format(new Date());
            System.out.println("dateAsString: "+dateAsString);
        }catch (Exception e){
        	System.out.println("Exception during dateFormat"+e.toString());
        }
		
		try {
            Date date = new SimpleDateFormat(DateTimeConstants.timeStampWithZ).parse(timeStamp);
            String defaultTimezone = TimeZone.getDefault().getID();
            System.out.println("Server Timestamp:" + date + "\n");
        }catch (Exception e){
        	System.out.println("Exception: "+e.toString());
        }
	}

}

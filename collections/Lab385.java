//Demo on Date and Calendar utility class
import java.util.*;
import java.text.*;
public class Lab385{
public static void main(String args[]){
	
	Date date = new Date();
	System.out.println(date);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	System.out.println("Formatted Date::"+sdf.format(new Date()));
	
	Calendar cal = Calendar.getInstance();
	System.out.println(cal);
	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	System.out.println("Hour::"+cal.get(Calendar.HOUR_OF_DAY));
	System.out.println("Minutes::"+cal.get(Calendar.MINUTE));
	
	Calendar cal1 = Calendar.getInstance();
	cal1.set(2018,6,10);
	//cal1.setTime(new Date());
	System.out.println(cal1);
	
	//comparing two dates
    System.out.println(cal.before(cal1));
    System.out.println(cal.after(cal1));	
	
}
}
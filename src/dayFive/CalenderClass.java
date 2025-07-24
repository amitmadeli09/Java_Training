package dayFive;
import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {
		//using calendar class
		Calendar calendar = Calendar.getInstance();
		System.out.println("Current Date and Time: "+calendar.getTime());
		
		//set the date and time
		calendar.set(calendar.YEAR, 2025);
		calendar.set(calendar.MONTH,6);
		calendar.set(calendar.DAY_OF_MONTH, 26);
		System.out.println("Specific Date: "+calendar.getTime());
		
		//modifing the date,month and year
		calendar.add(calendar.MONTH, 1);
		System.out.println("1 month Added:"+calendar.getTime());
		calendar.add(calendar.YEAR, -1);
		System.out.println("1 Year Subtracted"+calendar.getTime());
		calendar.add(calendar.DAY_OF_MONTH, 10);
		System.out.println("10 days Added: "+calendar.getTime());
		
	}

}

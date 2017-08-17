package java7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
	// Do not use Date methods – they are deprecated
	System.out.println("Using Date class");
	Date date = new Date();
	System.out.println(date);
	System.out.println();

	// Use Calendar get(...)
	System.out.println("Using Calendar class");
	Calendar calendar = Calendar.getInstance();
	System.out.println(calendar.getTime());
	System.out.println("DAY_OF_MONTH = " + calendar.get(Calendar.DAY_OF_MONTH));
	System.out.println("DAY_OF_WEEK = " + calendar.get(Calendar.DAY_OF_WEEK));
	System.out.println("YEAR = " + calendar.get(Calendar.YEAR));
	System.out.println("MONTH = " + calendar.get(Calendar.MONTH));

	System.out.printf("%s-%s-%s", calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH),
		calendar.get(Calendar.YEAR));
	System.out.println();
	System.out.println();

	// Manipulating Date
	System.out.println("Manipulating Date");
	Calendar cal = Calendar.getInstance();
	cal.setTime(date);
	System.out.println(cal.getTime());
	cal.add(Calendar.DATE, 3);
	System.out.println(cal.getTime());
	cal.add(Calendar.YEAR, -5);
	System.out.println(cal.getTime());
	System.out.println();

	// Formatting Date
	System.out.println("Formatting Date");
	Date now = new Date();
	System.out.println(now);
	System.out.println(DateFormat.getInstance().format(now));
	System.out.println(DateFormat.getTimeInstance().format(now));
	System.out.println(DateFormat.getDateTimeInstance().format(now));

	System.out.println(DateFormat.getTimeInstance(DateFormat.SHORT).format(now));
	System.out.println(DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now));
	System.out.println(DateFormat.getTimeInstance(DateFormat.LONG).format(now));

	System.out.println(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(now));
	System.out.println(DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(now));
	System.out.println(DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(now));

	System.out.println();

	// Java.text.SimpleDateFormat
	System.out.println("Java.text.SimpleDateFormat");
	SimpleDateFormat format1 = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
	System.out.println(format1.format(now));
	SimpleDateFormat format2 = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
	System.out.println(format2.format(now));

    }
}

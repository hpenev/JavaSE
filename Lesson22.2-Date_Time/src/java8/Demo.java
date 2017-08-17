package java8;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;

public class Demo {
    public static void main(String[] args) {

	// https://dzone.com/articles/deeper-look-java-8-date-and

	LocalDate date = LocalDate.now();
	LocalTime time = LocalTime.now();
	LocalDateTime dateTime = LocalDateTime.now();

	System.out.println("Today is " + date);
	System.out.println("Time is " + time);
	System.out.println("Date and time is " + dateTime);

	System.out.println("Day of month is " + date.getDayOfMonth());
	System.out.println("Day of week is " + date.getDayOfWeek());
	System.out.println("Day of week is " + date.getDayOfWeek().getValue());
	System.out.println("Day of year is " + date.getDayOfYear());

	System.out.println("Year is " + date.getYear());
	System.out.println("Month is " + date.getMonth());
	System.out.println("Month is " + date.getMonthValue());

	// Manipulating Date in Java 8
	Period fiveDays = Period.ofDays(5);
	Period threeMonths = Period.ofMonths(3);
	System.out.println(date.plus(fiveDays));
	System.out.println(date.minus(threeMonths));
	System.out.println(date);

	Duration threeHours = Duration.ofHours(3);
	Duration fiveSeconds = Duration.ofSeconds(5);
	System.out.println(time);
	System.out.println(time.plus(threeHours));
	System.out.println(time.minus(fiveSeconds));

	// the current date
	LocalDate currentDate = LocalDate.now();
	// 2014-02-10
	LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY, 10);
	// months values start at 1 (2014-08-01)
	LocalDate firstAug2014 = LocalDate.of(2014, 8, 1);
	// the 65th day of 2010 (2010-03-06)
	LocalDate sixtyFifthDayOf2010 = LocalDate.ofYearDay(2010, 65);

	LocalTime currentTime = LocalTime.now(); // current time
	LocalTime midday = LocalTime.of(12, 0); // 12:00
	LocalTime afterMidday = LocalTime.of(13, 30, 15); // 13:30:15

	// 12345th second of day (03:25:45)
	LocalTime fromSecondsOfDay = LocalTime.ofSecondOfDay(12345);
	// dates with times, e.g. 2014-02-18 19:08:37.950
	LocalDateTime currentDateTime = LocalDateTime.now();
	// 2014-10-02 12:30
	LocalDateTime secondAug2014 = LocalDateTime.of(2014, 10, 2, 12, 30);
	// 2014-12-24 12:00
	LocalDateTime christmas2014 = LocalDateTime.of(2014, Month.DECEMBER, 24, 12, 0);

	date = LocalDate.of(2014, 2, 15); // 2014-06-15
	boolean isBefore = LocalDate.now().isBefore(date); // false
	// information about the month
	Month february = date.getMonth(); // FEBRUARY
	int februaryIntValue = february.getValue(); // 2
	int minLength = february.minLength(); // 28
	int maxLength = february.maxLength(); // 29
	Month firstMonthOfQuarter = february.firstMonthOfQuarter(); // JANUARY
	// information about the year
	int year = date.getYear(); // 2014
	int dayOfYear = date.getDayOfYear(); // 46
	int lengthOfYear = date.lengthOfYear(); // 365
	boolean isLeapYear = date.isLeapYear(); // false
	DayOfWeek dayOfWeek = date.getDayOfWeek();
	int dayOfWeekIntValue = dayOfWeek.getValue(); // 6
	String dayOfWeekName = dayOfWeek.name(); // SATURDAY
	int dayOfMonth = date.getDayOfMonth(); // 15
	LocalDateTime startOfDay = date.atStartOfDay(); // 2014-02-15 00:00
	// time information
	time = LocalTime.of(15, 30); // 15:30:00
	int hour = time.getHour(); // 15
	int second = time.getSecond(); // 0
	int minute = time.getMinute(); // 30
	int secondOfDay = time.toSecondOfDay(); // 55800

	Year currentYear = Year.now();
	Year twoThousand = Year.of(2000);
	boolean isLeap = currentYear.isLeap(); // false
	int length = currentYear.length(); // 365
	// sixtyFourth day of 2014 (2014-03-05)
	date = Year.of(2014).atDay(64);

	LocalDate tomorrow = LocalDate.now().plusDays(1);
	// before 5 houres and 30 minutes
	dateTime = LocalDateTime.now().minusHours(5).minusMinutes(30);
    }
}

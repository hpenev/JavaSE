package bookChapter16_methods;

public class Task04 {
    public static void main(String[] args) {
	String month = "February1";
	int year = 2017;
	System.out.println(days(month, year));

    }

    static int days(String month, int year) {
	boolean leapYar = (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0));
	int days = 0;

	switch (month.toLowerCase()) {
	case "january":
	case "march":
	case "may":
	case "july":
	case "august":
	case "october":
	case "december":
	    days = 31;
	    break;
	case "february":
	    if (leapYar) {
		days = 29;
	    } else {
		days = 28;
	    }
	    break;
	case "april":
	case "june":
	case "september":
	case "november":
	    days = 30;
	    break;
	default:
	    days = -1;
	    break;
	}

	return days;

    }
}

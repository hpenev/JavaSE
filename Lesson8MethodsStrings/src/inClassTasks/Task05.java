package inClassTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Write a function to convert Roman Number in Decimal
Format

online converter and Roman numerals conversion table
http://www.rapidtables.com/convert/number/roman-numerals-converter.htm

original solution: http://www.geeksforgeeks.org/converting-roman-numerals-decimal-lying-1-3999/
*/

public class Task05 {
    public static void main(String[] args) {
	// XVX - invalid format
	// IIIX - invalid format
	// XXXVIII = 38
	// XLIX = 49
	// LXXXIX = 89

	String romanNubmer = "XIV";

	String regex = "^(?=[MDCLXVI])M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(romanNubmer);

	if (matcher.matches()) {
	    System.out.println(romanToDecimal(romanNubmer));
	} else {
	    System.out.println("Invalid Number");

	}
    }

    static int romanToDecimal(String str) {
	// Just in case
	str = str.toUpperCase();

	// Initialize result
	int result = 0;

	for (int i = 0; i < str.length(); i++) {
	    // Getting value of symbol s[i]
	    int s1 = value(str.charAt(i));

	    // Getting value of symbol s[i+1]
	    if (i + 1 < str.length()) {
		int s2 = value(str.charAt(i + 1));

		// Comparing both values
		if (s1 >= s2) {
		    // Value of current symbol is greater
		    // or equal to the next symbol
		    result = result + s1;

		} else {
		    // Value of current symbol is
		    // less than the next symbol
		    result = result + s2 - s1;
		    // skipping the next symbol
		    // already got in mind
		    i++;
		}
	    } else {
		result = result + s1;
		// skipping the next symbol
		// already got in mind
		i++;
	    }
	}
	return result;
    }

    static int value(char r) {
	if (r == 'I') {
	    return 1;
	}
	if (r == 'V') {
	    return 5;
	}
	if (r == 'X') {
	    return 10;
	}
	if (r == 'L') {
	    return 50;
	}
	if (r == 'C') {
	    return 100;
	}
	if (r == 'D') {
	    return 500;
	}
	if (r == 'M') {
	    return 1000;
	}
	return -1;
    }
}

package season6Test1v1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int trys = 0;

	do {
	    System.out.println("Enter two cards separated by space.");
	    char card1 = sc.next().charAt(0);
	    char card2 = sc.next().charAt(0);
	    trys++;

	    if (!validCard(card1) || !validCard(card2)) {
		System.out.println("Invalid cards given!");
		continue;
	    }

	    if (isA(card1) && isA(card2)) {
		System.out.println("Number of tries : " + trys);
		break;
	    }
	} while (true);
	sc.close();
    }

    static boolean isA(char card) {
	if (card == 'A') {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean validCard(char card) {
	switch (card) {
	case 'A':
	case 'K':
	case 'Q':
	case 'J':
	case 'T':
	case '9':
	case '8':
	case '7':
	case '6':
	case '5':
	case '4':
	case '3':
	case '2':
	    return true;
	default:
	    return false;
	}
    }

    static boolean has2Cards(String[] input) {
	if (input.length == 2) {
	    return true;
	} else {
	    return false;
	}
    }
}

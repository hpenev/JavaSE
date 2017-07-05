package season8Test1v1;

/*
7s 8s 9s Tc Jc
*/

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	do {
	    String[] cards = sc.nextLine().split(" ");

	    if (!validCards(cards)) {
		System.out.println("Invalid input");
		continue;
	    }
	    if (hasTertza(cards)) {
		break;
	    }
	} while (true);
	sc.close();

    }

    static boolean hasTertza(String[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr.length; j++) {
		for (int k = 0; k < arr.length; k++) {
		    int c1 = cardWeight(arr[i].charAt(0));
		    int c2 = cardWeight(arr[j].charAt(0));
		    int c3 = cardWeight(arr[k].charAt(0));

		    if (c1 + 1 == c2 && c2 + 1 == c3) {
			if (arr[i].charAt(1) == arr[j].charAt(1) && arr[i].charAt(1) == arr[k].charAt(1)) {
			    System.out.println("Tertza: " + c1 + " " + c2 + " " + c3 + " " + arr[i].charAt(1));
			    return true;
			}
		    }
		}
	    }
	}
	return false;
    }

    static boolean validCards(String[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    if (!validCard(arr[i].charAt(0)) || !validSuit(arr[i].charAt(1))) {
		return false;
	    }
	}
	return true;
    }

    static int cardWeight(char ch) {
	int result = 0;
	switch (ch) {
	case '7':
	    result = 7;
	    break;
	case '8':
	    result = 8;
	    break;
	case '9':
	    result = 9;
	    break;
	case 'T':
	    result = 10;
	    break;
	case 'J':
	    result = 11;
	    break;
	case 'Q':
	    result = 12;
	    break;
	case 'K':
	    result = 13;
	    break;
	case 'A':
	    result = 14;
	    break;
	}
	return result;
    }

    static boolean validSuit(char ch) {
	switch (ch) {
	case 'h':
	case 'd':
	case 'c':
	case 's':
	    return true;
	default:
	    return false;
	}
    }

    static boolean validCard(char ch) {
	switch (ch) {
	case '7':
	case '8':
	case '9':
	case 'T':
	case 'J':
	case 'Q':
	case 'K':
	case 'A':
	    return true;
	default:
	    return false;
	}
    }
}

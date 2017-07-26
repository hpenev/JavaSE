import java.util.Scanner;

public class cards {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int count = 0;
	int trys = 0;
	do {
	    System.out.print("Enter two cards: ");
	    String[] input = sc.nextLine().split(" ");
	    trys++;

	    if (has2Cards(input) && validCard(input[0]) && validCard(input[1])) {
		if (hasA(input) && cardMoreThan10(input)) {
		    System.out.println("Strong hand");
		    count++;
		} else {
		    System.out.println("Weak hand");
		    count = 0;
		}
	    } else {
		count = 0;
		System.out.println("Wrong input");
		continue;
	    }
	} while (count < 5);

	System.out.println("trys: " + trys);
	System.out.println("You have entered 5 strong hands");

	sc.close();
    }

    static boolean has2Cards(String[] input) {
	if (input.length == 2) {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean validCard(String card) {
	switch (card) {
	case "A":
	case "K":
	case "Q":
	case "J":
	case "10":
	case "9":
	case "8":
	case "7":
	case "6":
	case "5":
	case "4":
	case "3":
	case "2":
	    return true;
	default:
	    return false;
	}
    }

    static boolean hasA(String[] cards) {
	if (cards[0].equals("A") || cards[1].equals("A")) {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean cardMoreThan10(String[] cards) {
	boolean result1 = false;
	boolean result2 = false;

	switch (cards[0]) {
	case "A":
	case "K":
	case "Q":
	case "J":
	case "10":
	    result1 = true;
	    break;
	}

	switch (cards[1]) {
	case "A":
	case "K":
	case "Q":
	case "J":
	case "10":
	    result2 = true;
	    break;
	}

	if (result1 && result2) {
	    return true;
	} else {
	    return false;
	}
    }

    static int cardWeight(String card) {
	int result = 0;
	switch (card) {
	case "A":
	    result = 14;
	    break;
	case "K":
	    result = 13;
	    break;
	case "Q":
	    result = 12;
	    break;
	case "J":
	    result = 11;
	    break;
	case "10":
	    result = 10;
	    break;
	case "9":
	    result = 9;
	    break;
	case "8":
	    result = 8;
	    break;
	case "7":
	    result = 7;
	    break;
	case "6":
	    result = 6;
	    break;
	case "5":
	    result = 5;
	    break;
	case "4":
	    result = 4;
	    break;
	case "3":
	    result = 3;
	    break;
	case "2":
	    result = 2;
	    break;
	}
	return result;
    }
}

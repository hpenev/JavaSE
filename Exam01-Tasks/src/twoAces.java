import java.util.Scanner;

public class twoAces {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int trys = 0;

	do {
	    System.out.println("Enter two cards separated by space.");
	    String[] input = sc.nextLine().split(" ");
	    trys++;

	    if (!has2Cards(input) || !validCard(input[0]) || !validCard(input[1])) {
		System.out.println("Incorrect input");
		continue;
	    }

	    if (has2A(input)) {
		System.out.println("Great! Trys: " + trys);
		break;
	    } else {
		System.out.println("Not two Aces");
	    }
	} while (true);
	sc.close();
    }

    static boolean has2A(String[] input) {
	if (input[0].equals("A") && input[1].equals("A")) {
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

    static boolean has2Cards(String[] input) {
	if (input.length == 2) {
	    return true;
	} else {
	    return false;
	}
    }
}

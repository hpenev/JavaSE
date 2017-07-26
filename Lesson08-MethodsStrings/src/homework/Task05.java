package homework;

public class Task05 {
    public static void main(String[] args) {

	// Scanner sc = new Scanner(System.in);
	// System.out.print("Enter first word: ");
	// String firstWord = sc.nextLine();
	// System.out.print("Enter second word: ");
	// String secondWord = sc.nextLine();
	// sc.close();

	String firstWord = "google";
	String secondWord = "book";

	boolean containSameChar = false;
	for (int i = 0; i < firstWord.length(); i++) {
	    for (int j = 0; j < secondWord.length(); j++) {

		if (firstWord.charAt(i) == secondWord.charAt(j)) {
		    containSameChar = true;
		}
	    }
	}

	if (containSameChar) {
	    firstCrossigPoint(firstWord, secondWord);
	    System.out.println();
	    lastCrossingPoint(firstWord, secondWord);

	} else {
	    System.out.println("Both strings does not contain the same char");
	}

    }

    static void firstCrossigPoint(String firstWord, String secondWord) {
	int tab = 0;
	int row = 0;
	boolean foundFirstCrossigPoint = false;
	for (int i = 0; i < firstWord.length(); i++) {
	    for (int j = 0; j < secondWord.length(); j++) {
		if (firstWord.charAt(i) == secondWord.charAt(j)) {
		    tab = j;
		    row = i;
		    foundFirstCrossigPoint = true;
		    break;
		}
	    }
	    if (foundFirstCrossigPoint) {
		break;
	    }
	}

	for (int i = 0; i < firstWord.length(); i++) {
	    if (row == i) {
		System.out.println(secondWord);
		continue;
	    }
	    String firstWordVertical = stringRepeat(" ", tab);
	    firstWordVertical += firstWord.charAt(i);
	    System.out.println(firstWordVertical);
	}
    }

    static void lastCrossingPoint(String firstWord, String secondWord) {
	int tab = 0;
	int row = 0;
	for (int i = 0; i < firstWord.length(); i++) {
	    for (int j = 0; j < secondWord.length(); j++) {
		if (firstWord.charAt(i) == secondWord.charAt(j)) {
		    tab = j;
		    row = i;
		}
	    }
	}

	for (int i = 0; i < firstWord.length(); i++) {
	    if (row == i) {
		System.out.println(secondWord);
		continue;
	    }
	    String firstWordVertical = stringRepeat(" ", tab);
	    firstWordVertical += firstWord.charAt(i);
	    System.out.println(firstWordVertical);
	}
    }

    static String stringRepeat(String string, int repeat) {
	String result = new String();
	for (int i = 0; i < repeat; i++) {
	    result += string;
	}
	return result;
    }
}

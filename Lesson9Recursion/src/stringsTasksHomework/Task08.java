package stringsTasksHomework;
/*
8. На някои мобилни телефони английската азбука се получава от
натискане на клавишите по следния начин: ABC(2), DEF(3),
GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
Напишете програма, която приема последователност от
натискания на клавиши (цифри) и конвертира
последователността към символен низ от английски букви.
*/

public class Task08 {
    public static void main(String[] args) {
	String pressedKeys = "5 2 888 2";
	int count = 1;

	for (int i = 0; i < pressedKeys.length() - 1; i++) {

	    String key = pressedKeys.substring(i, i + 1);
	    String nextKey = pressedKeys.substring(i + 1, i + 2);
	    String lastKey = pressedKeys.substring(pressedKeys.length() - 1);

	    // for other keys
	    if (key.equals(nextKey)) {
		count++;
	    }

	    if (nextKey.equals(" ")) {
		printLetter(key, count);
		count = 1;
	    }

	    // for last key
	    if (i + 1 == pressedKeys.length() - 1) {

		if (nextKey.equals(lastKey)) {
		    printLetter(nextKey, count);
		}

		if (!nextKey.equals(lastKey)) {
		    printLetter(lastKey, count);
		}
	    }

	}
    }

    static void printLetter(String key, int count) {
	switch (key) {
	case "2":
	    if (count == 1) {
		System.out.print("A");
	    }
	    if (count == 2) {
		System.out.print("B");
	    }
	    if (count == 3) {
		System.out.print("C");
	    }
	    break;
	case "3":
	    if (count == 1) {
		System.out.print("D");
	    }
	    if (count == 2) {
		System.out.print("E");
	    }
	    if (count == 3) {
		System.out.print("F");
	    }
	    break;
	case "4":
	    if (count == 1) {
		System.out.print("G");
	    }
	    if (count == 2) {
		System.out.print("H");
	    }
	    if (count == 3) {
		System.out.print("I");
	    }
	    break;
	case "5":
	    if (count == 1) {
		System.out.print("J");
	    }
	    if (count == 2) {
		System.out.print("K");
	    }
	    if (count == 3) {
		System.out.print("L");
	    }
	    break;
	case "6":
	    if (count == 1) {
		System.out.print("M");
	    }
	    if (count == 2) {
		System.out.print("N");
	    }
	    if (count == 3) {
		System.out.print("O");
	    }
	    break;
	case "7":
	    if (count == 1) {
		System.out.print("P");
	    }
	    if (count == 2) {
		System.out.print("Q");
	    }
	    if (count == 3) {
		System.out.print("R");
	    }
	    if (count == 4) {
		System.out.print("S");
	    }
	    break;
	case "8":
	    if (count == 1) {
		System.out.print("T");
	    }
	    if (count == 2) {
		System.out.print("U");
	    }
	    if (count == 3) {
		System.out.print("V");
	    }
	    break;
	case "9":
	    if (count == 1) {
		System.out.print("W");
	    }
	    if (count == 2) {
		System.out.print("X");
	    }
	    if (count == 3) {
		System.out.print("Y");
	    }
	    if (count == 4) {
		System.out.print("Z");
	    }
	    break;
	default:
	    System.out.print("[X]");
	    break;
	}
    }
}

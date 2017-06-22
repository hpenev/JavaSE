package stringsTasksHomework;
/*
1. Напишете програма, която проверява дали даден символен низ
е префикс (начало) на друг символен низ.
*/

public class Task01 {
    public static void main(String[] args) {
	String prefix = "im";
	String word = "immposible";

	firstSolution(prefix, word);
	secondSolution(prefix, word);
    }

    private static void firstSolution(String prefix, String word) {
	int index = word.indexOf(prefix);

	switch (index) {
	case 0:
	    System.out.println("prefix");
	    break;
	case -1:
	    System.out.println("do not contain");
	    break;
	default:
	    System.out.println("contains but is not prefix");
	    break;
	}
    }

    private static void secondSolution(String prefix, String word) {
	if (word.startsWith(prefix)) {
	    System.out.println("prefix");
	} else {
	    System.out.println("do not contain");
	}
    }
}

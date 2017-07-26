package stringsTasksHomework;

/*
4. Напишете програма, която брои колко пъти се среща всяка
английска буква в даден символен низ. Запазете резултатите в
масив.
*/

public class Task04 {
    public static void main(String[] args) {
	// ascii table from 0 to 122
	int[] count = new int[123];
	String sentance = "Write a program that counts how many times each English letter meets a given string. Save the results in an array.";

	String[] words = sentance.split("\\s+");

	for (int i = 0; i < words.length; i++) {
	    for (int j = 0; j < words[i].length(); j++) {
		int index = (int) words[i].charAt(j);
		count[index]++;
	    }
	}

	// print only capital letters
	for (int i = 65; i <= 90; i++) {
	    printCharCount(i, count);
	}
	// print only small letters
	for (int i = 97; i <= 122; i++) {
	    printCharCount(i, count);
	}
    }

    static void printCharCount(int i, int[] count) {
	System.out.println((char) i + "-" + count[i] + " times");
    }
}

package season8Test1v1;

/*
Даден е текст да се изведат думите подредени по азбучен ред
*/

public class Task02 {
    public static void main(String[] args) {
	String text = "Today is a good day for test.";

	String[] words = text.toLowerCase().split(" ");

	for (int i = 0; i < words.length; i++) {
	    for (int j = 0; j < words.length - 1 - i; j++) {
		if (words[j].compareTo(words[j + 1]) > 0) {
		    String temp = words[j];
		    words[j] = words[j + 1];
		    words[j + 1] = temp;
		}
	    }
	}

	printArray(words);
    }

    static void printArray(String[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	}
    }
}

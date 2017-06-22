package stringsTasksHomework;

/*
6. Напишете програма, която конкатенира елементите на масив от
символни низове в един символен низ.
*/

public class Task06 {
    public static void main(String[] args) {
	String[] words = { "some", "words", "here" };

	String allWords = String.join(" ", words);
	System.out.println(allWords);
    }
}

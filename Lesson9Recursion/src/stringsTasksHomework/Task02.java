package stringsTasksHomework;

import java.util.Scanner;

/*
2. Напишете програма, която отпечатва на екрана инициалите на
името ви. Въведете името си от клавиатурата.

*/
public class Task02 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your name: ");

	String[] names = sc.nextLine().split("\\s+");
	sc.close();

	for (int i = 0; i < names.length; i++) {
	    // using substring because of toUpperCase
	    // another way is charAt(0)
	    System.out.print(names[i].substring(0, 1).toUpperCase() + ".");
	}
    }
}

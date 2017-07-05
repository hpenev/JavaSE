package stringTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter your name: ");
	String name = sc.nextLine();
	sc.close();
	String[] names = name.split(" ");

	for (int i = 0; i < names.length; i++) {
	    char ch = names[i].charAt(0);
	    System.out.print(Character.toUpperCase(ch) + ".");
	}

    }
}

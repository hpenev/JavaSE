package stringsTasksHomework;

import java.util.Scanner;

/*
9. Въведете неотрицателно цяло число n от клавиатурата и
конструирайте низа, който се получава от слепването на
числата 0, 1, 2, 3, … n.
*/

public class Task09 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter non negative number: ");
	int number = sc.nextInt();
	sc.close();

	StringBuilder sb = new StringBuilder();
	for (int i = 0; i <= number; i++) {
	    sb.append(i);
	}

	System.out.println(sb);
    }
}

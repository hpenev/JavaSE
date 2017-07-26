package season5Test1v1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
	int count = 0;

	Scanner sc = new Scanner(System.in);

	do {
	    String string = sc.nextLine();
	    if (string.equals("Heads")) {
		count++;
	    } else {
		count = 0;
	    }

	} while (count < 5);
	sc.close();
	System.out.println("End");

    }
}

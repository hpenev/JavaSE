package season5Test1v2;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int totalCount = 0;
	int count = 0;

	do {
	    System.out.println("Throw dices!");
	    System.out.print("first dice: ");
	    int a = sc.nextInt();
	    System.out.print("second dice: ");
	    int b = sc.nextInt();

	    totalCount++;

	    if (a + b == 7) {
		count++;
	    } else {
		count = 0;
	    }
	} while (count < 7);

	System.out.println("Total trys: " + totalCount);
	sc.close();
    }
}

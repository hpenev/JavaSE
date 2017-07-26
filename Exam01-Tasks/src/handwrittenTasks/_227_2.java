package handwrittenTasks;

import java.util.Scanner;

public class _227_2 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int x = sc.nextInt();
	sc.close();

	int count = 0;
	int index = 1;

	while (count < x) {
	    if (index % 3 == 0) {
		System.out.print(index + " ");
		count++;
	    }
	    index++;
	}
    }
}

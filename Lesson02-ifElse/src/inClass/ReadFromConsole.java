package inClass;

import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the side of the square: ");
	int a = sc.nextInt();
	int result = a * a;
	System.out.println("Area of the square is: " + result);

	sc.close();
    }
}

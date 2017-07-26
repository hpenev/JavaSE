package bookChapter16_Recursion;

import java.util.Scanner;

/*
9. Да се състави програма, която приема за входни данни две числа – x и y. Прог-
рамата да пресмята произведението на двете числа, като се използва единст-
вено операторът събиране (+). Използвайте рекурсия.
*/
public class Task09 {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int x = sc.nextInt();

	System.out.print("Enter a number: ");
	int y = sc.nextInt();

	sc.close();
	System.out.println(mul(x, y));

    }

    static int mul(int x, int y) {
	// base case: umnojenie s 1
	if (x == 1) {
	    return y;
	}
	// base case: umnojenie s pove4e ot 1
	if (x == 2) {
	    return y + y;
	}

	return y + mul(x - 1, y);
    }
}

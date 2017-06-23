package bookChapter16_Recursion;

import java.util.Scanner;

/*
10. Да се състави програма, която приема за входни данни две числа – х и y.
Програмата да пресмята стойността на xy (x на степен y), като се използва
единствено операторът събиране (+). Използвайте рекурсия.
*/

public class Task10 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int x = sc.nextInt();
	System.out.print("Enter a number: ");
	int y = sc.nextInt();

	sc.close();

	System.out.println(power(x, y));
    }

    static int power(int num, int power) {
	if (power == 0) {
	    return 1;
	}
	if (power == 1) {
	    return num;
	}

	// return x * power(x, y - 1);
	return multiply(num, power(num, power - 1));
    }

    static int multiply(int times, int num) {

	if (num == 0 || times == 0) {
	    return 0;
	}

	// base case: umnojenie s 1
	if (times == 1) {
	    return num;
	}

	// base case: umnojenie s pove4e ot 1
	if (times == 2) {
	    return num + num;
	}

	return num + multiply(times - 1, num);
    }
}

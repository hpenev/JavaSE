package bookChapter16_Recursion_v1;

/*
1. Да се състави програма, която приема за входни данни естествено число N и
изписва на екрана стойността на N! (N факториел). Факториел на число N се из-
числява чрез умножение на всички числа от 1 до N. Използвайте рекурсия.
*/

public class Task01 {
    public static void main(String[] args) {
	int number = 5;
	System.out.println(fact(number));

    }

    static int fact(int n) {
	if (n == 1) {
	    return 1;
	}

	return n * fact(n - 1);
    }
}

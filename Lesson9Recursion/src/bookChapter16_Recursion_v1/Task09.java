package bookChapter16_Recursion_v1;

/*
9. Да се състави програма, която приема за входни данни две числа – x и y. Прог-
рамата да пресмята произведението на двете числа, като се използва единст-
вено операторът събиране (+). Използвайте рекурсия.
*/

public class Task09 {
    public static void main(String[] args) {
	int result = multiTwoNums(4, 5);
	System.out.println(result);
    }

    static int multiTwoNums(int x, int y) {
	if (y == 1) {
	    return x;
	}
	return x + multiTwoNums(x, y - 1);
    }
}

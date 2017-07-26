package inClass;

//multyply by summation
//умножение чрез събиране

public class multiplyRecursion {
    public static void main(String[] args) {

	int a = 4;
	int b = 5;

	System.out.println(multiplyByPlusRecursion(a, b));
	System.out.println(multiplyByPlusIteration(a, b));

    }

    private static int multiplyByPlusIteration(int a, int b) {
	int result = 0;
	for (int i = 0; i < a; i++) {
	    result += b;
	}
	return result;
    }

    static int multiplyByPlusRecursion(int a, int b) {

	if (a == 1) {
	    return b;
	}

	return b + multiplyByPlusRecursion(a - 1, b);
    }
}

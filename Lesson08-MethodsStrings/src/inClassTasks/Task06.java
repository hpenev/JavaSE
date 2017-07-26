package inClassTasks;

/*
Write a function to find n! factorial
*/

public class Task06 {
    public static void main(String[] args) {
	int number = 5;
	System.out.println(factorial(number));
    }

    static int factorial(int n) {
	int result = 1;

	for (int i = 1; i <= n; i++) {
	    result *= i;
	}

	return result;
    }
}

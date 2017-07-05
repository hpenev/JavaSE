
public class Task09Fibonacci {
    public static void main(String[] args) {

	int fir = 0;
	int sec = 1;

	int x = 10;

	int fib = fir + sec;
	int sum = fir + sec;

	System.out.print(fir + " ");
	System.out.print(sec + " ");

	while (true) {
	    System.out.print(fib + " ");
	    fir = sec;
	    sec = fib;
	    fib = fir + sec;

	    if (!(fib < x)) {
		break;
	    }
	    sum = sum + fib;
	}

	System.out.println();
	System.out.println("sum = " + sum);
    }
}

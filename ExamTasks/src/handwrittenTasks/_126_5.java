package handwrittenTasks;

public class _126_5 {
    public static void main(String[] args) {
	System.out.println(findFib(8));
    }

    static int findFib(int n) {
	if (n == 1 || n == 2) {
	    return 1;
	}
	return findFib(n - 1) + findFib(n - 2);
    }
}

package bookChapter16_methods;

public class Task08 {
    public static void main(String[] args) {
	divdableTo5();
    }

    static void divdableTo5() {
	for (int i = 1; i <= 100; i++) {
	    if (i % 5 == 0) {
		System.out.print(i + " ");
	    }
	}
    }
}

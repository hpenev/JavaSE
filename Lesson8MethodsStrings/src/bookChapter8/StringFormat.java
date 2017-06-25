package bookChapter8;

public class StringFormat {
    public static void main(String[] args) {
	double num = 5.5;
	System.out.printf("|%015.2f|%n", num);
	System.out.printf("|%+.2f|%n", num);
	System.out.printf("|%.2f|%n", num);
	System.out.printf("|%15.2f|%n", num);
	System.out.printf("|%-15.2f|%n", num);

    }
}

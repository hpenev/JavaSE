package inClass;

public class StringExamples {
    public static void main(String[] args) {
	// int x = 5;
	// System.out.print("Enter a text: ");
	// System.out.println("asd");
	//
	// Scanner sc = new Scanner(System.in);
	// String text = sc.nextLine();
	// System.out.println(text);
	// sc.close();
	//
	// String s1 = "some text";
	// String s2 = "some text";
	// System.out.println(s1.equals(s2));
	//
	// String s = "hi" + " " + "krasi" + " " + "!" + "!";
	// System.out.println(s);

	long start = System.currentTimeMillis();
	String s = "k";
	for (int i = 0; i < 100_000; i++) {
	    s += "K";
	}
	System.out.println(s);

	long end = System.currentTimeMillis();

	System.out.println(end - start);

    }
}

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String aStr = Integer.toBinaryString(a);
	char[] arrStriny = aStr.toCharArray();

	System.out.println(aStr);
	if (aStr.length() < 6) {
	    System.out.println("false");
	} else if (arrStriny[5] == '1') {
	    System.out.println("true");
	} else {
	    System.out.println("false");
	}
	sc.close();
    }
}

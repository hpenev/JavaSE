import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'k', 'l', 'm' };

	System.out.print("Enter a char: ");
	char ch = sc.next().charAt(0);
	sc.close();

	boolean found = false;
	int index = -1;

	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] == ch) {
		found = true;
		index = i;
		break;
	    }
	}

	if (found) {
	    System.out.print("symbol found at index " + index);
	} else {
	    System.out.print("Array do not contain this symbol");
	}
    }
}

package bookChapter8;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the side of the square: ");
	int number = sc.nextInt();
	sc.close();

	if (isValid(number)) {
	    showNumberInfo(number);
	} else {
	    showError();
	}

    }

    static boolean isValid(int num) {
	boolean valid = (num > 0) && (num % 3 == 0);
	return valid;
    }

    static void showNumberInfo(int num) {
	System.out.println("Числото е" + num);
	System.out.println("Неговият квадрат е" + num * num);
	System.out.println("Неговият куб е" + num * num * num);
    }

    static void showError() {
	System.out.println("Невалидно число!");
    }
}

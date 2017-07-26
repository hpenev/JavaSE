package shop;


import java.util.Scanner;

public abstract class Validate {

    private static Scanner scanner = new Scanner(System.in);

    public static String name(String name) {
	String validateName = "";

	while (validateName == null && validateName.isEmpty()) {
	    validateName = scanner.nextLine();
	}

	return validateName;
    }

}

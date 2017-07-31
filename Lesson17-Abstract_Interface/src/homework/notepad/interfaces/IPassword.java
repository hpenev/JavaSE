package homework.notepad.interfaces;

import java.util.Scanner;

public interface IPassword {

    boolean equals(IPassword pass);

    String getPassword();

    default String enterPassword() {
	System.out.print("Please Enter password: ");
	Scanner scanner = new Scanner(System.in);
	String pass = scanner.next();
	return pass;
    }

}

package homework.notepad.classes;

import homework.notepad.interfaces.IPassword;

public class StrongPassword implements IPassword {

    private final int MIN_LENGTH = 5;
    private final int MIN_NUMBER_SMALL_LETTERS = 1;
    private final int MIN_NUMBER_CAPITAL_LETTERS = 1;
    private final int MIN_NUMBER_DIGITS = 1;

    private String password;

    StrongPassword() {
	this.password = enterValidPassword();
    }

    private String enterValidPassword() {
	String password = enterPassword();
	while (!isStrongPass(password)) {
	    password = enterPassword();
	}
	return password;
    }

    protected boolean isStrongPass(String password) {
	int length = password.length();
	int smallLetters = 0;
	int capittalLetters = 0;
	int digits = 0;

	for (Character ch : password.toCharArray()) {
	    if (Character.isLowerCase(ch)) {
		smallLetters++;
	    }
	    if (Character.isUpperCase(ch)) {
		capittalLetters++;
	    }
	    if (Character.isDigit(ch)) {
		digits++;
	    }
	}

	if (MIN_LENGTH > length) {
	    System.out.println("Password must have at least " + MIN_LENGTH + " symbols");
	    return false;
	}

	if (MIN_NUMBER_SMALL_LETTERS > smallLetters) {
	    System.out.println("Password must have at least " + MIN_NUMBER_SMALL_LETTERS + " small letters");
	    return false;
	}

	if (MIN_NUMBER_CAPITAL_LETTERS > capittalLetters) {
	    System.out.println("Password must have at least " + MIN_NUMBER_CAPITAL_LETTERS + " capital letters");
	    return false;
	}

	if (MIN_NUMBER_DIGITS > digits) {
	    System.out.println("Password must have at least " + MIN_NUMBER_DIGITS + " digits");
	    return false;
	}

	return true;
    }

    @Override
    public boolean equals(IPassword pass) {
	return this.password.equals(pass.getPassword());
    }

    @Override
    public String getPassword() {
	return this.password;
    }
}

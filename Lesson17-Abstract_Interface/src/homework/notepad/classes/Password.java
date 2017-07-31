package homework.notepad.classes;

import homework.notepad.interfaces.IPassword;

public abstract class Password implements IPassword {

    private String password;

    Password() {
	this.password = enterValidPassword();
    }

    private String enterValidPassword() {
	String password = enterPassword();
	while (password == null || password.isEmpty()) {
	    password = enterPassword();
	}
	return password;
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

package homework.notepad.classes;

import homework.notepad.interfaces.INotepad;
import homework.notepad.interfaces.IPassword;

public class SecuredNotepad extends SimpleNotepad implements INotepad {

    private IPassword password;

    public SecuredNotepad() {
	this.password = new StrongPassword();
    }

    private boolean isSamePassword() {
	IPassword userPassword = new StrongPassword();
	return userPassword.equals(this.password);
    }

    @Override
    public void addTextInPage(String text, int pageNumber) {
	System.out.println("Enter pass for adding a text");
	if (isSamePassword()) {
	    super.addTextInPage(text, pageNumber);
	} else {
	    System.out.println("Invalid password!");
	}
    }

    @Override
    public void replaceTextInPage(String text, int pageNumber) {
	System.out.println("Enter pass for replacing a text");
	if (isSamePassword()) {
	    super.replaceTextInPage(text, pageNumber);
	} else {
	    System.out.println("Invalid password!");
	}
    }

    @Override
    public void deleteTextInPage(int pageNumber) {
	System.out.println("Enter pass for deleting a text");
	if (isSamePassword()) {
	    System.out.println("text deleted");
	    super.deleteTextInPage(pageNumber);
	} else {
	    System.out.println("Invalid password!");
	}

    }

    @Override
    public void printAllPages() {
	System.out.println("Enter pass for printing all pages");
	if (isSamePassword()) {
	    super.printAllPages();
	} else {
	    System.out.println("Invalid password!");
	}
    }
}

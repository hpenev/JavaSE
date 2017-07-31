package homework.notepad;

import homework.notepad.classes.ElectronicSecuredNotepad;

public class NotepadDemo {
    public static void main(String[] args) {

	ElectronicSecuredNotepad esn = new ElectronicSecuredNotepad();
	esn.start();

	esn.addTextInPage("testing", 2);
	esn.printAllPages();

	esn.addTextInPage("testing", 1);

    }
}

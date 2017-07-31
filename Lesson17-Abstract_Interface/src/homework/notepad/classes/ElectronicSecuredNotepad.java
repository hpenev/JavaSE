package homework.notepad.classes;

import homework.notepad.interfaces.IЕlectronicDevice;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IЕlectronicDevice {
    private boolean isStarted = false;

    @Override
    public void start() {
	if (!isStarted) {
	    this.isStarted = true;
	}

    }

    @Override
    public void stop() {
	if (isStarted) {
	    this.isStarted = false;
	}

    }

    @Override
    public boolean isStarted() {
	return this.isStarted;
    }

    @Override
    public void addTextInPage(String text, int pageNumber) {
	if (isStarted()) {
	    super.addTextInPage(text, pageNumber);
	} else {
	    System.out.println("Is not started");
	}
    }

    @Override
    public void replaceTextInPage(String text, int pageNumber) {
	if (isStarted()) {
	    super.replaceTextInPage(text, pageNumber);
	} else {
	    System.out.println("Is not started");
	}
    }

    @Override
    public void deleteTextInPage(int pageNumber) {
	if (isStarted()) {
	    super.deleteTextInPage(pageNumber);
	} else {
	    System.out.println("Is not started");
	}

    }

    @Override
    public void printAllPages() {
	if (isStarted()) {
	    super.printAllPages();
	} else {
	    System.out.println("Is not started");
	}
    }

}

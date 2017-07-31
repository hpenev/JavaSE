package homework.notepad.classes;

import java.util.ArrayList;

import homework.notepad.interfaces.INotepad;

public class SimpleNotepad implements INotepad {
    private ArrayList<Page> pages;

    public SimpleNotepad() {
	this.pages = new ArrayList<>();
    }

    @Override
    public void addTextInPage(String text, int pageNumber) {

	if (pageNumber > this.pages.size()) {

	    int pagesToAdd = pageNumber - this.pages.size();

	    for (int i = 0; i <= pagesToAdd; i++) {
		this.pages.add(new Page("title " + this.pages.size(), ""));
	    }

	    this.pages.get(pageNumber).addText(text);
	} else {
	    this.pages.get(pageNumber).addText(text);
	}
    }

    private boolean existPageNumber(int pageNumber) {
	if (pageNumber >= this.pages.size()) {
	    System.out.println("Notepad doesn't have page No." + pageNumber);
	    return false;
	} else {
	    return true;
	}
    }

    @Override
    public void replaceTextInPage(String text, int pageNumber) {
	if (existPageNumber(pageNumber)) {
	    this.pages.get(pageNumber).deleteText();
	    this.pages.get(pageNumber).addText(text);
	}

    }

    @Override
    public void deleteTextInPage(int pageNumber) {
	if (existPageNumber(pageNumber)) {
	    this.pages.get(pageNumber).deleteText();
	}
    }

    @Override
    public void printAllPages() {
	for (Page page : pages) {
	    System.out.println(page);
	}
    }

    @Override
    public boolean searchWord(String word) {
	boolean containWord = false;

	for (Page page : pages) {
	    if (page.searchWord(word)) {
		containWord = true;
		break;
	    }
	}

	return containWord;
    }

    @Override
    public void printAllPagesWithDigits() {
	for (Page page : pages) {
	    if (page.containsDigits()) {
		System.out.println(page);
	    }
	}
    }
}

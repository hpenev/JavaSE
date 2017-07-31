package homework.notepad.interfaces;

public interface INotepad {
    void addTextInPage(String text, int pageNumber);

    void replaceTextInPage(String text, int pageNumber);

    void deleteTextInPage(int pageNumber);

    void printAllPages();

    boolean searchWord(String word);

    void printAllPagesWithDigits();

}

package homework.notepad.classes;

public class Page {
    private String title;
    private String text;

    Page(String title, String text) {
	this.title = title;
	this.text = text;
    }

    void addText(String newText) {
	this.text += newText;
	this.text += "\n";
    }

    void deleteText() {
	this.text = "";
    }

    boolean searchWord(String word) {
	if (this.text.contains(word)) {
	    return true;
	} else {
	    return false;
	}
    }

    boolean containsDigits() {
	boolean hasDigit = false;

	for (Character ch : this.text.toCharArray()) {
	    if (Character.isDigit(ch)) {
		hasDigit = true;
		break;
	    }
	}

	return hasDigit;
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("Page Title: " + this.title);
	sb.append("\n");
	sb.append("Page Text: \n" + this.text);
	return sb.toString();
    }
}

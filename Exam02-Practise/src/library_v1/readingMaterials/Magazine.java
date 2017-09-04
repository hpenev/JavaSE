package library_v1.readingMaterials;

import java.time.LocalDate;

public class Magazine extends ReadingStuff implements Comparable<Magazine> {

    public Magazine(String name, int number, LocalDate issueDate, String publisher, String category) {
	super(name, number, issueDate, publisher, category);
    }

    @Override
    public int compareTo(Magazine o) {
	if (this.category.equals(o.category)) {
	    if (this.name.equals(o.name)) {
		if (this.number == o.number) {
		    return 0;
		}
		if (this.number > o.number) {
		    return 1;
		}
		if (this.number < o.number) {
		    return -1;
		}
	    }
	    return this.name.compareTo(o.name);
	}
	return this.category.compareTo(o.category);
    }

}

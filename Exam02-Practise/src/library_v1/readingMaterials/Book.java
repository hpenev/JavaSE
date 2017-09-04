package library_v1.readingMaterials;

import java.time.LocalDate;

public class Book extends ReadingStuff implements Comparable<Book> {

    public Book(String name, String author, LocalDate issueDate, String publisher, String genre) {
	super(name, author, issueDate, publisher, genre);
    }

    @Override
    public int compareTo(Book o) {
	if (this.genre.equals(o.genre)) {
	    return this.issueDate.compareTo(o.issueDate);
	}
	return this.genre.compareTo(o.genre);
    }

}

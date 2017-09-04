package library_v1;

import java.util.TreeSet;

import library_v1.readingMaterials.Book;
import library_v1.readingMaterials.Magazine;
import library_v1.readingMaterials.Textbook;

public class Library {

    private static final String[] productTypes = { "book", "magazine", "textbook" };
    private static final String[] bookGenres = { "thriler", "drama", "roman" };
    private static final String[] magazineCateg = { "sport", "fashion", "design", "cars" };
    private static final String[] textbookThemes = { "math", "chemistry", "english" };

    private TreeSet<Book> books;
    private TreeSet<Magazine> magazines;
    private TreeSet<Textbook> textbooks;
}

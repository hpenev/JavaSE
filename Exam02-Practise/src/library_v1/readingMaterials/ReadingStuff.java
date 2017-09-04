package library_v1.readingMaterials;

import java.time.LocalDate;
import java.util.Stack;

import library_v1.History;

public abstract class ReadingStuff {
    protected String name;
    protected String author;
    protected LocalDate issueDate;
    protected String publisher;
    protected String genre;
    protected int number;
    protected String category;
    protected String topic;
    protected Stack<History> history;

    public String getCategory() {
	return category;
    }

    public String getTopic() {
	return topic;
    }

    public ReadingStuff(String name, String author, LocalDate issueDate, String publisher, String genre) {
	this.name = name;
	this.author = author;
	this.issueDate = issueDate;
	this.publisher = publisher;
	this.genre = genre;
    }

    public ReadingStuff(String name, int number, LocalDate issueDate, String publisher, String category) {
	this.name = name;
	this.number = number;
	this.issueDate = issueDate;
	this.publisher = publisher;
	this.category = category;
    }

    public ReadingStuff(String name, String author, String publisher, String topic) {
	this.name = name;
	this.author = author;
	this.publisher = publisher;
	this.topic = topic;
    }

}

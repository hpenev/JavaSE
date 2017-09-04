package library_v1.readingMaterials;

public class Textbook extends ReadingStuff implements Comparable<Textbook> {

    public Textbook(String name, String author, String publisher, String topic) {
	super(name, author, publisher, topic);
    }

    @Override
    public int compareTo(Textbook o) {
	if (this.topic.equals(o.getTopic())) {
	    return this.name.compareTo(o.name);
	}
	return this.topic.compareTo(o.topic);
    }

}

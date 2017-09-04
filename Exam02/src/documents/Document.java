package documents;

import java.util.Random;

public abstract class Document {

    private String name;
    private int difficulty;
    private boolean isMistaken;

    public boolean isMistaken() {
	return isMistaken;
    }

    public void setMistaken(boolean isMistaken) {
	this.isMistaken = isMistaken;
    }

    public String getName() {
	return name;
    }

    public int getDifficulty() {
	return difficulty;
    }

    public Document(String name) {
	this.name = name;
	this.difficulty = new Random().nextInt(20) + 1;
    }

    @Override
    public String toString() {
	return "Document [name=" + name + ", difficulty=" + difficulty + "]";
    }

    public boolean isOrdinary() {
	return false;
    }

    public boolean isSecret() {
	return false;
    }
}

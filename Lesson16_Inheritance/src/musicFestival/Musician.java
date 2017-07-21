package musicFestival;

public class Musician {
    private String name;
    private boolean isVocal;
    private String instrument;

    Musician(String name, String instrument, boolean isVocal) {
	this.name = name;
	this.instrument = instrument;
	this.isVocal = isVocal;
    }

    @Override
    public String toString() {
	StringBuilder musicianInfo = new StringBuilder();
	musicianInfo.append("\t\tMusician Name: " + this.name);
	musicianInfo.append("\n");
	musicianInfo.append("\t\tIs vocal: " + this.isVocal);
	musicianInfo.append("\n");
	musicianInfo.append("\t\tMusician instument: " + this.instrument);
	musicianInfo.append("\n");
	return musicianInfo.toString();
    }
}

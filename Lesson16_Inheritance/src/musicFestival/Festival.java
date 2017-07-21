package musicFestival;

public class Festival {
    private String location;
    private String date;
    private int startHour;
    private Act[] acts;

    public Festival(String location, String date, int startHour, Act[] acts) {
	this.date = date;
	this.acts = acts;
	this.location = location;
	this.startHour = startHour;
    }

    void startFest() {
	for (int i = 0; i < this.acts.length; i++) {
	    this.acts[i].startAct();
	}
    }

    @Override
    public String toString() {
	StringBuilder festivalInfo = new StringBuilder();
	festivalInfo.append("---------------Festival Info---------------");
	festivalInfo.append("\n");
	festivalInfo.append("Location: " + this.location);
	festivalInfo.append("\n");
	festivalInfo.append("Date: " + this.date);
	festivalInfo.append("\n");
	festivalInfo.append("--------Groups------------");
	festivalInfo.append("\n");
	for (int i = 0; i < acts.length; i++) {
	    festivalInfo.append(acts[i].toString());
	    festivalInfo.append("\n");
	}
	return festivalInfo.toString();
    }
}

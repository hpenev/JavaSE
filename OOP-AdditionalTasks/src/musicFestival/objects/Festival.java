package musicFestival.objects;

public class Festival {
    private String location;
    private String date;
    private Act[] acts;

    public Festival(String location, String date, Act[] acts) {
	this.date = date;
	this.acts = acts;
	this.location = location;
    }

    public void startFest() {
	System.out.println("Festival Starts: ");
	for (int i = 0; i < this.acts.length; i++) {
	    this.acts[i].startAct();
	}
    }

    public void showInfo() {
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
	System.out.println(festivalInfo.toString());
    }
}

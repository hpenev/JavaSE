package musicFestival;

public class Festival {
    private String location;
    private Group[] groups;
    private String date;

    public Festival(String location, String date, Group[] groups) {
	this.date = date;
	this.groups = groups;
	this.location = location;
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
	for (int i = 0; i < groups.length; i++) {
	    festivalInfo.append(groups[i].toString());
	    festivalInfo.append("\n");
	}
	return festivalInfo.toString();
    }
}

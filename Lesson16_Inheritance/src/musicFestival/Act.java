package musicFestival;

public class Act {
    private int startHour;
    private int endHour;
    private Group group;

    Act(int startHour, int endHour, Group group) {
	this.startHour = startHour;
	this.endHour = endHour;
	this.group = group;
    }

    void startAct() {
	System.out.println("-----------------------------------------------");
	System.out.println("Group " + this.group.getName() + " get on the stage at " + this.startHour + "o'clock");
	this.group.greetAudience();
	this.group.singSongs();
	System.out.println("Group " + this.group.getName() + " get off the stage at " + this.endHour + "o'clock");
    }

    @Override
    public String toString() {
	StringBuilder actInfo = new StringBuilder();
	actInfo.append("Group:" + this.group.getName());
	actInfo.append("\n");
	actInfo.append("Start hour: " + this.startHour + " - End hour: " + this.endHour);
	actInfo.append("\n");

	Song[] songs = this.group.getSongs();
	for (int i = 0; i < songs.length; i++) {
	    actInfo.append(songs[i]);
	    actInfo.append("\n");
	}

	return actInfo.toString();
    }
}

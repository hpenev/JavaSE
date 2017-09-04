package hospital.departments.accommodation;

public class Bed {
    private boolean isFree;
    private String name;
    private Room room;

    public String getName() {
	return name;
    }

    public Room getRoom() {
	return room;
    }

    public Bed(String name, Room room) {
	this.isFree = true;
	this.name = name;
	this.room = room;
    }

    public boolean isFree() {
	return isFree;
    }

    public void setFree(boolean isFree) {
	this.isFree = isFree;
    }
}

package hospital.departments;

import hospital.departments.accommodation.Bed;
import hospital.departments.accommodation.Room;

public class Virology extends Department {

    public Virology() {
	super();
	this.name = "Virology";
    }

    @Override
    protected Room[] createRooms() {
	Room[] rooms = new Room[3];
	for (int i = 0; i < rooms.length; i++) {
	    rooms[i] = new Room("Room" + (i + 1), this);
	}
	return rooms;
    }

    @Override
    public boolean haveFreeBeds() {
	for (Room room : rooms) {
	    if (room.hasFreeBed()) {
		return true;
	    }
	}
	return false;
    }

    @Override
    public Bed getFreeBed() {
	for (Room room : rooms) {
	    for (Bed bed : room.getBeds()) {
		if (bed.isFree()) {
		    return bed;
		}
	    }
	}
	return null;
    }
}

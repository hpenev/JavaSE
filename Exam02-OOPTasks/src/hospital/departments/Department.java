package hospital.departments;

import hospital.departments.accommodation.Bed;
import hospital.departments.accommodation.Room;

public abstract class Department {

    protected Room[] rooms = new Room[10];
    protected String name;

    public Department() {
	this.rooms = createRooms();
    }

    public String getName() {
	return name;
    }

    protected abstract Room[] createRooms();

    public Room[] getRooms() {
	return rooms;
    }

    public boolean hasFreeRoom() {
	for (int i = 0; i < rooms.length; i++) {
	    if (rooms[i].hasFreeBed()) {
		return true;
	    }
	}
	return false;
    }

    public abstract boolean haveFreeBeds();

    public abstract Bed getFreeBed();

}

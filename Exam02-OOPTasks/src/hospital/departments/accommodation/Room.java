package hospital.departments.accommodation;

import hospital.departments.Department;

public class Room {
    private Bed[] beds = new Bed[3];
    private String name;
    private Department department;

    public Room(String name, Department department) {
	this.beds = createBeds();
	this.name = name;
	this.department = department;
    }

    public String getName() {
	return name;
    }

    public Department getDepartment() {
	return department;
    }

    private Bed[] createBeds() {
	Bed[] beds = new Bed[3];

	for (int i = 0; i < beds.length; i++) {
	    beds[i] = new Bed("Bed" + (i + 1), this);
	}

	return beds;
    }

    public Bed[] getBeds() {
	return beds;
    }

    public boolean hasFreeBed() {
	for (int i = 0; i < beds.length; i++) {
	    if (beds[i].isFree()) {
		return true;
	    }
	}
	return false;
    }
}

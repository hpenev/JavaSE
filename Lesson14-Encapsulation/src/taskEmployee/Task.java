package taskEmployee;

public class Task {
    private String name;
    private int workingHours;

    Task(String name, int workingHours) {
	setName(name);
	setWorkingHours(workingHours);
    }

    private void setName(String name) {
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	} else {
	    System.out.println("invalid name");
	}
    }

    int getWorkingHours() {
	return workingHours;
    }

    void setWorkingHours(int workingHours) {
	if (workingHours >= 0) {
	    this.workingHours = workingHours;
	} else {
	    System.out.println("invalid workingHours");
	}
    }

    @Override
    public String toString() {
	String result = "\t" + this.name + "\n\tworkingHours:" + this.workingHours;
	return result;
    }
}

package taskEmployee;

public class Employee {
    private String name;
    private Task currentTask;
    private int hoursLeft;

    Employee(String name) {
	setName(name);
    }

    Task getCurrentTask() {
	return currentTask;
    }

    int getHoursLeft() {
	return hoursLeft;
    }

    String getName() {
	return name;
    }

    void setCurrentTask(Task currentTask) {
	if (currentTask != null) {
	    this.currentTask = currentTask;
	}
    }

    void setHoursLeft(int hoursLeft) {
	if (hoursLeft > 0) {
	    this.hoursLeft = hoursLeft;
	}
    }

    private void setName(String name) {
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	} else {
	    System.out.println("invalid name");
	}
    }

    void work() {
	System.out.println("Before start worksing");
	showReport();

	if (currentTask != null) {
	    if (this.hoursLeft >= currentTask.getWorkingHours()) {
		this.hoursLeft -= currentTask.getWorkingHours();
		this.currentTask.setWorkingHours(0);
	    } else {
		int hours = this.currentTask.getWorkingHours() - this.hoursLeft;
		this.currentTask.setWorkingHours(hours);
		this.hoursLeft = 0;
	    }
	} else {
	    System.out.println("No current task");
	}

	System.out.println("After finish working");
	showReport();
    }

    private void showReport() {
	System.out.println("----------------------------");
	System.out.println("Name: " + this.name);
	System.out.println("employee hours left: " + this.hoursLeft);
	System.out.println(this.currentTask);
	System.out.println("----------------------------");
    }

}

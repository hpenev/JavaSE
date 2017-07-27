package taskEmployee;

public class Employee implements IWorker {
    private String name;
    private Task currentTask;
    private int hoursLeft;
    private static AllWork allWork;

    public static void setAllWork(AllWork allWork) {
	Employee.allWork = allWork;
    }

    public static AllWork getAllWork() {
	return allWork;
    }

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

    public void setCurrentTask(Task currentTask) {
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

    public void work() {
	if (this.currentTask == null) {
	    getNewTask();
	}

	while (this.hoursLeft != 0 && this.currentTask.getWorkingHours() != 0) {
	    this.hoursLeft--;
	    this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - 1);
	}

	showReport();

	if (this.currentTask.getWorkingHours() == 0 && !this.allWork.isAllTaskAssigned()) {
	    getNewTask();
	    work();
	}
    }

    private void getNewTask() {
	this.currentTask = this.allWork.getNextTask();
	System.out.println(this.name + " gets task " + this.currentTask.getName() + " overall time: "
		+ this.currentTask.getWorkingHours());
    }

    public void startWorkingDay() {
	this.hoursLeft = 8;
    }

    private void showReport() {
	System.out.println("Name: " + this.name);
	System.out.println(
		"Current task: " + this.currentTask.getName() + " hours left: " + this.currentTask.getWorkingHours());
	System.out.println("Work hours left for today:" + this.hoursLeft);
    }

}

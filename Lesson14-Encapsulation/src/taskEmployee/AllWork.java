package taskEmployee;

public class AllWork {
    private Task[] tasks;
    private int freePlacesForTasks;
    private int currentUnassignedTask;

    AllWork() {
	this.freePlacesForTasks = 10;
	this.tasks = new Task[freePlacesForTasks];
	this.currentUnassignedTask = 0;
    }

    boolean isAllTaskAssigned() {
	if (currentUnassignedTask == tasks.length) {
	    return true;
	}
	return false;
    }

    void addTask(Task task) {
	if (this.freePlacesForTasks == 0) {
	    System.out.println("Full of tasks");
	    return;
	}

	if (task == null) {
	    System.out.println("null task cannot be added");
	    return;
	}

	this.tasks[this.tasks.length - freePlacesForTasks--] = task;

    }

    Task getNextTask() {
	return this.tasks[currentUnassignedTask++];
    }

    boolean isAllWorkDone() {
	for (int i = 0; i < tasks.length; i++) {
	    if (tasks[i].getWorkingHours() > 0) {
		return false;
	    }
	}
	return true;
    }
}

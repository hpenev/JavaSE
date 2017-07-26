package taskEmployee;

public class AllWork {
    private Task[] tasks;
    private int freePlacesForTasks;
    private int currentUnassignedTask;

    AllWork() {
	freePlacesForTasks = 10;
	currentUnassignedTask = 0;
    }

    void addTask(Task task) {
	this.tasks[this.currentUnassignedTask++] = task;
	this.freePlacesForTasks--;
    }

    Task getNextTask() {

	return null;
    }
}

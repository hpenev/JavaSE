package homework;

import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {
    private Queue<ITask> tasks = new LinkedList<>();

    void execute() {
	while (!tasks.isEmpty()) {
	    this.tasks.poll().doWork();
	}
    }

    void push(ITask task) {
	this.tasks.offer(task);
    }
}

package taskEmployee;

public class Demo {
    public static void main(String[] args) {
	Task task1 = new Task("Task1", 10);
	Task task2 = new Task("Task2", 21);
	Task task3 = new Task("Task3", 15);
	Task task4 = new Task("Task4", 12);
	Task task5 = new Task("Task5", 17);
	Task task6 = new Task("Task6", 11);
	Task task7 = new Task("Task7", 13);
	Task task8 = new Task("Task8", 9);
	Task task9 = new Task("Task9", 16);
	Task task10 = new Task("Task10", 13);

	AllWork allWork = new AllWork();
	allWork.addTask(task1);
	allWork.addTask(task2);
	allWork.addTask(task3);
	allWork.addTask(task4);
	allWork.addTask(task5);
	allWork.addTask(task6);
	allWork.addTask(task7);
	allWork.addTask(task8);
	allWork.addTask(task9);
	allWork.addTask(task10);
	Employee.setAllWork(allWork);

	IWorker ivan = new Employee("Ivan");
	IWorker peter = new Employee("Peter");
	IWorker george = new Employee("George");
	IWorker pavel = new Employee("Pavel");
	IWorker[] workers = { ivan, peter, george, pavel };

	int day = 1;
	while (true) {
	    System.out.println("===============" + "DAY " + (day++) + "===============");
	    boolean taskLeft = true;
	    for (int j = 0; j < workers.length; j++) {
		if (allWork.isAllWorkDone()) {
		    taskLeft = false;
		}
		workers[j].startWorkingDay();
		workers[j].work();
	    }

	    if (!taskLeft) {
		break;
	    }
	}
    }
}

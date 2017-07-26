package taskEmployee;

public class Demo {
    public static void main(String[] args) {
	Task task = new Task("Task1", 12);
	Employee ico = new Employee("Ico");
	ico.setCurrentTask(task);
	ico.setHoursLeft(8);

	ico.work();
    }
}

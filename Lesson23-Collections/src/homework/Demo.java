package homework;

public class Demo {
    public static void main(String[] args) {

	ITask work = new ITask() {

	    @Override
	    public void doWork() {
		System.out.println("Working...");

	    }
	};

	ITask learn = new ITask() {

	    @Override
	    public void doWork() {
		System.out.println("Learning...");

	    }
	};

	ITask sleep = new ITask() {

	    @Override
	    public void doWork() {
		System.out.println("Sleaping...");

	    }
	};

	ITask eat = new ITask() {

	    @Override
	    public void doWork() {
		System.out.println("Eating...");

	    }
	};

	Scheduler scheduler = new Scheduler();
	scheduler.push(eat);
	scheduler.push(work);
	scheduler.push(learn);
	scheduler.push(sleep);

	scheduler.execute();

    }
}

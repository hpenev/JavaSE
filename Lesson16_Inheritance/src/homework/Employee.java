package homework;

public class Employee extends Person {
    private double daySalary;

    protected Employee(String name, int age, boolean isMale, double daySalary) {
	super(name, age, isMale);
	this.daySalary = daySalary;
    }

    double calculateOvertime(double hours) {
	if (this.age <= 18) {
	    return 0;
	} else {
	    return daySalary / 8 * hours * 1.5;
	}
    }

    protected void showEmployeeInfo() {
	super.howPersonInfo();
	System.out.println("Day Salary: " + daySalary);
    }
}

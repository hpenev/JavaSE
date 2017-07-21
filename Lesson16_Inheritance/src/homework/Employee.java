package homework;

public class Employee extends Person {
    private double daySalary;

    Employee(String name, int age, boolean isMale, double daySalary) {
	super(name, age, isMale);
	this.daySalary = daySalary;
    }

    double calculateOvertime(double hours) {
	if (this.getAge() <= 18) {
	    return 0;
	} else {
	    return daySalary / 8 * hours * 1.5;
	}
    }

    protected void howPersonInfo() {
	showEmployeeInfo();
    }

    private void showEmployeeInfo() {
	super.howPersonInfo();
	System.out.println("Day Salary: " + daySalary);
    }
}

package employees;

import java.util.TreeSet;

import departments.Department;

public class SeniorEmployee extends RegularEmployee {
    private static final double SENIOR_SALLARY = 3000;
    private static final int STEPEN_SENIOR = 18;

    public SeniorEmployee(String name, Department department) {
	super(name, department);
	this.rank = 3;
	this.sallary = SENIOR_SALLARY;
	this.stepenNaEmployee = STEPEN_SENIOR;
    }

    public void fireWorstEmployee() {
	TreeSet<Employee> allEmployeesInDepartment = new TreeSet<>(
		(o1, o2) -> o1.getIncorrectDocuments() - o2.getIncorrectDocuments());
	allEmployeesInDepartment.addAll(this.department.getEmployees());
	Employee worstEmp = allEmployeesInDepartment.first();
	System.out.println("Worst Employee: " + worstEmp);
	System.out.println("Total mistakes: " + worstEmp.getIncorrectDocuments());
	this.department.fireEmployee(worstEmp);
    }

    @Override
    public boolean isSenior() {
	return true;
    }
}

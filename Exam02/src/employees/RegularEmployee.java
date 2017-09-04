package employees;

import java.util.Set;

import departments.Department;
import documents.Document;

public class RegularEmployee extends JuniorEmployee {
    private static final double REGULAR_SALLARY = 2000;
    private static final int STEPEN_REGULAR = 12;

    public RegularEmployee(String name, Department department) {
	super(name, department);
	this.rank = 2;
	this.sallary = REGULAR_SALLARY;
	this.stepenNaEmployee = STEPEN_REGULAR;
    }

    public void transferToOther(Document document) {
	Employee lowRankEmployee = findLowRankEmployee();
	lowRankEmployee.processDocument(document);
	System.out.println(this.getName() + " transfer document to " + lowRankEmployee.getName());

    }

    private Employee findLowRankEmployee() {
	Employee employee = null;
	Set<Employee> allEmps = this.department.getEmployees();
	for (Employee lowRankEmployee : allEmps) {
	    if (lowRankEmployee.getRank() < this.rank) {
		return lowRankEmployee;
	    }
	}
	return employee;
    }

    @Override
    public boolean isRegular() {
	return true;
    }
}

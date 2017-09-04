package company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

import departments.Department;
import departments.Department.DepartmentType;
import documents.Document;
import employees.Employee;
import employees.JuniorEmployee;
import employees.RegularEmployee;
import employees.SeniorEmployee;

public class Companty {
    private String name;
    private HashSet<Department> departments;

    public Companty(String name) {
	if (name != null && !name.isEmpty()) {
	    this.name = name;
	} else {
	    System.out.println("Inccorect company name");
	}
	this.departments = new HashSet<>();
    }

    /**
     * Hire employee to work
     * 
     * @param employeeName
     *            - name of the employee
     * @param departmentType
     *            - department of the employee
     */
    public void setEmployee(String employeeName, DepartmentType departmentType) {
	Department department = new Department(departmentType);
	if (!this.departments.contains(department)) {
	    SeniorEmployee seniorEmployee = new SeniorEmployee(employeeName, department);
	    department.addEmployee(seniorEmployee);
	    this.departments.add(department);
	} else {
	    int chance = new Random().nextInt(3);
	    Employee employee = null;
	    switch (chance) {
	    case 0:
		employee = new JuniorEmployee(employeeName, department);
		break;
	    case 1:
		employee = new SeniorEmployee(employeeName, department);
		break;
	    case 2:
		employee = new RegularEmployee(employeeName, department);
		break;
	    }
	    for (Iterator<Department> iterator = this.departments.iterator(); iterator.hasNext();) {
		Department temp = (Department) iterator.next();
		if (department.equals(temp)) {
		    temp.addEmployee(employee);
		    break;
		}
	    }
	}
    }

    public void processDocument(Document document) {
	Employee randomEmployee = getRandomEmployee();
	randomEmployee.processDocument(document);
	System.out.println(document.getName() + " e dadena na " + randomEmployee.getName());
    }

    private HashSet<Employee> getAllEmployees() {
	HashSet<Employee> allEmps = new HashSet<>();

	for (Iterator<Department> iterator = this.departments.iterator(); iterator.hasNext();) {
	    Department temp = (Department) iterator.next();
	    allEmps.addAll(temp.getEmployees());
	}

	return allEmps;
    }

    private Employee getRandomEmployee() {
	HashSet<Employee> allEmps = getAllEmployees();
	Employee[] allEmpsArray = allEmps.toArray(new Employee[allEmps.size()]);
	return allEmpsArray[new Random().nextInt(allEmpsArray.length)];
    }

    public void showAllProcessedDocuments() {
	HashSet<Employee> allEmployees = getAllEmployees();

	TreeSet<Document> allDocuments = new TreeSet<>((o1, o2) -> o1.getDifficulty() - o2.getDifficulty());
	for (Employee employee : allEmployees) {
	    allDocuments.addAll(employee.getProcessedDocuments());
	}

	for (Document document : allDocuments) {
	    System.out.println(document);

	}
    }

    public void showMoneyForSallary() {
	HashSet<Employee> allEmps = getAllEmployees();
	double totalMoneyForSallary = 0;
	for (Employee employee : allEmps) {
	    totalMoneyForSallary += employee.getSallary();
	}
	System.out.println("Money for sallary: " + totalMoneyForSallary);

    }

    public void showBestEmployee() {
	Employee bestEmployee = null;
	HashSet<Employee> allEmployees = getAllEmployees();
	for (Employee employee : allEmployees) {
	    if (bestEmployee == null) {
		bestEmployee = employee;
		continue;
	    }
	    if (employee.getIncorrectDocuments() < bestEmployee.getIncorrectDocuments()) {
		bestEmployee = employee;
	    }
	}

	System.out.println("Best employee: " + bestEmployee);

    }

    public void showWorstDepartment() {
	Department worstDepartment = null;
	for (Department department : this.departments) {
	    if (worstDepartment == null) {
		worstDepartment = department;
		continue;
	    }
	    if (department.incorrectDocuments() > worstDepartment.incorrectDocuments()) {
		worstDepartment = department;
	    }
	}

	System.out.println("Worst Department is " + worstDepartment);

    }

    public void showTop3Employees() {
	HashSet<Employee> allEmps = getAllEmployees();
	TreeSet<Employee> sortTopEmps = new TreeSet<>(
		(o1, o2) -> o2.getIncorrectDocuments() - o1.getIncorrectDocuments());
	sortTopEmps.addAll(allEmps);

	int counter = 1;
	for (Employee employee : sortTopEmps) {
	    if (counter == 4) {
		break;
	    }
	    System.out.println("nomer" + counter++ + " is " + employee);
	}
    }

}

package additionalTasks;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
	Company company = new Company("Talanti");

	company.add(Department.ADMINISTRATION, new Employee("Gosho", 23, 1100));
	company.add(Department.ADMINISTRATION, new Employee("Pesho", 22, 1200));
	company.add(Department.ADMINISTRATION, new Employee("Sasho", 21, 900));
	company.add(Department.ADMINISTRATION, new Employee("Dancho", 20, 1900));
	company.add(Department.ADMINISTRATION, new Employee("Dancho", 20, 2100));

	System.out.println(company);

	company.printEmploeesSortedBySalary();
	company.printEmploeesSortedByName();
	company.printEmploeesSortedByAge();

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	TreeSet<Employee> allEmployees = allEmployees(company.getEmployees());
	for (Employee employee : allEmployees) {
	    System.out.println(employee);
	}

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	TreeSet<Employee> uniqueEmployees = uniqueEmployees(allEmployees);
	for (Employee employee : uniqueEmployees) {
	    System.out.println(employee);
	}

	giveSalaryForMonth(uniqueEmployees, 1);
	giveSalaryForMonth(uniqueEmployees, 2);
	giveSalaryForMonth(uniqueEmployees, 3);

	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	for (Employee employee : uniqueEmployees) {
	    employee.printMonthlySalaries();
	}

    }

    private static void giveSalaryForMonth(TreeSet<Employee> employees, int month) {
	for (Employee employee : employees) {
	    employee.setSalary(month);
	}
    }

    public static TreeSet<Employee> allEmployees(Map<Department, HashSet<Employee>> employees) {
	TreeSet<Employee> allEmployees = new TreeSet<Employee>(new Comparator<Employee>() {

	    @Override
	    public int compare(Employee o1, Employee o2) {
		if (o1.getName().equals(o2.getName())) {
		    return o1.getId() - o2.getId();
		}
		return o1.getName().compareTo(o2.getName());
	    }

	});

	for (HashSet<Employee> employee : employees.values()) {
	    allEmployees.addAll(employee);
	}

	return allEmployees;
    }

    public static TreeSet<Employee> uniqueEmployees(Set<Employee> allEmpoyees) {
	TreeSet<Employee> uniqueEmployees = new TreeSet<>(new Comparator<Employee>() {

	    @Override
	    public int compare(Employee o1, Employee o2) {
		if (o1.getName().equals(o2.getName())) {
		    return o1.getAge() - o2.getAge();
		}
		return o1.getName().compareTo(o2.getName());
	    }

	});

	uniqueEmployees.addAll(allEmpoyees);
	return uniqueEmployees;
    }

}

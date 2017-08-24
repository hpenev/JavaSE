package additionalTasks;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

public class Company {

    private String name;
    private HashMap<Department, HashSet<Employee>> employees;

    public Map<Department, HashSet<Employee>> getEmployees() {
	return Collections.unmodifiableMap(this.employees);
    }

    public Company(String name) {
	this.name = name;
	this.employees = new HashMap<Department, HashSet<Employee>>();
    }

    public void add(Department department, Employee employee) {
	if (!this.employees.containsKey(department)) {
	    this.employees.put(department, new HashSet<>());
	    System.out.println("Department " + department + " created");
	}
	this.employees.get(department).add(employee);
	System.out.println("Added " + employee);
    }

    @Override
    public String toString() {
	StringBuilder company = new StringBuilder();
	company.append("Company: " + name);
	company.append("\n");
	for (Map.Entry<Department, HashSet<Employee>> entry : this.employees.entrySet()) {
	    company.append("Department: " + entry.getKey());
	    company.append("\n");
	    for (Employee employee : entry.getValue()) {
		company.append(employee);
		company.append("\n");
	    }
	}
	return company.toString();
    }

    private void printEmployeesSortedBy(Comparator<Employee> comparator) {

	for (Entry<Department, HashSet<Employee>> entry : this.employees.entrySet()) {
	    System.out.println("~~~~~~~~~~~" + entry.getKey() + "~~~~~~~~~~~");

	    TreeSet<Employee> sorted = new TreeSet<>(comparator);
	    sorted.addAll(this.employees.get(entry.getKey()));

	    for (Employee emp : sorted) {
		System.out.println(emp);
	    }
	}
    }

    public void printEmploeesSortedByAge() {
	Comparator<Employee> comparator = new Comparator<Employee>() {

	    @Override
	    public int compare(Employee o1, Employee o2) {
		if (o1.getAge() == o2.getAge()) {
		    return o1.getId() - o2.getId();
		}
		return o1.getAge() - o2.getAge();
	    }

	};
	System.out.println("by Age:");
	this.printEmployeesSortedBy(comparator);
    }

    public void printEmploeesSortedBySalary() {
	Comparator<Employee> comparator = new Comparator<Employee>() {

	    @Override
	    public int compare(Employee o1, Employee o2) {
		return Double.compare(o1.getSalary(), o2.getSalary());
	    }

	};
	System.out.println("by Salary:");
	this.printEmployeesSortedBy(comparator);
    }

    public void printEmploeesSortedByName() {
	Comparator<Employee> comparator = new Comparator<Employee>() {

	    @Override
	    public int compare(Employee o1, Employee o2) {
		if (o1.getName().equals(o2.getName())) {
		    return o1.getId() - o2.getId();
		}
		return o1.getName().compareTo(o2.getName());
	    }

	};
	System.out.println("by Name:");
	this.printEmployeesSortedBy(comparator);
    }
}

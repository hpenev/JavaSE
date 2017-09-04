package departments;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import employees.Employee;

public class Department {
    public enum DepartmentType {
	HR, FINANCE, ACCOUNTING, MANAGMENT, ADVERTICEMENT
    }

    private String name;

    private HashSet<Employee> employees;

    public Department(DepartmentType type) {
	this.name = type.toString();
	this.employees = new HashSet<>();
    }
    public void addEmployee(Employee employee) {
	this.employees.add(employee);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Department other = (Department) obj;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	return true;
    }

    public void fireEmployee(Employee worstEmp) {
	this.employees.remove(worstEmp);
    }

    public Set<Employee> getEmployees() {
	return Collections.unmodifiableSet(this.employees);
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
    }

    public int incorrectDocuments() {
	int incorrectDocuments = 0;
	for (Employee employee : employees) {
	    incorrectDocuments += employee.getIncorrectDocuments();
	}

	return incorrectDocuments;
    }

    @Override
    public String toString() {
	return "Department [name=" + name + "]";
    }

}

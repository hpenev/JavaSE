package additionalTasks;

import java.util.Map;
import java.util.TreeMap;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private int id;
    private static int uniqueID = 1;
    private TreeMap<Integer, Double> salaryMonthly;

    public int getAge() {
	return age;
    }

    public double getSalary() {
	return salary;
    }

    public String getName() {
	return name;
    }

    public int getId() {
	return id;
    }

    public Employee(String name, int age, double salary) {
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.id = uniqueID++;
	this.salaryMonthly = generateSalaryMonthly();
    }

    private TreeMap<Integer, Double> generateSalaryMonthly() {
	TreeMap<Integer, Double> salaryMonthly = new TreeMap<>();
	for (int i = 0; i < 12; i++) {
	    salaryMonthly.put(i + 1, null);
	}
	return salaryMonthly;
    }

    public void setSalary(int month) {
	if (this.salaryMonthly.get(month) == null) {
	    this.salaryMonthly.put(month, this.salary);
	}
    }

    public void printMonthlySalaries() {
	System.out.println("********************");
	System.out.println(this.name);
	for (Map.Entry<Integer, Double> entry : salaryMonthly.entrySet()) {
	    System.out.println(entry.getKey() + "->" + entry.getValue());
	}
    }

    @Override
    public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", id=" + id + "]";
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Employee other = (Employee) obj;
	if (id != other.id)
	    return false;
	return true;
    }

}

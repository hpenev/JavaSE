package homework;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
	Person[] hora = new Person[10];

	Random random = new Random();

	for (int i = 0; i < hora.length; i++) {
	    hora[i] = new Person("Person" + (i + 1), random.nextInt(50) + 10, random.nextBoolean());
	}

	Person persona1 = new Person("Persona1", 21, false);
	Person persona2 = new Person("Persona2", 33, true);
	Student student1 = new Student("Student1", 20, true, 4.5);
	Student student2 = new Student("Student2", 20, false, 5.5);
	Employee employee1 = new Employee("Employee1", 20, false, 100.00);
	Employee employee2 = new Employee("Employee2", 20, false, 200.00);

	Person[] somePeople = { persona1, persona2, student1, student2, employee1, employee2 };
	for (int i = 0; i < somePeople.length; i++) {
	    somePeople[i].howPersonInfo();
	}

	for (int i = 0; i < somePeople.length; i++) {
	    if (somePeople[i] instanceof Employee) {
		Employee employee = (Employee) (somePeople[i]);
		System.out.println(employee.calculateOvertime(2));
	    }
	}

    }
}

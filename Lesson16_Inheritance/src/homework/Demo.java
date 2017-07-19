package homework;

public class Demo {
    public static void main(String[] args) {
	Person[] hora = new Person[10];

	Person persona1 = new Person("Persona1", 21, false);
	Person persona2 = new Person("Persona2", 33, true);
	Student student1 = new Student("Student1", 20, true, 4.5);
	Student student2 = new Student("Student2", 20, false, 5.5);
	Employee employee1 = new Employee("Employee1", 20, false, 2000.00);
	Employee employee2 = new Employee("Employee2", 20, false, 2000.00);

	hora[0] = persona1;
	hora[1] = persona2;
	hora[2] = student1;
	hora[3] = student2;
	hora[4] = employee1;
	hora[5] = employee2;

	System.out.println(hora[0].getClass().getName());

	for (int i = 0; i < hora.length; i++) {
	    if (hora[i] == null) {
		continue;
	    }
	    if (hora[i].getClass().getName().equals("Person")) {
		hora[i].howPersonInfo();
	    }
	    if (hora[i].getClass().getName().equals("Student")) {

	    }
	    if (hora[i].getClass().getName().equals("Employee")) {

	    }
	}
    }
}

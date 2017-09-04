package demo;

import java.util.Random;

import company.Companty;
import departments.Department.DepartmentType;
import documents.Document;
import documents.OrdinaryDocument;
import documents.SecretDocument;

public class Demo {
    public static void main(String[] args) {

	Companty companty = new Companty("Talanti accounting");

	for (int i = 0; i < 4; i++) {
	    companty.setEmployee(randomName(), DepartmentType.HR);
	}

	for (int i = 0; i < 4; i++) {
	    companty.setEmployee(randomName(), DepartmentType.ACCOUNTING);
	}

	for (int i = 0; i < 4; i++) {
	    companty.setEmployee(randomName(), DepartmentType.ADVERTICEMENT);
	}

	for (int i = 0; i < 4; i++) {
	    companty.setEmployee(randomName(), DepartmentType.FINANCE);
	}

	for (int i = 0; i < 4; i++) {
	    companty.setEmployee(randomName(), DepartmentType.MANAGMENT);
	}

	for (int i = 1; i <= 50; i++) {
	    Document document = null;
	    String name = "Task" + i;
	    if (new Random().nextBoolean()) {
		document = new OrdinaryDocument(name);
	    } else {
		int randomNumber = new Random().nextInt(10) + 1;
		document = new SecretDocument(name, name + randomNumber);
	    }
	    companty.processDocument(document);
	}

    }

    public static String randomName() {

	String[] names = { "Noah", "Liam", "William", "Mason", "James", "Benjamin", "Jacob", "Michael", "Elijah",
		"Ethan", "Alexander", "Oliver", "Daniel", "Lucas", "Matthew", "Aiden", "Jackson", "Logan", "David",
		"Joseph" };
	return names[new Random().nextInt(names.length)];
    }
}

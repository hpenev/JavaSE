package employees;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import departments.Department;
import documents.Document;

public abstract class Employee {

    private static int UNIQUE_ID = 1;
    private String name;
    private int id;
    private int incorrectDocuments;
    protected double sallary;
    private HashSet<Document> processedDocuments;
    protected int stepenNaEmployee;
    protected Department department;
    protected int rank;

    public int getRank() {
	return rank;
    }

    public int getIncorrectDocuments() {
	return incorrectDocuments;
    }

    public double getSallary() {
	return sallary;
    }

    public String getName() {
	return name;
    };

    public Set<Document> getProcessedDocuments() {
	return Collections.unmodifiableSet(this.processedDocuments);
    }

    public Employee(String name, Department department) {
	// TODO: validations
	this.name = name;
	this.department = department;
	this.id = Employee.UNIQUE_ID++;
	this.processedDocuments = new HashSet<>();
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

    @Override
    public String toString() {
	return "Employee [name=" + name + ", id=" + id + "]";
    }

    public void processDocument(Document document) {
	// TODO: refactor
	System.out.println(this.name + " obrabotva " + document.getName());

	if (document.isSecret()) {
	    if (this.isSenior()) {
		int chanseInvalidPassword = new Random().nextInt(100) + 1;
		if (chanseInvalidPassword < 20) {
		    this.addProcessedDocument(document, true);
		    return;
		} else {
		    this.addProcessedDocument(document, false);
		    return;
		}
	    } else {
		System.out.println("Cannot procces secret documents");
		return;
	    }
	} else {
	    double mistakeChance = this.stepenNaEmployee / document.getDifficulty();
	    if (mistakeChance > 0.5) {
		this.addProcessedDocument(document, true);
		return;
	    } else {
		this.addProcessedDocument(document, false);
		return;
	    }
	}
    }

    private void addProcessedDocument(Document d, boolean isIncorrect) {
	d.setMistaken(isIncorrect);
	if (isIncorrect) {
	    this.incorrectDocuments++;
	}
	this.processedDocuments.add(d);
    }

    public void showProcessedDocuments() {
	System.out.println("Obraboteni documenti: " + this.processedDocuments.size());
	System.out.println("Sgresheni documenti: " + this.incorrectDocuments);
	System.out
		.println(
			"Pravilno obraboteni documenti: " + (this.processedDocuments.size() - this.incorrectDocuments));
    }

    public void showIncorrectProcessedDocuments() {
	TreeSet<Document> documents = new TreeSet<>(
		(o1, o2) -> o1.getName().compareTo(o2.getName()));
	for (Document document : documents) {
	    if (document.isMistaken()) {
		documents.add(document);
	    }
	}

	System.out.println(documents);

    }

    public boolean isJunior() {
	return false;
    }

    public boolean isRegular() {
	return false;
    }

    public boolean isSenior() {
	return false;
    }

}

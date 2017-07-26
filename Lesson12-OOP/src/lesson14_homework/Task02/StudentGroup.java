package lesson14_homework.Task02;

public class StudentGroup {
    private String groupSubject;
    private Student[] students;
    private int freePlaces;

    StudentGroup() {
	this.students = new Student[5];
	this.freePlaces = 5;
    }

    StudentGroup(String subject) {
	this();
	setGroupSubject(subject);
    }

    private void setGroupSubject(String groupSubject) {
	if (groupSubject != null && !groupSubject.isEmpty()) {
	    this.groupSubject = groupSubject;
	}
    }

    void addStudent(Student s) {
	if (this.freePlaces > 0) {
	    for (int i = 0; i < this.students.length; i++) {
		if (students[i] == null) {
		    students[i] = s;
		    break;
		}
	    }
	    this.freePlaces--;
	} else {
	    System.out.println("Group is full");
	}
    }

    void emptyGroup() {
	this.students = new Student[5];
	this.freePlaces = 5;
    }

    String theBestStudent() {
	double maxGrade = 0;
	int bestStudentIndex = 0;

	if (this.freePlaces != 5) {
	    for (int i = 0; i < students.length; i++) {
		if (this.students[i] == null) {
		    // continue;
		    break;
		}

		if (this.students[i].getGrade() > maxGrade) {
		    maxGrade = this.students[i].getGrade();
		    bestStudentIndex = i;
		}
	    }
	    return this.students[bestStudentIndex].getName();
	} else {
	    return "Group is empty";
	}

    }

    void printStudentsInGroup() {
	if (this.freePlaces != 5) {
	    for (int i = 0; i < students.length; i++) {
		if (this.students[i] != null) {
		    System.out.print(i + 1 + ": ");
		    System.out.print(this.students[i].getName() + " ");
		    System.out.print(this.students[i].getGrade());
		} else {
		    break;
		}
		System.out.println();
	    }
	} else {
	    System.out.println("Group is empty");
	}
    }

}

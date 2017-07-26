package lesson14_homework.Task02;

public class College {
    public static void main(String[] args) {
	Student s1 = new Student("Misho", "Math", 22);
	Student s2 = new Student("Gosho", "Math", 22);
	Student s3 = new Student("Pesho", "Math", 22);

	s1.setGrade(5.00);
	s2.setGrade(5.50);
	s3.setGrade(6.00);

	s1.receiveScholership(3, 150.00);
	s2.receiveScholership(4, 150.00);
	s3.receiveScholership(5, 150.00);

	s3.upYear();

	StudentGroup mathGroup = new StudentGroup("Math");
	mathGroup.addStudent(s1);
	mathGroup.addStudent(s2);
	mathGroup.addStudent(s3);

	System.out.println(mathGroup.theBestStudent());
	mathGroup.printStudentsInGroup();

	mathGroup.emptyGroup();

	System.out.println(mathGroup.theBestStudent());
	mathGroup.printStudentsInGroup();
    }
}

package com.college;

public class CollegeManagementResource {

	public static void main(String[] args) {
		StudentRepository studentRepositoryObject = new StudentRepository();
		studentRepositoryObject.addNewStudent(new Student(1,"Abhyudai","Singh",'A'));
		studentRepositoryObject.addNewStudent(new Student(2,"Aditya","Singh",'B'));
		studentRepositoryObject.addNewStudent(new Student(3,"Tushar","Singh",'C'));
		studentRepositoryObject.addNewStudent(new Student(4,"Abhijeet","Singh",'B'));
		studentRepositoryObject.addNewStudent(new Student(5,"Vishal","Singh",'A'));
		studentRepositoryObject.addNewStudent(new Student(6,"Tebogo","Assagai",'B'));
		studentRepositoryObject.addNewStudent(new Student(7,"Godwin","Tanaka",'D'));
		studentRepositoryObject.addNewStudent(new Student(8,"Samuel","Komane",'C'));
		studentRepositoryObject.addNewStudent(new Student(9,"Ram","Rai",'C'));
		studentRepositoryObject.addNewStudent(new Student(10,"Kajal","Saxena",'C'));
		System.out.println( studentRepositoryObject.findAllStudents()+"\n===============================================");
		System.out.println(studentRepositoryObject.findGradeForStudent(3)+"\n===============================================");
		studentRepositoryObject.printStudentsByGrade();
		System.out.println("\n=================================================================");
		studentRepositoryObject.deleteStudent(1);
		System.out.println( studentRepositoryObject.findAllStudents()+"\n===============================================");

	}

}

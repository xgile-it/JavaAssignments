package com.college;
import java.util.List;

public interface StudentService {
	void addNewStudent(Student student);
	List<Student> deleteStudent(int id);
	List<Student> findAllStudents();
	char findGradeForStudent(int studentId);
	void printStudentsByGrade();
}
//1. Add new students
//2. Remove student
//3. Find grade for a particular student
//4. Sort and print student by their grades
//5. List all students
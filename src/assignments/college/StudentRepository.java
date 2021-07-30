package assignments.college;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRepository implements StudentService{
	
	@Override
	public void addNewStudent(Student student) {
		studentList.add(student);
	}
	
	@Override
	public List<Student> deleteStudent(int id) {
		int getIndex = 0 ;
		for(int j=0;j<studentList.size();j++)
		{
			if(studentList.get(j).studentId==id) {
				getIndex= j;
				break;
			}
		}
		studentList.remove(getIndex);
		return studentList;
	}
	
	public static List<Student> studentList = new ArrayList<>();
	@Override
	public List<Student> findAllStudents() {
		return studentList;
	}

	@Override
	public char findGradeForStudent(int studentId) {
		char studentGrade = 0;
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).studentId==studentId) {
				studentGrade = studentList.get(i).grade;
				break;
			}
		}
		return studentGrade;
	}

	@Override
	public void printStudentsByGrade() {
		Collections.sort(studentList);
		System.out.println(studentList.toString());
	}

}

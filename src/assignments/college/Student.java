package assignments.college;

import java.util.Objects;

public class Student implements Comparable<Student>{
	int studentId;
	String firstName;
	String lastName;
	char grade;
	
	public Student(int studentId, String firstName, String lastName, char grade) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, grade, lastName, studentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(firstName, other.firstName) && grade == other.grade
				&& Objects.equals(lastName, other.lastName) && studentId == other.studentId;
	}
	@Override
	public String toString() {
		return "StudentDetail [studentId= " + studentId + ", firstName= " + firstName + ", lastName= " + lastName
				+ ", grade= " + grade + "]";
	}
	@Override
	public int compareTo(Student obj) {
		return this.grade-obj.grade;
	}
	
}

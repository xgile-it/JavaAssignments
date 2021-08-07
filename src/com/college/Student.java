package com.college;
import java.io.Serializable;

public class Student implements Serializable{
	private static final long serialVersionUID = 3149592294839718634L;
	
	int studentId;
	String firstName;
	String lastName;
	int age;
	int phoneNumber;
	String city;
	char grade;

	public Student(int studentId, String firstName, String lastName, int age, int phoneNumber, String city, char grade) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.grade = grade;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int phoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(int mobileNum) {
		this.phoneNumber = mobileNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	public boolean equals(Object obj) {
		Student studentDetails = (Student) obj;
		return (studentId == studentDetails.studentId);
	}

	@Override
	public String toString() {
		return "StudentDetails [Student Id = " + studentId + ", First Name = " + firstName + ", Last Name = " + lastName
				+ ", Age = " + age + ", Phone Number = " + phoneNumber + ", City = " + city + ", Grade = " + grade + "]";
	}

}
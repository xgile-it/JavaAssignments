package com.xgileit.learning.student.Entity;
import javax.persistence.*;


@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int studentId;

    @Column(name="name")
    private String studentName;

    @Column(name="phone")
    private String studentPhoneNo;

    @Column(name="city")
    private String studentCity;

    public int getStudentId() {

        return studentId;
    }
    public void setStudentId(int studentId) {

        this.studentId = studentId;
    }
    public String getStudentName() {

        return studentName;
    }
    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }
    public String getStudentPhoneNo() {

        return studentPhoneNo;
    }
    public void setStudentPhoneNo(String studentPhoneNo) {

        this.studentPhoneNo = studentPhoneNo;
    }
    public String getStudentCity() {

        return studentCity;
    }
    public void setStudentCity(String studentCity) {

        this.studentCity = studentCity;
    }
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentPhoneNo=" + studentPhoneNo
                + ", studentCity=" + studentCity + "]";
    }
    public static boolean isPresent() {

        return false;
    }
}
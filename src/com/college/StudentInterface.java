package com.college;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public interface StudentInterface {
    
    Set<Student> findAllStudents();
    void addNewStudent(Student students);
    
    Set<CourseDetails> findAllCourse();
    void addNewCourse(CourseDetails courseDetail);
    
    
    void registerCourseForStudent(Student studDetails,CourseDetails courseDetails);
    HashMap<Student, CourseDetails> findAllRegistartion();
    
    List<Student> CourseDetails (int CourseId);
    CourseDetails StudentDetails (int studentId);
}

package com.college;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class CollegeRecords implements StudentInterface {

	// set for student
	Set<Student> studentList = new HashSet<>();
	// set for course
	Set<CourseDetails> courseList = new HashSet<>();
	// Map to configure student with course
	HashMap<Student, CourseDetails> studentCourseMap = new HashMap<Student, CourseDetails>();

	@Override
	public Set<Student> findAllStudents() {
		return studentList;
	}

	@Override
	public void addNewStudent(Student studentObj) {
		studentList.add(studentObj);
	}

	@Override
	public Set<CourseDetails> findAllCourse() {
		return courseList;
	}

	@Override
	public void addNewCourse(CourseDetails courseDetail) {
		courseList.add(courseDetail);
	}
	
	@Override
	public void registerCourseForStudent(Student studDetails, CourseDetails courseDetails) {
		studentCourseMap.put(studDetails,courseDetails);
	}

	@Override
	public HashMap<Student, CourseDetails> findAllRegistartion() {
		return studentCourseMap;
	}

	@Override
	public List<Student> CourseDetails(int CourseId) {
		List<Student> studentList = new ArrayList<Student>();
		for(Entry<Student, CourseDetails> studMap : studentCourseMap.entrySet()) {
				if(studMap.getValue().courseId == CourseId) {
					studentList.add(studMap.getKey());
				}
		}
		return studentList;
	}

	@Override
	public CourseDetails StudentDetails(int studentId) {
		CourseDetails couseDetails = null;
		for(Entry<Student, CourseDetails> studMap : studentCourseMap.entrySet()) {
			if(studMap.getKey().studentId == studentId) {
				couseDetails = new CourseDetails(studMap.getValue().getCourseId(), studMap.getValue().getCourseName(), studMap.getValue().getCourseDuration(),studMap.getValue().getSubjectsName());
			}
	}
		return couseDetails;
	}
	
}



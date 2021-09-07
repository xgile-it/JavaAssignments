package com.xgileit.learning.student.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.xgileit.learning.student.Entity.Student;
import com.xgileit.learning.student.Repository.StudentRepository;

@RestController
@RequestMapping(value = "/api/v1")
public class StudentController {

    @Autowired
    StudentRepository studentRepo;

    @GetMapping(value="/getStudentRecords")
    public ResponseEntity<List<Student>> getAllStudentRecords(){
        List<Student> studentList = new ArrayList<>();
        try {
            studentList= studentRepo.findAll();

        }
        catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
    @GetMapping(value="/getStudentInfoById/{id}")
    public ResponseEntity<Student> getStudentInfoById(@PathVariable("id") int id){
        Optional<Student> studentInfo = studentRepo.findById(id);
        if(studentInfo.isPresent())
            return new ResponseEntity<>(studentInfo.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping(value="/createStudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        try {
            Student Student_student = studentRepo
                    .save(student);
            return new ResponseEntity<>(Student_student, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
        Optional<Student> studentData = studentRepo.findById(id);

        if (studentData.isPresent()) {
            student.setStudentName(student.getStudentName());
            student.setStudentPhoneNo(student.getStudentPhoneNo());
            student.setStudentCity(student.getStudentCity());
            return new ResponseEntity<>(studentRepo.save(student), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/student/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") int id) {
        try {
            studentRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteStudentList")
    public ResponseEntity<HttpStatus> deleteAllStudent() {
        try {
            studentRepo.deleteAll();
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}


package com.xgileit.learning.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xgileit.learning.student.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
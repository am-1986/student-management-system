package com.javaproject.studentmanagementsystem.repository;

import com.javaproject.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

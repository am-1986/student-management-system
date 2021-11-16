package com.javaproject.studentmanagementsystem;

import com.javaproject.studentmanagementsystem.entity.Student;
import com.javaproject.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }


    private final StudentRepository studentRepository;

    @Autowired
    public StudentManagementSystemApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Student student1 = new Student("Priyanshi", "Pattanaik", "priyanshi@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("Anushka", "Sharma", "anushka@gmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("Tony", "Stark", "tonystark@gmail.com");
        studentRepository.save(student3);
    }
}

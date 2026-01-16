package com.example.fer.example_v2.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {

    //Post
    Student save(Student s);

    //Get
    List<Student> findAllStudents();

    //Get
    Student findByEmail(String email);

    //Path
    Student update(Student s);

    //Delete
    void delete(String email);

}

package com.example.fer.example_v2.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Fernando",
                        "Obando",
                        LocalDate.now(),
                        "fer.exmaple@.com",
                        21
                )
        );
    }


}

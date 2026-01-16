package com.example.fer.example_v2.student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(
            @Qualifier("DBStudentService") StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student save(
            @RequestBody Student student
    ){
        return studentService.save(student);
    }

    @GetMapping("{email}")
    public Student findByEmail(
        @PathVariable String email
    ){
        return studentService.findByEmail(email);
    }

    @PutMapping
    public Student updateStudent(
            @RequestBody Student student
    ){
        return studentService.update(student);
    }

    @DeleteMapping("{email}")
    public void delete(
            @PathVariable String email
    ){
        studentService.delete(email);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

}

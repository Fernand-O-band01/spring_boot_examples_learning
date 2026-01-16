package com.example.fer.example_v2.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentInMemoryService implements StudentService{

    private final inMemoryStudentDao dao;

    public StudentInMemoryService(inMemoryStudentDao dao) {
        this.dao = dao;
    }



    @Override
    public Student save(Student s) {
        return this.dao.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();

    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }
}

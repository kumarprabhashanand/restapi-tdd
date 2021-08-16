package com.tdd.restapitdd.dao;

import com.tdd.restapitdd.model.Student;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StudentDao {

    private static Student student = new Student(
            "John",
            "McClane",
            1123,
            "123 St, Nyc");

    public List<Student> getAllStudents() {
        return Arrays.asList(student);
    }

}

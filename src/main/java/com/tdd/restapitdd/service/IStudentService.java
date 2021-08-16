package com.tdd.restapitdd.service;

import com.tdd.restapitdd.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService {

    List<Student> getAllStudents();

}

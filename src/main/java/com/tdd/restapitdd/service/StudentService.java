package com.tdd.restapitdd.service;

import com.tdd.restapitdd.dao.StudentDao;
import com.tdd.restapitdd.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }


}

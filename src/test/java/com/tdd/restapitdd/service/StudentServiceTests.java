package com.tdd.restapitdd.service;

import com.tdd.restapitdd.dao.StudentDao;
import com.tdd.restapitdd.model.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(SpringExtension.class)
@ContextConfiguration
public class StudentServiceTests {

    @MockBean
    StudentDao studentDao;

    @Autowired
    IStudentService studentService;

    @Configuration
    public static class Config {
        @Bean
        public IStudentService getStudentService() {
            return new StudentService();
        }
    }


    @Test
    void getAllStudentsTest() {
        Student student = new Student(
                "Ryan",
                "Fury",
                4321,
                "RedView Towers");
        given(studentDao.getAllStudents())
                .willReturn(Arrays.asList(student));
        assertEquals(Arrays.asList(student), studentService.getAllStudents());
    }

}

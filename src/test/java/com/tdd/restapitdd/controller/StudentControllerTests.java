package com.tdd.restapitdd.controller;

import com.tdd.restapitdd.model.Student;
import com.tdd.restapitdd.service.IStudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = StudentController.class)
@ExtendWith(SpringExtension.class)
public class StudentControllerTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    IStudentService studentService;

    @Test
    void getAllStudentsTest() throws Exception {
        given(studentService.getAllStudents())
                .willReturn(Arrays.asList(new Student(
                "Nik",
                "Devou",
                1234,
                "Eden Villa"))
                );
        mockMvc.perform(get("/api/students"))
                .andExpect(status().is2xxSuccessful())
        .andExpect(jsonPath("$").isArray())
        .andExpect(jsonPath("$[*].studentId").value(1234));
        verify(studentService).getAllStudents();
    }

}

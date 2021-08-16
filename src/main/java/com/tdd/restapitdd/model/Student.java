package com.tdd.restapitdd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String firstName;

    private String lastName;

    private Integer studentId;

    private String address;

}

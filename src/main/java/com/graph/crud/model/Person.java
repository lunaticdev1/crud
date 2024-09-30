package com.graph.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private Integer id;
    private String firstName;
    private String lastName;
    private String social;
    private Integer age;
    private Car car;
}

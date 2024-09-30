package com.graph.crud.controller;

import com.graph.crud.model.Person;
import com.graph.crud.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    Service service;

    @QueryMapping
    public List<Person> findAll(){
        service.addToList();
        return service.getAllPersons();
    }

    @QueryMapping
    public Person findById(@Argument Integer id){
        service.addToList();
        return service.getPersonById(id);
    }
}

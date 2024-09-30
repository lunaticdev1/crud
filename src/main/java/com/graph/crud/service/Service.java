package com.graph.crud.service;

import com.graph.crud.model.Car;
import com.graph.crud.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@org.springframework.stereotype.Service
public class Service {

    List<Person> list = new ArrayList<>();

    public void addToList(){
        list.add(new Person(1,"pichai","sundai","1",28, Car.HONDA));
        list.add(new Person(2,"robert","reddy","1",28, Car.MAZDA));
        list.add(new Person(3,"kristen","stevens","1",28, Car.TOYOTA));
        list.add(new Person(4,"sam","altman","1",28, Car.HONDA));
        list.add(new Person(5,"sundar","ramswamy","1",28, Car.TOYOTA));

    }

    public List<Person> getAllPersons(){
        return list;
    }

    public Person getPersonBySocial(String social){
        return list.stream()
                .filter(x -> x.getSocial().equals(social))
                .findAny()
                .orElse(null);
    }

    public Person getPersonById(int id){
        return list.stream()
                .filter(x -> Objects.equals(x.getId(), id))
                .findAny()
                .orElse(null);
    }

    public Person modifyInformation(Integer id, Integer age, Car car){
        Person oldInformation = this.getPersonById(id);
        if (oldInformation != null){
            int index = list.indexOf(oldInformation);
            oldInformation.setAge(age);
            oldInformation.setCar(car);
            list.set(index, oldInformation);
        }else{
            throw new IllegalArgumentException("not found");
        }
        return oldInformation;
    }

}

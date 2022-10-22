package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonDao {

    int insertPerson(Person person);

    default int addPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(person);
    }

    int insertPerson(UUID id, Person person);
}

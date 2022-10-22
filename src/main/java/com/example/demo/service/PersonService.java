package com.example.demo.service;

import com.example.demo.dao.FakePersonDataAccessService;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final FakePersonDataAccessService fakePersonDataAccessService;

    @Autowired
    public PersonService(FakePersonDataAccessService fakePersonDataAccessService ) {
        this.fakePersonDataAccessService = fakePersonDataAccessService;
    }
    public void addPerson(Person person){
        fakePersonDataAccessService.insertPerson(person);
    }

}

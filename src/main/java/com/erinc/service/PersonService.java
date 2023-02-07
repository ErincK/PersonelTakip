package com.erinc.service;

import com.erinc.repository.PersonRepository;
import com.erinc.repository.entity.Person;
import com.erinc.utility.MyFactoryService;

public class PersonService extends MyFactoryService<PersonRepository, Person, Long> {
    public PersonService(){
        super(new PersonRepository());
    }
}

package com.erinc.repository;

import com.erinc.repository.entity.Person;
import com.erinc.utility.MyFactoryRepository;

public class PersonRepository extends MyFactoryRepository<Person, Long> {
    public PersonRepository(){
        super(new Person());
    }



}
